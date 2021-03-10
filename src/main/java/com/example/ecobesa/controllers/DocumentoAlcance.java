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

import com.example.ecobesa.entity.AlcanceDocumento;

@Controller
@RequestMapping("/documento")
public class DocumentoAlcance {
	@Autowired
	private com.example.ecobesa.service.IAlcanceDocumentoService alcanceDocumentoService;
	
	@GetMapping(value="/alcanceDocumento/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "AlcanceDocumentos de trabajo / Editar alcanceDocumentos");
		model.addAttribute("titulo2", "Agregar AlcanceDocumento de trabajo");
		model.addAttribute("alcanceDocumentos",alcanceDocumentoService.findAll(Sort.by("id")));
		
		AlcanceDocumento alcanceDocumento = new AlcanceDocumento();
		
		model2.put("alcanceDocumento", alcanceDocumento);
		model2.put("titulo3", "Crear AlcanceDocumento de Trabajo");
				
		return "documento/alcanceDocumento/listar";
	}
	
	@PostMapping(value="/alcanceDocumento/listar")
	public String guardar(@Valid AlcanceDocumento alcanceDocumento ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "AlcanceDocumentos de trabajo / Editar alcanceDocumentos");
			model.addAttribute("titulo2", "Agregar AlcanceDocumento de trabajo");
			model.addAttribute("alcanceDocumentos",alcanceDocumentoService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear AlcanceDocumento de Trabajo");
			
			return "documento/alcanceDocumento/listar";
		}
		flash.addFlashAttribute("success", "AlcanceDocumento creado correctamente");
		alcanceDocumentoService.save(alcanceDocumento);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/alcanceDocumento/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("alcanceDocumentos",alcanceDocumentoService.findAll(Sort.by("id")));
		AlcanceDocumento alcanceDocumento=null;
		if(id>0){
			alcanceDocumento = alcanceDocumentoService.findById(id);
		}else {
			return "redirect:/documento/alcanceDocumento/listar";
		}
		model2.put("alcanceDocumento",alcanceDocumento);
		flash.addFlashAttribute("success", "AlcanceDocumento Editado correctamente");
		model.addAttribute("titulo", "AlcanceDocumentos de trabajo / Editar alcanceDocumentos");
		model2.put("titulo2","Editar AlcanceDocumento de trabajo");
		model2.put("titulo3", "Editar AlcanceDocumento de Trabajo");
		
		
		return "documento/alcanceDocumento/listar";
	}
	@GetMapping(value="/alcanceDocumento/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				AlcanceDocumento alcanceDocumento=alcanceDocumentoService.findById(id);
				alcanceDocumentoService.delete(id);
				flash.addFlashAttribute("success", "AlcanceDocumento eliminado correctamente");
			}
			return "redirect:/documento/alcanceDocumento/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El alcanceDocumento no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/documento/alcanceDocumento/listar";
		}
		
	}
}
