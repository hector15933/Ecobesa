package com.example.ecobesa.controllers;

import java.util.Locale;
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

import com.example.ecobesa.entity.Cargo;



@Controller
@RequestMapping("/admin")
public class CargoController {
	@Autowired
	private com.example.ecobesa.service.ICargoService cargoService;
	
	@GetMapping(value="/cargo/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "Cargos de trabajo / Editar cargos");
		model.addAttribute("titulo2", "Agregar Cargo de trabajo");
		model.addAttribute("cargos",cargoService.findAll(Sort.by("id")));
		
		Cargo cargo = new Cargo();
		
		model2.put("cargo", cargo);
		model2.put("titulo3", "Crear Cargo de Trabajo");
				
		return "admin/cargo/listar";
	}
	
	@PostMapping(value="/cargo/listar")
	public String guardar(@Valid Cargo cargo ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "Cargos de trabajo / Editar cargos");
			model.addAttribute("titulo2", "Agregar Cargo de trabajo");
			model.addAttribute("cargos",cargoService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear Cargo de Trabajo");
			
			return "admin/cargo/listar";
		}
		flash.addFlashAttribute("success", "Cargo creado correctamente");
		cargoService.save(cargo);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/cargo/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("cargos",cargoService.findAll(Sort.by("id")));
		Cargo cargo=null;
		if(id>0){
			cargo = cargoService.findById(id);
		}else {
			return "redirect:/admin/cargo/listar";
		}
		model2.put("cargo",cargo);
		flash.addFlashAttribute("success", "Cargo Editado correctamente");
		model.addAttribute("titulo", "Cargos de trabajo / Editar cargos");
		model2.put("titulo2","Editar Cargo de trabajo");
		model2.put("titulo3", "Editar Cargo de Trabajo");
		
		
		return "admin/cargo/listar";
	}
	@GetMapping(value="/cargo/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				Cargo cargo=cargoService.findById(id);
				cargoService.delete(id);
				flash.addFlashAttribute("success", "Cargo eliminado correctamente");
			}
			return "redirect:/admin/cargo/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El cargo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/admin/cargo/listar";
		}
		
	}
}
