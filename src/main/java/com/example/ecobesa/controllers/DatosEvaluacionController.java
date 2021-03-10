package com.example.ecobesa.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ecobesa.entity.DatosEvaluacion;
import com.example.ecobesa.service.IDatosEvaluacionService;

@Controller
public class DatosEvaluacionController {
	
	
	@Autowired
	private IDatosEvaluacionService datosEvaluacionService;
	
	
	
	
	@GetMapping(value="/datos-evaluacion/listar/{id}")
	public String listar(Model model,Map<String, Object> model2,@PathVariable(value="id") Long id) {
		model.addAttribute("titulo", "Lista Verificacion items / Editar");
		model.addAttribute("titulo2", "Agregar item");
		model.addAttribute("listaVerificacionItems",datosEvaluacionService.findAllByRequisitosLegalesId(id));
		model.addAttribute("lineamientos", datosEvaluacionService.findAll());
		model.addAttribute("idListaVerificacion", id);
	
		
		DatosEvaluacion listaVerificacionItem = new DatosEvaluacion();
		
		model2.put("listaVerificacionItem", listaVerificacionItem);
		model2.put("titulo3", "Crear Item de lista Verificaicon");
				
		return "datos-evaluacion/listar";
	}
	
	
	
	
}
