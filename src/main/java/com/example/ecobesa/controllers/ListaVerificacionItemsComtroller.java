package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.ecobesa.entity.ListaVerificacion;
import com.example.ecobesa.entity.ListaVerificacionItems;
import com.example.ecobesa.service.ILineamientoService;
import com.example.ecobesa.service.IListaVerificacionItemService;
import com.example.ecobesa.service.IUploadFileService;

@Controller
public class ListaVerificacionItemsComtroller {
	
	
	
	@Autowired
	private IListaVerificacionItemService listaVerificacionItemService;
	
	@Autowired
	private ILineamientoService lineamientoService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	

	@GetMapping(value="/lista-verificacion-items/uploads/{filename:.+}")
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
	
	
		
	
	@GetMapping(value="/lista-verificacion-items/listar/{id}")
	public String listar(Model model,Map<String, Object> model2,@PathVariable(value="id") Long id) {
		model.addAttribute("titulo", "Lista Verificacion items / Editar");
		model.addAttribute("titulo2", "Agregar item");
		model.addAttribute("listaVerificacionItems",listaVerificacionItemService.findAllByListaVerificacionId(id));
		model.addAttribute("lineamientos", lineamientoService.findAll());
		model.addAttribute("idListaVerificacion", id);
	
		
		ListaVerificacionItems listaVerificacionItem = new ListaVerificacionItems();
		
		model2.put("listaVerificacionItem", listaVerificacionItem);
		model2.put("titulo3", "Crear Item de lista Verificaicon");
				
		return "lista-verificacion-item/listar";
	}
	
	@PostMapping(value="/lista-verificacion-items/listar/{id}")
	public String guardar(@Valid ListaVerificacionItems listaVerificacionItems ,
			@RequestParam("file") MultipartFile foto,BindingResult bindingResult,
			Model model,Map<String, Object> model2,RedirectAttributes flash,@PathVariable(value="id") Long id) {
		
		
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "Lista Verificacion items / Editar");
			model.addAttribute("titulo2", "Agregar item");
			model.addAttribute("listaVerificacionItems",listaVerificacionItemService.findAllByListaVerificacionId(id));
			model.addAttribute("lineamientos", lineamientoService.findAll());
			model.addAttribute("idListaVerificacion", id);
			model2.put("titulo3", "Crear Item de lista Verificaicon");
			
			return "lista-verificacion-item/listar";
		}
		if(!foto.isEmpty()) {
			if(listaVerificacionItems.getId() != null && listaVerificacionItems.getId()>0 && listaVerificacionItems.getEvicendia01()!=null
					&& listaVerificacionItems.getEvicendia01().length()>0) {
				
				uploadFileService.delete(listaVerificacionItems.getEvicendia01());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			listaVerificacionItems.setEvicendia01(uniqueFilename);
			
		}
		
		
		
		flash.addFlashAttribute("success", "Item creado correctamente");
		listaVerificacionItemService.save(listaVerificacionItems);
		return "redirect:/lista-verificacion-items/listar/"+id;
		
	}
	
	
	@RequestMapping(value="/lista-verificacion-items/listar/{id}/{id2}")
	public String editar(Model model,@PathVariable(value="id") Long id,@PathVariable(value="id2") Long id2,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("listaVerificacionItems",listaVerificacionItemService.findAllByListaVerificacionId(id));
		ListaVerificacionItems listaVerificacionItem=null;
		if(id>0){
			listaVerificacionItem = listaVerificacionItemService.findById(id2);
		}else {
			return "redirect:/lista-verificacion-items/listar/"+id;
		}
		model2.put("listaVerificacionItem",listaVerificacionItem);
		flash.addFlashAttribute("success", "Item de lista Verificaicon Editado correctamente");
		model.addAttribute("titulo", "Item de lista Verificaicon / Editar Item de lista Verificaicon");
		model.addAttribute("idListaVerificacion", id);
		model.addAttribute("lineamientos", lineamientoService.findAll());
		model2.put("titulo2","Editar Item de lista Verificaicon");
		model2.put("titulo3", "Editar Item de lista Verificaicon");
		
		
		return "lista-verificacion-item/listar";
	}
	
}
