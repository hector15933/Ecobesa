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

import com.example.ecobesa.entity.EquipoEvaluador;
import com.example.ecobesa.entity.User;
import com.example.ecobesa.service.IEquipoEvaluadorService;
import com.example.ecobesa.service.IUserService;
import com.example.ecobesa.service.IEquipoEvaluadorService;

@Controller
public class EquipoEvaluadorController {
	
	@Autowired
	private IEquipoEvaluadorService equipoEvaluadorService;
	@Autowired
	private IUserService userService;
	
	
	
	@GetMapping(value="equipo-evaluador/equipo-evaluador")
	public String listar(Model model,Map<String, Object> model2) {				
		return "riesgos/riesgos";
	}
	
	@GetMapping(value="equipo-evaluador/listar",produces = { "application/json" })
	public @ResponseBody List<EquipoEvaluador> findAll() {	 
			 List<EquipoEvaluador> listas = equipoEvaluadorService.findAll();	
			 
			 for(int i=0;i<listas.size();i++) {
				 listas.get(i).setNombre(listas.get(i).getUser().getNombres()+' '+listas.get(i).getUser().getApellidos());
				 listas.get(i).setCargo(listas.get(i).getUser().getCargo().getNombre());
			 }
			 
		return listas;
	}
	
	
	@RequestMapping(value="equipo-evaluador/form")
	public String crear(Map<String,Object> model) {
		EquipoEvaluador riesgos = new EquipoEvaluador();
		
		List<User> users = new ArrayList<User>();
		users=userService.findAll();
		
		model.put("riesgos", riesgos);
		model.put("titulo", "Nuevo riesgo");
		model.put("usuarios", users);
		return "equipo-evaluador/form";
	}
	
	@RequestMapping(value="equipo-evaluador/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		EquipoEvaluador riesgo = null;
		List<User> users = new ArrayList<User>();
		users=userService.findAll();
		
		
		if(id>0) {
			riesgo = equipoEvaluadorService.findById(id);
			if(riesgo==null) {
				flash.addFlashAttribute("error", "el id del riesgo no puede ser cero!");
				return "redirect:riesgos/riesgos";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la riesgo no puede ser cero!");
			return "redirect:/equipo-evaluador/riesgo-riesgo";
		}
		
		model.put("riesgos", riesgo);
		model.put("usuarios", users);
		model.put("titulo", "Editar Equipo Evaluador");
		
		return "equipo-evaluador/form";
	}
	
	
	@RequestMapping(value = "equipo-evaluador/form", method = RequestMethod.POST)
	public String guardar(@Valid EquipoEvaluador riesgos,BindingResult result, Model model,
			RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Riesgos");
			return "riesgos/form";
		}
		String mensajeFlash = (riesgos.getId()!=null) ? "Datos  editado con Exito" : "Creada con exito!";
		equipoEvaluadorService.save(riesgos);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return "redirect:/riesgos/riesgos";
	}
	
	@GetMapping(value="/equipo-evaluador/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				EquipoEvaluador riesgo=equipoEvaluadorService.findById(id);
				equipoEvaluadorService.delete(id);
				flash.addFlashAttribute("success", "Tipo Riesgo eliminado correctamente");
			}
			return "redirect:/riesgos/riesgoss";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El riesgo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/riesgos/riesgos";
		}
		
	}
	
	
}
