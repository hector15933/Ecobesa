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

import com.example.ecobesa.entity.TipoDocumento;
import com.example.ecobesa.service.ITipoDocumentoService;
import com.example.ecobesa.service.TipoDocumentoServiceImpl;



@Controller
@RequestMapping("/documento")
public class DocumetoTipo {
	
	@Autowired
	private ITipoDocumentoService tipoDocumentoService;
	
	@GetMapping(value="/tipoDocumento/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "TipoDocumentos de trabajo / Editar tipoDocumentos");
		model.addAttribute("titulo2", "Agregar TipoDocumento de trabajo");
		model.addAttribute("tipoDocumentos",tipoDocumentoService.findAll(Sort.by("id")));
		
		TipoDocumento tipoDocumento = new TipoDocumento();
		
		model2.put("tipoDocumento", tipoDocumento);
		model2.put("titulo3", "Crear TipoDocumento de Trabajo");
				
		return "documento/tipoDocumento/listar";
	}
	
	@PostMapping(value="/tipoDocumento/listar")
	public String guardar(@Valid TipoDocumento tipoDocumento ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "TipoDocumentos de trabajo / Editar tipoDocumentos");
			model.addAttribute("titulo2", "Agregar TipoDocumento de trabajo");
			model.addAttribute("tipoDocumentos",tipoDocumentoService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear TipoDocumento de Trabajo");
			
			return "documento/tipoDocumento/listar";
		}
		flash.addFlashAttribute("success", "TipoDocumento creado correctamente");
		tipoDocumentoService.save(tipoDocumento);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/tipoDocumento/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("tipoDocumentos",tipoDocumentoService.findAll(Sort.by("id")));
		TipoDocumento tipoDocumento=null;
		if(id>0){
			tipoDocumento = tipoDocumentoService.findById(id);
		}else {
			return "redirect:/documento/tipoDocumento/listar";
		}
		model2.put("tipoDocumento",tipoDocumento);
		flash.addFlashAttribute("success", "TipoDocumento Editado correctamente");
		model.addAttribute("titulo", "TipoDocumentos de trabajo / Editar tipoDocumentos");
		model2.put("titulo2","Editar TipoDocumento de trabajo");
		model2.put("titulo3", "Editar TipoDocumento de Trabajo");
		
		
		return "documento/tipoDocumento/listar";
	}
	@GetMapping(value="/tipoDocumento/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				TipoDocumento tipoDocumento=tipoDocumentoService.findById(id);
				tipoDocumentoService.delete(id);
				flash.addFlashAttribute("success", "TipoDocumento eliminado correctamente");
			}
			return "redirect:/documento/tipoDocumento/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El tipoDocumento no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/documento/tipoDocumento/listar";
		}
		
	}
}
