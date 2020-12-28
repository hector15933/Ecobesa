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


import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.service.IObjetivoGeneralService;
import com.example.ecobesa.service.IProgramaAnualService;

@Controller
public class ObjetivoGeneralController {
	
	@Autowired
	private IObjetivoGeneralService objetivoGeneralService;
	@Autowired
	private IProgramaAnualService programaAnualService;
	
	@GetMapping(value="/objetivos-generales/{id}")
	public String index(@PathVariable(value = "id") Long id, Map<String, Object> model) {
		model.put("objetivosGenerales", programaAnualService.findById(id).getObjetivoGeneral());
		model.put("programaAnual", programaAnualService.findById(id));
		return "objetivo-general/index";
	}
	
	@GetMapping(value = "/objetivos-generales/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		ObjetivoGeneral objetivoGeneral = objetivoGeneralService.findById(id);
		model.put("objetivoGeneral", objetivoGeneral);
		return "objetivo-general/show";
	}
	
	@GetMapping(value = "/objetivos-generales/crear/{id}")
	public String crear(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		ProgramaAnual programaAnual = programaAnualService.findById(id);
		ObjetivoGeneral objetivoGeneral = new ObjetivoGeneral();
		objetivoGeneral.setProgramaAnual(programaAnual);
		model.put("objetivoGeneral", objetivoGeneral);
		model.put("titulo", "Crear Objetivo General");
		model.put("btn", "Crear");
		return "objetivo-general/form";
	}
	
	@RequestMapping(value="/objetivos-generales/editar/{id}")
	public String editar(@PathVariable(value="id") Long id,Map<String,Object> model) {
		ObjetivoGeneral objetivoGeneral=null;
		if(id>0){
			objetivoGeneral = objetivoGeneralService.findById(id);
		}else {
			return "redirect:/objetivo-general/index";
		}
		model.put("titulo", "Editar");
		model.put("objetivoGeneral",objetivoGeneral);
		model.put("btn","Actualizar");
		return "objetivo-general/form";
	}
	
	@PostMapping(value = "/objetivos-generales")
	public String guardar(@Valid ObjetivoGeneral objetivoGeneral,BindingResult bindingResult, Model model, RedirectAttributes flash) {
		
		if(bindingResult.hasErrors()){	
			model.addAttribute("objetivoGeneral", objetivoGeneral);
			model.addAttribute("titulo", "Objetivo General");
			model.addAttribute("btn", "Guardar");
			return "objetivo-general/form";
		}
		objetivoGeneralService.save(objetivoGeneral);
		flash.addFlashAttribute("success", "Acción Realizada Correctamente");
		String ruta="redirect:/objetivos-generales/"+objetivoGeneral.getProgramaAnual().getId();
		return ruta;
	}
	
	@GetMapping(value="/objetivos-generales/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//Validar que el id exista en la tabla programa anual
		Long programaAnualId=objetivoGeneralService.findById(id).getProgramaAnual().getId();
		String ruta="redirect:/objetivos-generales/"+programaAnualId;
		try {
			objetivoGeneralService.delete(id);
			flash.addFlashAttribute("success", "Objetivo General eliminado correctamente");
			return ruta;
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar el Objetivo General");
			return ruta;
		}
	}
}
