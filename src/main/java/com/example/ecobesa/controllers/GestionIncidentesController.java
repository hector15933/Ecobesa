package com.example.ecobesa.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.GestionIncidentes;
import com.example.ecobesa.service.IAreaService;
import com.example.ecobesa.service.IEmpleadoService;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IGestionIncidentesService;
import com.example.ecobesa.service.IUserService;

@Controller
public class GestionIncidentesController {
	
	@Autowired
	private IGestionIncidentesService gestionIncidentesServices;
	
	
	@Autowired
	private IEmpresaService empresaService;
	
	
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IAreaService areaService;
	
	
	@RequestMapping(value="GestionIncidentes/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));
		
		
		List<GestionIncidentes> entidad= gestionIncidentesServices.findAll(Sort.by("id"));
		model.addAttribute("titulo","Gestión de Incidentes");
		model.addAttribute("entidades", entidad);
		
		return "GestionIncidentes/listar";
	}
	
	
	
	@RequestMapping(value="GestionIncidentes/form")
	public String crear(Map<String,Object> model) {
		
		GestionIncidentes entidad = new GestionIncidentes();
		model.put("entidad", entidad);
		model.put("areas",areaService.findAll(Sort.by("id")));
		model.put("empleados2", empleadoService.findAll());
		model.put("titulo", "Nuevo Incidente");
		
		return "GestionIncidentes/form";
	}
	
	@RequestMapping(value = "GestionIncidentes/form", method = RequestMethod.POST)
	public String guardar(@Valid GestionIncidentes gestionIncidentes,BindingResult result, Model model,
			RedirectAttributes flash, SessionStatus status) {

		String mensajeFlash = (gestionIncidentes.getId()!=null) ? "Datos Empresa editado con Exito" : "Empresa creada con exito!";
		
		gestionIncidentesServices.save(gestionIncidentes);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/GestionIncidentes/listar";
	}
	
	
	@GetMapping(value="GestionIncidentes/ver/{id}")
	public String ver(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("gestionIncidentes",gestionIncidentesServices.findById(id));
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));

		return "GestionIncidentes/ver";
	}
	
}
