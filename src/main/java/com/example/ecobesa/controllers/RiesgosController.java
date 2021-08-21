package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Cargo;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.RequisitosLegales;
import com.example.ecobesa.entity.Riesgos;
import com.example.ecobesa.entity.TipoRiesgo;
import com.example.ecobesa.entity.TipoTareas;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.ICargoService;
import com.example.ecobesa.service.IRiesgosService;
import com.example.ecobesa.service.ITipoRiesgoChildService;
import com.example.ecobesa.service.ITipoRiesgoService;
import com.example.ecobesa.service.ITipoTareaService;
import com.example.ecobesa.uploads.IUploadSimbologiaFileService;


@Controller
@SessionAttributes("riesgos")
public class RiesgosController {
	
	@Autowired
	private IRiesgosService riesgosService;
	
	@Autowired
	private ITipoRiesgoService tipoRiesgoService;
	
	@Autowired
	private ITipoTareaService tipoTareaService;
	
	@Autowired
	private ICargoService cargoService;
	
	@Autowired
	private ITipoRiesgoChildService tipoRiesgoChildService;
	
	@Autowired
	private IUploadSimbologiaFileService uploadFileService;
	
	@GetMapping(value="riesgos/uploads/simbologia/{filename:.+}")
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
	
	
	@GetMapping(value="riesgos/riesgos")
	public String listar(Model model,Map<String, Object> model2) {
		List<Cargo> tipoCargos = new ArrayList<Cargo>();
		tipoCargos=cargoService.findAll();
		model2.put("listaCargos", tipoCargos);
		
		return "riesgos/riesgos";
	}
	
	@GetMapping(value="riesgos/listar",produces = { "application/json" })
	public @ResponseBody List<Riesgos> findAll() {	 
			 List<Riesgos> listas = riesgosService.findAll();
			 
			 for(int i=0;i<listas.size();i++) {
				 listas.get(i).setCodigo2(listas.get(i).getTipo_riesgos().getCodigo()+"-"+listas.get(i).getId());
				 listas.get(i).setNombre2(listas.get(i).getTipo_riesgos().getNombre());
			 }
			 		 
		return listas;
	}
	
	@GetMapping(value="riesgos/listar2",produces = { "application/json" })
	public @ResponseBody List<Riesgos> findByCargo(@RequestParam(value = "id") Integer id) {
			
			Long cargo= Long.valueOf(id);
			 List<Riesgos> listas = riesgosService.findByCargo(cargo);
			 
			 for(int i=0;i<listas.size();i++) {
				 listas.get(i).setCodigo2(listas.get(i).getTipo_riesgos().getCodigo()+"-"+listas.get(i).getId());
				 listas.get(i).setNombre2(listas.get(i).getTipo_riesgos().getNombre());
			 }
			 		 
		return listas;
	}
	
	
	@RequestMapping(value="riesgos/form")
	public String crear(Map<String,Object> model) {
		
		Riesgos riesgos = new Riesgos();
		
		List<TipoRiesgo> tipoRiesgo = new ArrayList<TipoRiesgo>();
		List<TipoTareas> tipoTareas = new ArrayList<TipoTareas>();
		List<Cargo> tipoCargos = new ArrayList<Cargo>();
		
		tipoRiesgo=tipoRiesgoService.findAll();
		tipoTareas=tipoTareaService.findAll();
		tipoCargos=cargoService.findAll();
		
		
		model.put("riesgos", riesgos);
		model.put("tipoRiesgos", tipoRiesgo);
		model.put("listaTareas", tipoTareas);
		model.put("listaCargos", tipoCargos);
		model.put("titulo", "Nuevo riesgo");

		return "riesgos/form";
	}
	
	@RequestMapping(value="riesgos/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		Riesgos riesgo = null;
		
		if(id>0) {
			riesgo = riesgosService.findById(id);
			if(riesgo==null) {
				flash.addFlashAttribute("error", "el id del riesgo no puede ser cero!");
				return "redirect:riesgo/riesgo";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la riesgo no puede ser cero!");
			return "redirect:/riesgo/riesgo";
		}
		List<TipoRiesgo> tipoRiesgo = new ArrayList<TipoRiesgo>();
		List<TipoTareas> tipoTareas = new ArrayList<TipoTareas>();
		List<Cargo> tipoCargos = new ArrayList<Cargo>();
		
		tipoRiesgo=tipoRiesgoService.findAll();
		tipoTareas=tipoTareaService.findAll();
		tipoCargos=cargoService.findAll();
		
		
		model.put("riesgos", riesgo);
		model.put("tipoRiesgos", tipoRiesgo);
		model.put("listaTareas", tipoTareas);
		model.put("listaCargos", tipoCargos);

		model.put("titulo", "Editar Riesgo");
		
		return "riesgos/form";
	}
	
	
	@RequestMapping(value = "riesgos/form", method = RequestMethod.POST)
	public String guardar(@Valid Riesgos riesgos,BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Riesgos");
			return "riesgos/form";
		}
		if(!foto.isEmpty()) {
			if(riesgos.getId() != null && riesgos.getId()>0 && riesgos.getSimbologia()!=null  && riesgos.getSimbologia().length()>0) {
				uploadFileService.delete(riesgos.getSimbologia());
			}
			String uniqueFilename = null;
			try {
				uniqueFilename = uploadFileService.copy(foto);
			}catch(IOException e) {
				e.printStackTrace();
			}
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			riesgos.setSimbologia(uniqueFilename);
		}
		String mensajeFlash = (riesgos.getId()!=null) ? "Datos  editado con Exito" : "Requisito Legal creada con exito!";
		riesgosService.save(riesgos);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return "redirect:/riesgos/riesgos";
	}
	
	@GetMapping(value="/riesgos/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				Riesgos riesgo=riesgosService.findById(id);
				riesgosService.delete(id);
				flash.addFlashAttribute("success", "Riesgo eliminado correctamente");
			}
			return "redirect:/riesgos/riesgos";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El riesgo no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/riesgos/riesgos";
		}
		
	}
	
		
}
