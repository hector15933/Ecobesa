package com.example.ecobesa.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RutasController {
	
	
	@GetMapping(value="/empleados")
	public String vista(Model model,Map<String, Object> model2) {
		
		return "empleados/index";
	}
}
