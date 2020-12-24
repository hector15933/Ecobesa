package com.example.ecobesa.controllers;


import java.io.IOException;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.service.IProgramaAnualService;


@SessionAttributes("programaAnual")
@Controller
public class ProgramaAnualController {
	
	@Autowired
	private IProgramaAnualService programaAnualService;
	
	@GetMapping("/programaAnual/listar")
	public String listar(Model model,Map<String,Object> model2) {
		
		model.addAttribute("programaAnuales", programaAnualService.findAll());
		return "ProgramaAnual";
	}
	
	@GetMapping(value = "/programaAnual/form")
	public String crear(Map<String, Object> model) {

		ProgramaAnual programaAnual = new ProgramaAnual();
		model.put("programaAnual", programaAnual);
		model.put("titulo", "Crear ProgramaAnual");
		return "form";
	}
	
	
	@GetMapping(value="/programaAnual/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		
		try {
			if (id > 0) {
				ProgramaAnual programaAnual=programaAnualService.findById(id);
				programaAnualService.delete(id);
			}
			return "redirect:/programaAnual/listar";
		} catch (Exception e) {
			return "redirect:/programaAnual/listar";
		}
		
	}
	
	@PostMapping(value = "/programaAnual/form")
	public String guardar( ProgramaAnual programaAnual, Model model, RedirectAttributes flash) {

		programaAnualService.save(programaAnual);
		return "redirect:/programaAnual/listar";
	}
	
	
	@RequestMapping(value="/programaAnual/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("programaAnual",programaAnualService.findById(id));
		ProgramaAnual programaAnual=null;
		if(id>0){
			programaAnual = programaAnualService.findById(id);
		}else {
			return "redirect:/admin/cargo/listar";
		}
		model2.put("titulo", "Guardar");
		model2.put("programaAnual",programaAnual);
		
		return "form";
	}
	
	
}
