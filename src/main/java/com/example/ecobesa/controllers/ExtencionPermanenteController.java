package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
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

import com.example.ecobesa.entity.ExtencionPermanente;
import com.example.ecobesa.service.IAltoRiesgoService;
import com.example.ecobesa.service.IExtencionPermanenteService;
import com.example.ecobesa.service.IExtencionTemporalService;
import com.example.ecobesa.service.ITercerosService;
import com.example.ecobesa.service.IUploadFileService;
import com.example.ecobesa.service.IUserService;

@Controller
@SessionAttributes("permanente")
public class ExtencionPermanenteController {
	
	

	@Autowired
	private ITercerosService tercerosService;
	
	@Autowired
	private IExtencionPermanenteService extencionPermanenteService;
	
	@Autowired
	private IExtencionTemporalService extencionTemporalService;
	
	@Autowired
	private IAltoRiesgoService altoRiesgoService;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	
	@GetMapping(value="/extencion-permanente/uploads/{filename:.+}")
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

	
	@RequestMapping(value="/terceros/permanente-form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		ExtencionPermanente empresa = null;
		
		if(id>0) {
			empresa = extencionPermanenteService.findById(id);
			if(empresa==null) {
				flash.addFlashAttribute("error", "el id de la empresa no puede ser cero!");
				return "redirect:/terceros/listar";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la empresa no puede ser cero!");
			return "redirect:/terceros/listar";
		}
		
		model.put("permanente",  extencionPermanenteService.findById(id));
		model.put("tercero", tercerosService.findById(extencionPermanenteService.findById(id).getTerceros().getId()));
		model.put("titulo", "Editar");
		
		return "terceros/form-permanente";
	}
	
	@RequestMapping(value = "/terceros/permanente-form", method = RequestMethod.POST)
	public String guardar(@Valid ExtencionPermanente empresa,BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto,
			 RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empresa");
			return "terceros/listar";
		}
		if(!foto.isEmpty()) {
			if(empresa.getId() != null && empresa.getId()>0 && empresa.getEvidencia()!=null
					&& empresa.getEvidencia().length()>0) {
				
				uploadFileService.delete(empresa.getEvidencia());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			empresa.setEvidencia(uniqueFilename);
			
		}

		
		String mensajeFlash = (empresa.getId()!=null) ? "Datos extencion permanente editado con Exito" : "Extencion permanente creada con exito!";
		
		extencionPermanenteService.save(empresa);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/terceros/listar";
	}
}
