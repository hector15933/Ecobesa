package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Consulta;
import com.example.ecobesa.entity.Emo;
import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.ListaVerificacion;
import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.ConsultaServiceImpl;
import com.example.ecobesa.service.IConsultaService;
import com.example.ecobesa.service.IEmoService;
import com.example.ecobesa.service.IEmpleadoService;
import com.example.ecobesa.service.IUploadFileService;

@Controller
@SessionAttributes("salud-ocupacional")
public class SaludOcupacionalController {
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IEmoService emoService;
	
	@Autowired 
	private IConsultaService consultaService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	

	@GetMapping(value="/salud-ocupacional/uploads/{filename:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String filename){
		
		Resource recurso= null;
		
		try {
			recurso = uploadFileService.load(filename);
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok()
			.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+recurso.getFilename()+"\"")
			.body(recurso);
	}
	
	
	
	@GetMapping(value= {"/salud-ocupacional/listar","/salud-ocupacional/listar/{cat}/{param}"})
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,
			Model model,@PathVariable(value = "cat", required = false) String cat,
			@PathVariable(value = "param", required = false) String param,Map<String, Object> model2) {
		
		Pageable pageRequest = PageRequest.of(page,10);
		Page<Empleado> empleadoListar = null;
		
		if (cat!= null && param != null) {
			
			
			if(cat.equals("nombres")) {
				empleadoListar = empleadoService.findByNombresStartsWith(param, pageRequest);
			}
			
			if(cat.equals("apellidos")) {
				empleadoListar = empleadoService.findByApellidosStartsWith(param, pageRequest);
			}
			if(cat.equals("dni")) {
				empleadoListar = empleadoService.findByDniStartsWith(Integer.parseInt(param), pageRequest);
			}
	
			
		} else {
			empleadoListar = empleadoService.findAll(pageRequest);
		}
		
		
		
		PageRender<Empleado> pageRender=new PageRender<Empleado>("/salud-ocupacional/listar",empleadoListar);
		
		
		
		model.addAttribute("titulo", "Seguimiento Medico");
		model.addAttribute("titulo2", "Agregar Emo");
		model.addAttribute("listaVerificaciones",empleadoListar);
		model.addAttribute("page", pageRender);
		
		Emo emo = new Emo();
		
		model2.put("listaVerificacion", emo);
		model2.put("titulo3", "Asignar Emo");
				
		return "salud-ocupacional/listar";
		
	}
	@RequestMapping(value="salud-ocupacional/show/{id}")
	public String show(@PathVariable(value="id") Long id,Map<String,Object> model) {

		model.put("empleado", empleadoService.findById(id));
		
		return "salud-ocupacional/show";
	}
	
	@RequestMapping(value="salud-ocupacional/show-historial/{id}")
	public String show2(@PathVariable(value="id") Long id,Map<String,Object> model) {

		model.put("empleado", empleadoService.findById(id));
		
		return "salud-ocupacional/showHistorial";
	}
	
	
	
	
	@RequestMapping(value="salud-ocupacional/form/{id}")
	public String crear(@PathVariable(value="id") Long id,
			Map<String,Object> model) {
		
		Emo emo = new Emo();
		model.put("idEmpleado",empleadoService.findById(id));
		model.put("emo", emo);
		model.put("titulo", "Crear Emo");
		
		return "salud-ocupacional/form";
	}
	
	@RequestMapping(value="salud-ocupacional/form-consulta/{id}")
	public String crear2(@PathVariable(value="id") Long id,Map<String,Object> model) {
		
		Consulta consulta = new Consulta();
		model.put("idEmpleado",empleadoService.findById(id));
		model.put("consulta", consulta);
		model.put("titulo", "Añadir Consulta");
		
		return "salud-ocupacional/formConsulta";
	}
	
	/*
	
	@RequestMapping(value="salud-ocupacional/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		Emo emo = null;
		emo.setEmpleados(empleadoService.findById(id));
		
		if(id>0) {
			emo = emoService.findById(id);
			if(emo==null) {
				flash.addFlashAttribute("error", "el id de  empleado no puede ser cero!");
				return "redirect:salud-ocupacional/listar";
			}
		}else {
			flash.addFlashAttribute("error", "El id de  empleado no puede ser cero!");
			return "redirect:/salud-ocupacional/listar";
		}
		
		model.put("emo", emo);
		model.put("titulo", "Editar Emo");
		
		return "salud-ocupacional/form";
	}*/
	
	
	@RequestMapping(value = "/salud-ocupacional/form", method = RequestMethod.POST)
	public String guardar(@Valid Emo emo,BindingResult result,
			@RequestParam("file") MultipartFile foto, Model model,RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empleado");
			return "salud-ocupacional/form";
		}
		if(!foto.isEmpty()) {
			if(emo.getId() != null && emo.getId()>0 && emo.getPrueba()!=null
					&& emo.getPrueba().length()>0) {
				
				uploadFileService.delete(emo.getPrueba());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			emo.setPrueba(uniqueFilename);
			
		}
		
		
		String mensajeFlash = (emo.getId()!=null) ? "Datos Emo editado con Exito" : "Emo creado con exito!";
		emoService.save(emo);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/salud-ocupacional/listar";
	}
	
	
	@RequestMapping(value = "/salud-ocupacional/form-consulta", method = RequestMethod.POST)
	public String guardar2(@Valid Consulta consulta,BindingResult result, Model model,RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empleado");
			return "salud-ocupacional/formConsulta";
		}
		
		
		String mensajeFlash = (consulta.getId()!=null) ? "Datos Consulta editado con Exito" : "Consulta creado con exito!";
		consultaService.save(consulta);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/salud-ocupacional/listar";
	}
	

	
	
	
}
