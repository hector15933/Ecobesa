package com.example.ecobesa.controllers;

import java.util.ArrayList;
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

import com.example.ecobesa.entity.ControlesRiesgo;
import com.example.ecobesa.entity.Riesgos;
import com.example.ecobesa.entity.Sede;
import com.example.ecobesa.service.IControlesRiesgoService;
import com.example.ecobesa.service.IRiesgosService;
import com.example.ecobesa.service.ISedeService;

@Controller
public class ControlesRiesgoController {
	
	@Autowired
	private IControlesRiesgoService controlesRiesgoService;
	
	@Autowired
	private IRiesgosService riesgoService;
	
	@Autowired
	private ISedeService sedeService;
	
	
	
	@GetMapping(value="controles-riesgo/controles-riesgo")
	public String listar(Model model,Map<String, Object> model2) {				
		return "riesgos/riesgos";
	}
	
	@GetMapping(value="controles-riesgo/listar",produces = { "application/json" })
	public @ResponseBody List<ControlesRiesgo> findAll() {	 
			 List<ControlesRiesgo> listas = controlesRiesgoService.findAll();			 		 
		return listas;
	}
	
	
	@RequestMapping(value="controles-riesgo/form")
	public String crear(Map<String,Object> model) {
		ControlesRiesgo riesgos = new ControlesRiesgo();
		
		List<Riesgos> listaRiesgos = new ArrayList<Riesgos>();
		listaRiesgos=riesgoService.findAll();
		
		List<Sede> listaSedes = new ArrayList<Sede>();
		listaSedes=sedeService.findAll();
		
		model.put("riesgos", riesgos);
		model.put("listaRiesgos", listaRiesgos);
		model.put("listaSedes", listaSedes);
		model.put("titulo", "Nuevo Control Riesgo");
		return "controles-riesgo/form";
	}
	
	@RequestMapping(value="controles-riesgo/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		ControlesRiesgo riesgo = null;
		
		if(id>0) {
			riesgo = controlesRiesgoService.findById(id);
			if(riesgo==null) {
				flash.addFlashAttribute("error", "el id del riesgo no puede ser cero!");
				return "redirect:riesgos/riesgos";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la riesgo no puede ser cero!");
			return "redirect:/tipo-riesgo/riesgo-riesgo";
		}
		
		model.put("riesgos", riesgo);
		model.put("titulo", "Editar Controles Riesgo");
		
		return "controles-riesgo/form";
	}
	
	
	@RequestMapping(value = "controles-riesgo/form", method = RequestMethod.POST)
	public String guardar(@Valid ControlesRiesgo riesgos,BindingResult result, Model model,
			RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Riesgos");
			return "riesgos/form";
		}
		String mensajeFlash = (riesgos.getId()!=null) ? "Datos  editado con Exito" : "Creada con exito!";
		controlesRiesgoService.save(riesgos);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return "redirect:/riesgos/riesgos";
	}
	
	@GetMapping(value="/controles-riesgo/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				ControlesRiesgo riesgo=controlesRiesgoService.findById(id);
				controlesRiesgoService.delete(id);
				flash.addFlashAttribute("success", "Tipo Riesgo eliminado correctamente");
			}
			return "redirect:/riesgos/riesgoss";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El riesgo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/riesgos/riesgos";
		}
		
	}
	
	
}
