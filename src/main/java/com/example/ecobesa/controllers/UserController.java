package com.example.ecobesa.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.entity.User;
import com.example.ecobesa.service.ICargoService;
import com.example.ecobesa.service.IRoleService;
import com.example.ecobesa.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	@Autowired
	private ICargoService cargoService;
	@Autowired
	private IRoleService rolService;
	
	@GetMapping("/admin/usuarios")
	public String index(Model model) {
		model.addAttribute("users", userService.findAll(Sort.by(Sort.Direction.DESC, "id")));
		return "usuario/index";
	}
	
	@GetMapping(value = "/admin/usuarios/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "usuario/show";
	}
	
	@GetMapping(value = "/admin/usuarios/crear")
	public String create(Map<String, Object> model) {
		User user = new User();
		model.put("user", user);
		model.put("cargos", cargoService.findAll());
		model.put("roles", rolService.findAll());
		model.put("titulo", "Registrar Nuevo Usuario");
		model.put("btn", "Registrar");
		//model.put("users", userService.findAll(Sort.by(Sort.Direction.ASC, "apellidos")));
		return "usuario/form";
	}
	
	@RequestMapping(value="/admin/usuarios/editar/{id}")
	public String editar(@PathVariable(value="id") Long id,Map<String,Object> model) {
		//Validar que el id exista en la tabla usuarios
		User user = userService.findById(id);
		model.put("titulo", "Editar Usuario");
		model.put("user",user);
		model.put("cargos", cargoService.findAll());
		model.put("roles", rolService.findAll());
		model.put("btn","Actualizar");
		//model.put("users", userService.findAll(Sort.by(Sort.Direction.ASC, "apellidos")));
		return "usuario/form";
	}
	
	@PostMapping(value = "/admin/usuarios")
	public String guardar(@Valid User user,BindingResult bindingResult, Model model, RedirectAttributes flash) {
		
		if(bindingResult.hasErrors()){	
			model.addAttribute("user", user);
			model.addAttribute("titulo", "Crear Usuario");
			model.addAttribute("btn", "Guardar");
			return "usuario/form";
		}
		flash.addFlashAttribute("success", "Usuario creado correctamente");
		userService.save(user);
		return "redirect:/admin/usuarios";
	}
	
	@GetMapping(value="/admin/usuarios/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//validar que el id exista en la tabla users
		try {
			userService.delete(id);
			flash.addFlashAttribute("success", "Usuario eliminado correctamente");
			return "redirect:/admin/usuarios";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar el usuario");
			return "redirect:/admin/usuarios";
		}
	}
}
