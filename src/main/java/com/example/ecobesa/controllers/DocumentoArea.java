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

import com.example.ecobesa.entity.AreaDocumento;
import com.example.ecobesa.service.IAreaDocumentoService;

@Controller
@RequestMapping("/documento")
public class DocumentoArea {
	@Autowired
	private IAreaDocumentoService areaDocumentoService;
	
	@GetMapping(value="/areaDocumento/listar")
	public String listar(Model model,Map<String, Object> model2) {
		model.addAttribute("titulo", "AreaDocumentos de trabajo / Editar areaDocumentos");
		model.addAttribute("titulo2", "Agregar AreaDocumento de trabajo");
		model.addAttribute("areaDocumentos",areaDocumentoService.findAll(Sort.by("id")));
		
		AreaDocumento areaDocumento = new AreaDocumento();
		
		model2.put("areaDocumento", areaDocumento);
		model2.put("titulo3", "Crear AreaDocumento de Trabajo");
				
		return "documento/areaDocumento/listar";
	}
	
	@PostMapping(value="/areaDocumento/listar")
	public String guardar(@Valid AreaDocumento areaDocumento ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "AreaDocumentos de trabajo / Editar areaDocumentos");
			model.addAttribute("titulo2", "Agregar AreaDocumento de trabajo");
			model.addAttribute("areaDocumentos",areaDocumentoService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear AreaDocumento de Trabajo");
			
			return "documento/areaDocumento/listar";
		}
		flash.addFlashAttribute("success", "AreaDocumento creado correctamente");
		areaDocumentoService.save(areaDocumento);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/areaDocumento/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("areaDocumentos",areaDocumentoService.findAll(Sort.by("id")));
		AreaDocumento areaDocumento=null;
		if(id>0){
			areaDocumento = areaDocumentoService.findById(id);
		}else {
			return "redirect:/documento/areaDocumento/listar";
		}
		model2.put("areaDocumento",areaDocumento);
		flash.addFlashAttribute("success", "AreaDocumento Editado correctamente");
		model.addAttribute("titulo", "AreaDocumentos de trabajo / Editar areaDocumentos");
		model2.put("titulo2","Editar AreaDocumento de trabajo");
		model2.put("titulo3", "Editar AreaDocumento de Trabajo");
		
		
		return "documento/areaDocumento/listar";
	}
	@GetMapping(value="/areaDocumento/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				AreaDocumento areaDocumento=areaDocumentoService.findById(id);
				areaDocumentoService.delete(id);
				flash.addFlashAttribute("success", "AreaDocumento eliminado correctamente");
			}
			return "redirect:/documento/areaDocumento/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El areaDocumento no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/documento/areaDocumento/listar";
		}
		
	}
}
