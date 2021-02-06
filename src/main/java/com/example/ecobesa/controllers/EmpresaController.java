package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
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

import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IUploadFileService;

@Controller
@SessionAttributes("empresa")
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private IEmpresaService empresaService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	@GetMapping(value="/uploads/{filename:.+}")
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
	
	@GetMapping(value="/ver/{id}")
	public String ver(@PathVariable(value="id") Long id, Map<String,Object> model, RedirectAttributes flash) {
		
		Empresa empresa = empresaService.findById(id);
		if(empresa == null) {
			flash.addFlashAttribute("error", "La empresa no existe en la base de datos");
			return "redirect:/empresa/listar";
		}
		
		model.put("empresa",empresa);
		model.put("titulo", "Detalle Empresa: " + empresa.getRazonSocial());
		
		return "empresa/ver";
	}
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		
		List<Empresa> empresa= empresaService.findAll();
		model.addAttribute("titulo","Empresa");
		model.addAttribute("empresas", empresa);
		
		return "empresa/listar";
	}
	@RequestMapping(value="/form")
	public String crear(Map<String,Object> model) {
		
		Empresa empresa = new Empresa();
		model.put("empresa", empresa);
		model.put("titulo", "Empresa");
		
		return "empresa/form";
	}
	
	
	
	@RequestMapping(value="form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		Empresa empresa = null;
		
		if(id>0) {
			empresa = empresaService.findById(id);
			if(empresa==null) {
				flash.addFlashAttribute("error", "el id de la empresa no puede ser cero!");
				return "redirect:empresa/listar";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la empresa no puede ser cero!");
			return "redirect:/empresa/listar";
		}
		
		model.put("empresa", empresa);
		model.put("titulo", "Editar empresa");
		
		return "empresa/form";
	}
	
	
	
	
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid Empresa empresa,BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto,
			@RequestParam("file2") MultipartFile pantallaInicio, RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empresa");
			return "empresa/form";
		}
		if(!foto.isEmpty()) {
			if(empresa.getId() != null && empresa.getId()>0 && empresa.getFoto()!=null
					&& empresa.getFoto().length()>0) {
				
				uploadFileService.delete(empresa.getFoto());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			empresa.setFoto(uniqueFilename);
			
		}
		if(!pantallaInicio.isEmpty()) {
			if(empresa.getId() != null && empresa.getId()>0 && empresa.getPantallaInicio()!=null
					&& empresa.getPantallaInicio().length()>0) {	
				
				uploadFileService.delete(empresa.getPantallaInicio());
				
			}
			
			String uniqueFilename2 = null;
			
			try {
				uniqueFilename2 = uploadFileService.copy(pantallaInicio);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename2 +"'");
			empresa.setPantallaInicio(uniqueFilename2);
			
		}
		
		String mensajeFlash = (empresa.getId()!=null) ? "Datos Empresa editado con Exito" : "Empresa creada con exito!";
		
		empresaService.save(empresa);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/empresa/listar";
	}
	
	
	
	
	
	
	
	
	
}
