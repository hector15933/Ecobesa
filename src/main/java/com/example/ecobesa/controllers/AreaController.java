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

import com.example.ecobesa.entity.Area;
import com.example.ecobesa.service.IAreaService;
import com.example.ecobesa.service.ISedeService;



@Controller
@RequestMapping("/admin")
public class AreaController {
	
	@Autowired
	private IAreaService areaService;
	
	@Autowired ISedeService sedeService;

	@GetMapping(value="/area/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "Areas de trabajo / Editar areas");
		model.addAttribute("titulo2", "Agregar Area de trabajo");
		model.addAttribute("sedes", sedeService.findAll(Sort.by("id")));
		model.addAttribute("areas",areaService.findAll(Sort.by("id")));
		
		Area area = new Area();
		
		model2.put("area", area);
		model2.put("titulo3", "Crear Area de Trabajo");
				
		return "admin/area/listar";
	}
	
	@PostMapping(value="/area/listar")
	public String guardar(@Valid Area area ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "Areas de trabajo / Editar areas");
			model.addAttribute("titulo2", "Agregar Area de trabajo");
			model.addAttribute("areas",areaService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear Area de Trabajo");
			
			return "admin/area/listar";
		}
		flash.addFlashAttribute("success", "Area creado correctamente");
		areaService.save(area);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/area/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("areas",areaService.findAll(Sort.by("id")));
		model.addAttribute("sedes", sedeService.findAll(Sort.by("id")));
		Area area=null;
		if(id>0){
			area = areaService.findById(id);
		}else {
			return "redirect:/admin/area/listar";
		}
		model2.put("area",area);
		flash.addFlashAttribute("success", "Area Editado correctamente");
		model.addAttribute("titulo", "Areas de trabajo / Editar areas");
		model2.put("titulo2","Editar Area de trabajo");
		model2.put("titulo3", "Editar Area de Trabajo");
		
		
		return "admin/area/listar";
	}
	@GetMapping(value="/area/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				Area area=areaService.findById(id);
				areaService.delete(id);
				flash.addFlashAttribute("success", "Area eliminado correctamente");
			}
			return "redirect:/admin/area/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El area no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/admin/area/listar";
		}
		
	}
}
