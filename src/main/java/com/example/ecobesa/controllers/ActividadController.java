package com.example.ecobesa.controllers;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ecobesa.entity.Actividad;
import com.example.ecobesa.entity.ProgramaAnual;

@Controller
public class ActividadController {
	
	@GetMapping(value="/actividades/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		return "actividad/index";
	}
	
	@GetMapping(value = "/actividad/form")
	public String crear(Map<String, Object> model) {

		Actividad actividad = new Actividad();
		model.put("actividad", actividad);
		model.put("titulo", "Crear Actividad");
		return "actividad/form";
	}
	
	
}
