package com.example.ecobesa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ecobesa.entity.TipoRiesgoChild;
import com.example.ecobesa.service.ITipoRiesgoChildService;

@Controller
public class TipoRiesgoChildController {
	
	@Autowired
	private ITipoRiesgoChildService tipoRiesgoChildService;
	
	@GetMapping(value="/tipo-riesgo-child",produces = { "application/json" })
	public @ResponseBody List<TipoRiesgoChild> findByTipoRiesgo(@RequestParam(value = "id") Integer id){
		
		Long tipoRiesgo= Long.valueOf(id);
		List<TipoRiesgoChild> tipoRiesgoChild = tipoRiesgoChildService.findByTipoRiesgo(tipoRiesgo);
		
		return tipoRiesgoChild;
	}
}
