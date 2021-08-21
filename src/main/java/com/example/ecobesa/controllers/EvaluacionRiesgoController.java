package com.example.ecobesa.controllers;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.EvaluacionRiesgo;
import com.example.ecobesa.service.IEvaluacionRiesgoService;

@Controller
public class EvaluacionRiesgoController {
	
	@Autowired
	private IEvaluacionRiesgoService evaluacionRiesgoService;
	
	@GetMapping(value = "evaluacion-riesgos/evaluacion-riesgos")
	public String listar(Model model,Map<String, Object> model2) {				
		return "riesgos/riesgos";
	}
	
	@GetMapping(value="evaluacion-riesgos/listar",produces = { "application/json" })
	public @ResponseBody List<EvaluacionRiesgo> findAll() {	 
			 List<EvaluacionRiesgo> listas = evaluacionRiesgoService.findAll();			 		 
		return listas;
	}
	
	
	@RequestMapping(value="evaluacion-riesgos/form")
	public String crear(Map<String,Object> model) {
		EvaluacionRiesgo riesgos = new EvaluacionRiesgo();
		model.put("riesgos", riesgos);
		model.put("titulo", "Nuevo riesgo");
		return "tipo-riesgo/form";
	}
	
	@RequestMapping(value="evaluacion-riesgos/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		EvaluacionRiesgo riesgo = null;
		
		if(id>0) {
			riesgo = evaluacionRiesgoService.findById(id);
			if(riesgo==null) {
				flash.addFlashAttribute("error", "el id del riesgo no puede ser cero!");
				return "redirect:riesgos/riesgos";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la riesgo no puede ser cero!");
			return "redirect:/tipo-riesgo/riesgo-riesgo";
		}
		
		model.put("riesgos", riesgo);
		model.put("titulo", "Editar Tipo Riesgo");
		
		return "tipo-riesgo/form";
	}
	
	
	@RequestMapping(value = "evaluacion-riesgos/form", method = RequestMethod.POST)
	public String guardar(@Valid EvaluacionRiesgo riesgos,BindingResult result, Model model,
			RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Riesgos");
			return "riesgos/form";
		}
		String mensajeFlash = (riesgos.getId()!=null) ? "Datos  editado con Exito" : "Creada con exito!";
		evaluacionRiesgoService.save(riesgos);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return "redirect:/riesgos/riesgos";
	}
	
	@GetMapping(value="/evaluacion-riesgos/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				EvaluacionRiesgo riesgo=evaluacionRiesgoService.findById(id);
				evaluacionRiesgoService.delete(id);
				flash.addFlashAttribute("success", "Tipo Riesgo eliminado correctamente");
			}
			return "redirect:/riesgos/riesgoss";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El riesgo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/riesgos/riesgos";
		}
		
	}
}
