package com.example.ecobesa.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.service.IEmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/admin/empleados")
	public String index(@RequestParam Map<String,Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())-1) : 0;
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Empleado> empleados = empleadoService.findAll(pageRequest);
		int totalPage=empleados.getTotalPages();
		if(totalPage>0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		model.addAttribute("empleados", empleados.getContent());
		model.addAttribute("actualPage", page+1);
		model.addAttribute("totalPage", totalPage);
		return "empleado/index";
	}
	
	/*@GetMapping(value = "/usuarios/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "usuario/show";
	}
	
	@GetMapping(value = "/usuarios/crear")
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
	
	@RequestMapping(value="/usuarios/editar/{id}")
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
	
	@PostMapping(value = "/usuarios")
	public String guardar(@Valid User user,BindingResult bindingResult, Model model, RedirectAttributes flash) {
		
		if(bindingResult.hasErrors()){	
			model.addAttribute("user", user);
			model.addAttribute("titulo", "Crear Usuario");
			model.addAttribute("btn", "Guardar");
			return "usuario/form";
		}
		flash.addFlashAttribute("success", "Usuario creado correctamente");
		userService.save(user);
		return "redirect:/usuarios";
	}
	
	@GetMapping(value="/usuarios/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//validar que el id exista en la tabla users
		try {
			userService.delete(id);
			flash.addFlashAttribute("success", "Usuario eliminado correctamente");
			return "redirect:/usuarios";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar el usuario");
			return "redirect:/usuarios";
		}
	}*/
}
