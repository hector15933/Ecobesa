package com.example.ecobesa.controllers;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecobesa.entity.Actividad;
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
		return "objetivo-general/index";
	}
	
	@GetMapping(value = "/objetivos-generales/form")
	public String crear(Map<String, Object> model) {

		ObjetivoGeneral objetivoGeneral = new ObjetivoGeneral();
		model.put("objetivoGeneral", objetivoGeneral);
		model.put("titulo", "Crear Objetivo General");
		return "objetivo-general/form";
	}
	
	@RequestMapping(value="/objetivos-generales/form/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("objetivoGeneral",objetivoGeneralService.findById(id));
		ObjetivoGeneral objetivoGeneral=null;
		if(id>0){
			objetivoGeneral = objetivoGeneralService.findById(id);
		}else {
			return "redirect:/objetivo-general/index";
		}
		model2.put("titulo", "Editar");
		model2.put("ObjetivoGeneral",objetivoGeneral);
		return "objetivo-general/form";
	}
	
}
