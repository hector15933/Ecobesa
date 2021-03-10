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
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Documento;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.IAlcanceDocumentoService;
import com.example.ecobesa.service.IAreaDocumentoService;
import com.example.ecobesa.service.IDocumentoService;
import com.example.ecobesa.service.ITipoDocumentoService;
import com.example.ecobesa.service.IUploadFileService;


@Controller
public class DocumentoController {
	
	@Autowired
	private IDocumentoService documentoService;
	
	@Autowired
	private IAlcanceDocumentoService alcanceDocumentoService;
	
	@Autowired
	private ITipoDocumentoService tipoDocumentoService;
	
	@Autowired
	private IAreaDocumentoService areaDocumentoServicce;
	
	
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	@GetMapping(value="/documento/uploads/{filename:.+}")
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
	
	
	
	
	
	@RequestMapping(value={"/documento/listar","/documento/listar/{cat}/{param}"}, method = RequestMethod.GET)
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,
			Model model,@PathVariable(value = "cat", required = false) String cat,
			@PathVariable(value = "param", required = false) String param
			) {
		Pageable pageRequest = PageRequest.of(page,10);
		Page<Documento> documentoListar = null;
		if (cat!= null && param != null) {
			
		
			if(cat.equals("codigo")) {
				documentoListar = documentoService.findByCodigoContaining(param, pageRequest);
			}
			/*
			if(cat.equals("apellidos")) {
				DocumentoListar = documentoService.findByApellidosStartsWith(param, pageRequest);
			}
			if(cat.equals("dni")) {
				DocumentoListar = documentoService.findByDniStartsWith(Integer.parseInt(param), pageRequest);
			}*/
	
			
		} else {
			documentoListar = documentoService.findAll(pageRequest);
		}
		
	
		
		//Page<Documento> DocumentoListar = documentoService.findAll(pageRequest);
		PageRender<Documento> pageRender=new PageRender<Documento>("/documento/listar",documentoListar);
		
		model.addAttribute("titulo", "Documentos de trabajo / Editar Documentos");
		model.addAttribute("documentos",documentoListar);
		model.addAttribute("page", pageRender);

		
				
		return "documento/listar";
	}


	
	@GetMapping(value="/documento/listar2")
	public String listar2(Model model) {
		model.addAttribute("documentos",documentoService.findAll(Sort.by("id")));
		return "documento/listar2";
	}

	
	
	@RequestMapping(value="/documento/form")
	public String Crear(Map<String,Object> model,Model model2){
		Documento documento = new Documento();
		model.put("documento", documento);
		model.put("titulo", "Agregar Documento");
		
		model2.addAttribute("tipoDocumento", tipoDocumentoService.findAll());
		model2.addAttribute("alcanceDocumento", alcanceDocumentoService.findAll());
		model2.addAttribute("areaDocumento", areaDocumentoServicce.findAll());
		
		
		
		return "/documento/form";
	}
	
	
	@RequestMapping(value = "/documento/form", method = RequestMethod.POST)
	public String guardar(@Valid Documento documento,Map<String, Object> model,@RequestParam("file") MultipartFile foto, 
			RedirectAttributes flash,SessionStatus status) {

		if(!foto.isEmpty()) {
			if(documento.getId() != null && documento.getId()>0 && documento.getDocumento()!=null
					&& documento.getDocumento().length()>0) {
				
				uploadFileService.delete(documento.getDocumento());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			documento.setDocumento(uniqueFilename);
			
		}
		

		String mensajeFlash = (documento.getId()!=null) ? "Datos Empresa editado con Exito" : "Empresa creada con exito!";
		
		documentoService.save(documento);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/documento/listar";
	}
	
}
