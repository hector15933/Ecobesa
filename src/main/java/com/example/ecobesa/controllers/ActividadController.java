package com.example.ecobesa.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Actividad;
import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.entity.Fecha;
import com.example.ecobesa.entity.User;
import com.example.ecobesa.service.IActividadService;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IFechaService;
import com.example.ecobesa.service.IObjetivoGeneralService;
import com.example.ecobesa.service.IProgramaActividadService;
import com.example.ecobesa.service.ITipoActividadService;
import com.example.ecobesa.service.IUserService;

@Controller
@RequestMapping("/menu")
public class ActividadController {

	@Autowired
	private IActividadService actividadService;
	@Autowired
	private IObjetivoGeneralService objetivoService;
	@Autowired
	private IEmpresaService empresaService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IFechaService fechaService;

	@Autowired
	private IProgramaActividadService programaActividadService;

	@Autowired
	private ITipoActividadService tipoActividadService;
	
	@GetMapping("/actividad/listar")
	public String listar(Model model, Map<String, Object> model2) {

		model.addAttribute("titulo", "Lista Actividades");

		List<Actividad> acti = new ArrayList<Actividad>();
		acti = actividadService.findAll(Sort.by("id"));

		List<String> fechas = new ArrayList<String>();

		model.addAttribute("actividades", actividadService.findAll(Sort.by("id")));

		return "menu/actividad/listar";
	}

	@GetMapping("/actividad/listar2")
	public String listar2(Model model, Map<String, Object> model2, HttpServletRequest request) {

		Long userId2 = (Long) request.getSession().getAttribute("userId");
		model.addAttribute("titulo", "Lista Actividades");
		long id = 1;
		model.addAttribute("empresa", empresaService.findById(id));
		model.addAttribute("usuarios", userService.findAll(Sort.by("id")));
		model.addAttribute("actividades", actividadService.findAllByUsersId(userId2));
		return "menu/actividad/listar2";
	}

	@PostMapping(value = "/actividad/form")
	public String guardar(@Valid Actividad actividad, BindingResult bindingResult, Model model,
			Map<String, Object> model2, RedirectAttributes flash) {
		if (bindingResult.hasErrors()) {
			model2.put("titulo", "Crear Actividad de Trabajo");
			return "menu/actividad/form";
		}

		flash.addFlashAttribute("success", "Actividad creada correctamente");
			
	
		/*
		for(int i=0; i<aFecha.size();i++) {
			
			
		}*/
		  for(Fecha b : actividad.getFecha()) {
	            b.setActividad(actividad);
	      }
	
		actividadService.save(actividad);

		return "redirect:listar";

	}

	@RequestMapping("/actividad/form")
	public String crear(Map<String, Object> model, HttpServletRequest request) {

		Long userId = (Long) request.getSession().getAttribute("userId");

		Actividad actividad = new Actividad();
		
		for (int i = 1; i <= 3; i++) {
			actividad.addFecha(new Fecha());
	    }
		
		
		List<Fecha> aFecha = new  ArrayList<Fecha>();
		model.put("actividad", actividad);
		model.put("aFecha", aFecha);
		model.put("titulo", "Crear Actividad");
		model.put("objetivoGeneral", objetivoService.findAll(Sort.by("id")));
		model.put("tipoActividad", tipoActividadService.findAll());
		model.put("programaActividad", programaActividadService.findAll(Sort.by("id")));
		model.put("users", userService.findAll(Sort.by("id")));
		model.put("userId", userService.findById(userId));

		return "menu/actividad/form";
	}

	/* Metodo para el jquery */
	@GetMapping(value = "/actividad/cargar-usuarios/{term}", produces = { "application/json" })
	public @ResponseBody List<User> cargarUsers(@PathVariable String term) {

		return actividadService.findByNombres(term);
	}

	@GetMapping("/actividad/form/{id}")
	public String editar(Model model, @PathVariable(value = "id") Long id, Map<String, Object> model2,
			RedirectAttributes flash) {

		Actividad actividad = null;
		if (id > 0) {
			actividad = actividadService.findById(id);
		} else {
			return "redirect:/menu/adtividad/form";
		}
		model2.put("titulo", "Editar Actividad");
		model2.put("actividad", actividad);
		return "menu/actividad/form";
	}

	@GetMapping(value = "/actividad/show/{id}")
	public String show(@PathVariable(value = "id") Long id, Model model) {
		Actividad actividad = actividadService.findById(id);
		model.addAttribute("actividad", actividad);
		return "menu/actividad/show";
	}

	@GetMapping(value = "/actividad/cambiar/fecha/{id}")
	public String cambiarEstado(@PathVariable(value = "id") Long id, Model model) {

		Fecha fecha = fechaService.findById(id);
		fecha.setEstado(true);
		fechaService.save(fecha);

		model.addAttribute("titulo", "Lista Actividades");

		List<Actividad> acti = new ArrayList<Actividad>();
		acti = actividadService.findAll(Sort.by("id"));

		List<String> fechas = new ArrayList<String>();

		model.addAttribute("actividades", actividadService.findAll(Sort.by("id")));

		return "menu/actividad/listar";
	}

}
