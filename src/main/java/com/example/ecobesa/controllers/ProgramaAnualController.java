package com.example.ecobesa.controllers;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
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

import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.service.IProgramaAnualService;
import com.example.ecobesa.service.IUploadFileService;
import com.example.ecobesa.service.IUserService;


@SessionAttributes("programaAnual")
@Controller
public class ProgramaAnualController {
	
	@Autowired
	private IProgramaAnualService programaAnualService;
	@Autowired
	private IUserService userService;
	
	
	

	
	
	
	@GetMapping("/programaAnual/listar")
	public String listar(Model model) {
		model.addAttribute("programaAnuales", programaAnualService.findAll());
		return "ProgramaAnual";
	}
	
	@GetMapping(value = "/programas-anuales/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		ProgramaAnual programaAnual = programaAnualService.findById(id);
		model.put("programaAnual", programaAnual);
		return "programa-anual/show";
	}
	
	@GetMapping(value = "/programaAnual/form")
	public String crear(Map<String, Object> model) {
		ProgramaAnual programaAnual = new ProgramaAnual();
		model.put("programaAnual", programaAnual);
		model.put("titulo", "Crear Programa Anual");
		model.put("btn", "Registrar");
		model.put("users", userService.findAll(Sort.by(Sort.Direction.ASC, "apellidos")));
		return "programa-anual/form";
	}
	
	@RequestMapping(value="/programaAnual/editar/{id}")
	public String editar(@PathVariable(value="id") Long id,Map<String,Object> model) {
		ProgramaAnual programaAnual=null;
		if(id>0){
			programaAnual = programaAnualService.findById(id);
		}else {
			return "redirect:/programaAnual/listar";
		}
		model.put("titulo", "Editar Programa Anual");
		model.put("programaAnual",programaAnual);
		model.put("btn","Actualizar");
		model.put("users", userService.findAll(Sort.by(Sort.Direction.ASC, "apellidos")));
		return "programa-anual/form";
	}
	
	@PostMapping(value = "/programaAnual/form")
	public String guardar(@Valid ProgramaAnual programaAnual,BindingResult bindingResult, Model model, RedirectAttributes flash) {
		
		if(bindingResult.hasErrors()){	
			model.addAttribute("programaAnual", programaAnual);
			model.addAttribute("titulo", "Crear Programa Anual");
			model.addAttribute("btn", "Guardar");
			return "programa-anual/form";
		}
		flash.addFlashAttribute("success", "Programa Anual creado correctamente");
		programaAnualService.save(programaAnual);
		return "redirect:/programaAnual/listar";
	}
	
	@GetMapping(value="/programaAnual/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		try {
			if (id > 0) {
				programaAnualService.delete(id);
				flash.addFlashAttribute("success", "Programa Anual eliminado correctamente");
			}
			return "redirect:/programaAnual/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("success", "Ocurrió un error al tratar de eliminar el Programa Anual");
			return "redirect:/programaAnual/listar";
		}
	}
	
	@GetMapping(value="programaAnual/ver/{id}")
	public String ver(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("programaAnual",programaAnualService.findById(id));

		return "programa-anual/ver";
	}
	
	
}
