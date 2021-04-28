package com.example.ecobesa.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Consulta;
import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.RegistroEnfermedadOcupacional;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IRegistroEnfermedadOcupacionalService;

@Controller
public class RegistroEnfermedadOcupacionalController {

	@Autowired
	private IRegistroEnfermedadOcupacionalService registroEnfermedadOcupacionalService;
	
	@Autowired
	private IEmpresaService empresaService;
	
	@RequestMapping(value="/registro-enfermedad-ocupacional/listar", method=RequestMethod.GET)
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,Model model) {
		
		Pageable pageRequest = PageRequest.of(page,10);
		
		Page<RegistroEnfermedadOcupacional> registroEnfermedad= registroEnfermedadOcupacionalService.findAll(pageRequest);
		
		PageRender<RegistroEnfermedadOcupacional> pageRender=new PageRender<RegistroEnfermedadOcupacional>("/registro-enfermedad-ocupacional/listar",registroEnfermedad);
		
		model.addAttribute("page", pageRender);
		model.addAttribute("titulo","Registro Enfermedad Ocupacional");
		model.addAttribute("registroEnfermedad", registroEnfermedad);
		
		return "registro-enfermedad-ocupacional/listar";
	}
	
	@RequestMapping(value="/registro-enfermedad-ocupacional/form")
	public String crear(Map<String,Object> model) {
		
		RegistroEnfermedadOcupacional registroEnfermedadOcupacional = new RegistroEnfermedadOcupacional();
		
		model.put("empresas", empresaService.findAll());
		model.put("registroEnfermedadOcupacional", registroEnfermedadOcupacional);
		model.put("titulo", "Registro Enfermedad Ocupacional");
		
		
		
		return "registro-enfermedad-ocupacional/form";
	}
	
	@RequestMapping(value = "/registro-enfermedad-ocupacional/form", method = RequestMethod.POST)
	public String guardar(@Valid RegistroEnfermedadOcupacional registroEnfermedadOcupacional,BindingResult result, Model model,RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Registro Salud Ocupacional");
			return "salud-ocupacional/formConsulta";
		}
		
		
		String mensajeFlash = (registroEnfermedadOcupacional.getId()!=null) ? "Datos Registro Enfermedad Ocupacional editado con Exito" : "Registro Enfermedad Ocupacional creado con exito!";
		registroEnfermedadOcupacionalService.save(registroEnfermedadOcupacional);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/registro-enfermedad-ocupacional/listar";
	}
	
	
}
