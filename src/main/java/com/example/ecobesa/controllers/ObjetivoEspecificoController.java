package com.example.ecobesa.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.ObjetivoEspecifico;
import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.service.IObjetivoEspecificoService;
import com.example.ecobesa.service.IObjetivoGeneralService;

@Controller
public class ObjetivoEspecificoController {
	
	@Autowired
	private IObjetivoGeneralService objetivoGeneralService;
	@Autowired
	private IObjetivoEspecificoService objetivoEspecificoService;
	
	@GetMapping(value="/objetivos-especificos/{id}")
	public String index(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		model.put("objetivosEspecificos", objetivoGeneralService.findById(id).getObjetivoEspecifico());
		model.put("objetivoGeneral", objetivoGeneralService.findById(id));
		return "objetivo-especifico/index";
	}
	
	@GetMapping(value = "/objetivos-especificos/crear/{id}")
	public String crear(Map<String, Object> model,@PathVariable(value="id") Long id) {
		ObjetivoEspecifico objetivoEspecifico = new ObjetivoEspecifico();
		ObjetivoGeneral obj = objetivoGeneralService.findById(id);
		objetivoEspecifico.setObjetivoGeneral(obj);
		model.put("objetivoEspecifico", objetivoEspecifico);
		model.put("titulo", "Registrar Objetivo Específico");
		model.put("btn", "Crear");
		return "objetivo-especifico/form";
	}
	
	@RequestMapping(value="/objetivos-especificos/editar/{id}")
	public String editar(@PathVariable(value="id") Long id,Map<String,Object> model) {
		ObjetivoEspecifico objetivoEspecifico=null;
		
		if(id>0){
			objetivoEspecifico = objetivoEspecificoService.findById(id);
		}else {
			return "redirect:/programaAnual/listar";
		}
		model.put("titulo", "Editar Objetivo Específico");
		model.put("objetivoEspecifico",objetivoEspecifico);
		model.put("btn","Actualizar");
		return "objetivo-especifico/form";
	}
	
	@PostMapping(value = "/objetivos-especificos/form")
	public String guardar(@Valid ObjetivoEspecifico objetivoEspecifico,BindingResult bindingResult, Model model, RedirectAttributes flash) {
		
		if(bindingResult.hasErrors()){	
			model.addAttribute("objeticoEspecifico", objetivoEspecifico);
			model.addAttribute("titulo", "Crear Objetivo Específico");
			return "objetivo-especifico/form";
		}
		flash.addFlashAttribute("success", "Acción Realizada Correctamente");
		objetivoEspecificoService.save(objetivoEspecifico);
		String direccion="redirect:/objetivos-especificos/"+objetivoEspecifico.getObjetivoGeneral().getId();
		return direccion;
	}
	
	@GetMapping(value="/objetivos-especificos/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//validar que el id exista en la tabla objetivos especificos
		Long objetivoGeneralId=objetivoEspecificoService.findById(id).getObjetivoGeneral().getId();
		String ruta="redirect:/objetivos-especificos/"+objetivoGeneralId;
		try {
			objetivoEspecificoService.delete(id);
			flash.addFlashAttribute("success", "Objetivo Especifico eliminado correctamente");
			return ruta;
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar el Objetivo Especifico");
			return ruta;
		}
	}
}
