package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.ecobesa.entity.TipoRiesgo;
import com.example.ecobesa.service.ITipoRiesgoService;

@Controller
@SessionAttributes("tipoRiesgo")
public class TipoRiesgosController {
	
	
	
	@Autowired
	private ITipoRiesgoService tipoRiesgoService;
	
	
	
	@GetMapping(value="tipo-riesgos/tipo-riesgos")
	public String listar(Model model,Map<String, Object> model2) {				
		return "riesgos/riesgos";
	}
	
	@GetMapping(value="tipo-riesgos/listar",produces = { "application/json" })
	public @ResponseBody List<TipoRiesgo> findAll() {	 
			 List<TipoRiesgo> listas = tipoRiesgoService.findAll();			 		 
		return listas;
	}
	
	
	@RequestMapping(value="tipo-riesgos/form")
	public String crear(Map<String,Object> model) {
		TipoRiesgo tipoRiesgo = new TipoRiesgo();
		model.put("tipoRiesgo", tipoRiesgo);
		model.put("titulo", "Nuevo riesgo");
		return "tipo-riesgo/form";
	}
	
	@RequestMapping(value="tipo-riesgos/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		TipoRiesgo tipoRiesgo = null;
		
		if(id>0) {
			tipoRiesgo = tipoRiesgoService.findById(id);
			if(tipoRiesgo==null) {
				flash.addFlashAttribute("error", "el id del riesgo no puede ser cero!");
				return "redirect:riesgos/riesgos";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la riesgo no puede ser cero!");
			return "redirect:/tipo-riesgo/riesgo-riesgo";
		}
		
		model.put("tipoRiesgo", tipoRiesgo);
		model.put("titulo", "Editar Tipo Riesgo");
		
		return "tipo-riesgo/form";
	}
	
	
	@RequestMapping(value = "tipo-riesgos/form", method = RequestMethod.POST)
	public String guardar(@Valid TipoRiesgo tipoRiesgo,BindingResult result, Model model,
			RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Riesgos");
			return "riesgos/form";
		}
		String mensajeFlash = (tipoRiesgo.getId()!=null) ? "Datos  editado con Exito" : "Creada con exito!";
		tipoRiesgoService.save(tipoRiesgo);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return "redirect:/riesgos/riesgos";
	}
	
	@GetMapping(value="/tipo-riesgos/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				TipoRiesgo tipoRiesgo=tipoRiesgoService.findById(id);
				tipoRiesgoService.delete(id);
				flash.addFlashAttribute("success", "Tipo Riesgo eliminado correctamente");
			}
			return "redirect:/riesgos/riesgoss";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El riesgo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/riesgos/riesgos";
		}
		
	}
	
	
}
