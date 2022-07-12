package com.example.ecobesa.controllers;

import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Sede;
import com.example.ecobesa.service.ISedeService;



@Controller
@RequestMapping("/admin")
public class SedeController {
	
	@Autowired
	private ISedeService sedeService;
	
	@GetMapping(value="/sede/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "Sedes de trabajo / Editar sedes");
		model.addAttribute("titulo2", "Agregar Sede de trabajo");
		model.addAttribute("sedes",sedeService.findAll(Sort.by("id")));
		
		Sede sede = new Sede();
		
		model2.put("sede", sede);
		model2.put("titulo3", "Crear Sede de Trabajo");
				
		return "admin/sede/listar";
	}
	
	@PostMapping(value="/sede/listar")
	public String guardar(@Valid Sede sede ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "Sedes de trabajo / Editar sedes");
			model.addAttribute("titulo2", "Agregar Sede de trabajo");
			model.addAttribute("sedes",sedeService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear Sede de Trabajo");
			
			return "admin/sede/listar";
		}
		flash.addFlashAttribute("success", "Sede creado correctamente");
		sedeService.save(sede);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/sede/listar/{id}")
	@PreAuthorize("ROLE_USER")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		try {
			model.addAttribute("sedes",sedeService.findAll(Sort.by("id")));
			Sede sede=null;
			if(id>0){
				sede = sedeService.findById(id);
			}else {
				return "redirect:/admin/sede/listar";
			}
			model2.put("sede",sede);
			flash.addFlashAttribute("success", "Sede Editado correctamente");
			model.addAttribute("titulo", "Sedes de trabajo / Editar sedes");
			model2.put("titulo2","Editar Sede de trabajo");
			model2.put("titulo3", "Editar Sede de Trabajo");	
		}
		catch (Exception e) {
			model.addAttribute("titulo", "Sedes");
		}
		
		
		return "admin/sede/listar";
	}
	@GetMapping(value="/sede/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				Sede sede=sedeService.findById(id);
				sedeService.delete(id);
				flash.addFlashAttribute("success", "Sede eliminado correctamente");
			}
			return "redirect:/admin/sede/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El sede no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/admin/sede/listar";
		}
		
	}
}
