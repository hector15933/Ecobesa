package com.example.ecobesa.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.ecobesa.entity.LineaBase;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.ILineaBaseService;


@SessionAttributes("programaAnual")
@Controller
public class LineaBaseController {
	
	@Autowired
	private ILineaBaseService lineaBaseService;
	@Autowired
	private IEmpresaService empresaService;
	
	
	@RequestMapping(value={"/lineaBase/listar","/lineaBase/listar/{cat}/{param}"}, method = RequestMethod.GET)
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,
			Model model,@PathVariable(value = "cat", required = false) String cat,
			@PathVariable(value = "param", required = false) String param
			) {
		Pageable pageRequest = PageRequest.of(page,10);
		Page<LineaBase> userListar = null;
		if (cat!= null && param != null) {
			
		
			if(cat.equals("nombres")) {
				userListar = lineaBaseService.findByNombre(param, pageRequest);
			}/*
			if(cat.equals("apellidos")) {
				userListar = userService.findByApellidosStartsWith(param, pageRequest);
			}
			if(cat.equals("dni")) {
				userListar = userService.findByDniStartsWith(Integer.parseInt(param), pageRequest);
			}*/
	
			
		} else {
			userListar = lineaBaseService.findAll(pageRequest);
		}
		
	
		
		//Page<User> userListar = userService.findAll(pageRequest);
		PageRender<LineaBase> pageRender=new PageRender<LineaBase>("/lineaBase/listar",userListar);
		
		model.addAttribute("titulo", "Users de trabajo / Editar users");
		model.addAttribute("lineasBases",userListar);
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));
		model.addAttribute("page", pageRender);

		
				
		return "lineaBase";
	}
	
	
	

	
	@GetMapping(value="lineaBase/ver/{id}")
	public String ver(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("lineaBase",lineaBaseService.findById(id));
		
		
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));
		

		return "LineaBase/ver";
	}
	
	
	
	
}
