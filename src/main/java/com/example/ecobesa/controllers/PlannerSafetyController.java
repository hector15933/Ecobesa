package com.example.ecobesa.controllers;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.PlannerSafety;
import com.example.ecobesa.service.IPlannerSafetyService;

@Controller
public class PlannerSafetyController {
	
	@Autowired
	private IPlannerSafetyService plannerSafetyService;
	
	
	@GetMapping(value="/plannerSafety/listar")
	public String listar(Model model,Map<String, Object> model2) {
		
		Date fecha = new Date();
		Integer param= fecha.getMonth();
		Integer param2=0;
		if(param==0) {
			
		}
		
		model.addAttribute("titulo", "Planner Safety de trabajo / Editar plannerSafetys");
		model.addAttribute("titulo2", "Agregar PlannerSafety de trabajo");
		model.addAttribute("plannerSafetys",plannerSafetyService.findAll(Sort.by("id")));
		model.addAttribute("plannerSafetysMesAtrasados",plannerSafetyService.findAllByMonthAnteriores(param+1));
		model.addAttribute("plannerSafetysMesActual",plannerSafetyService.findAllByMonth(param+1));
		model.addAttribute("plannerSafetysMesSiguiente",plannerSafetyService.findAllByMonth(param+2));
		
		
		
		PlannerSafety plannerSafety = new PlannerSafety();
		
		model2.put("plannerSafety", plannerSafety);
		model2.put("titulo3", "Crear PlannerSafety de Trabajo");
				 
		return "PlannerSafety/listar";
	}
	
	@PostMapping(value="/plannerSafety/listar")
	public String guardar(@Valid PlannerSafety plannerSafety ,BindingResult bindingResult,Model model,Map<String, Object> model2,RedirectAttributes flash) {
		if(bindingResult.hasErrors()){
			model.addAttribute("titulo", "Planner Safety de trabajo / Editar plannerSafetys");
			model.addAttribute("titulo2", "Agregar PlannerSafety de trabajo");
			model.addAttribute("plannerSafetys",plannerSafetyService.findAll(Sort.by("id")));
			model2.put("titulo3", "Crear PlannerSafety de Trabajo");
			
			return "PlannerSafety/listar";
		}
		flash.addFlashAttribute("success", "PlannerSafety creado correctamente");
		plannerSafetyService.save(plannerSafety);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/plannerSafety/listar/{id}")
	public String editar(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2,RedirectAttributes flash) {
		
		model.addAttribute("plannerSafetys",plannerSafetyService.findAll(Sort.by("id")));
		PlannerSafety plannerSafety=null;
		if(id>0){
			plannerSafety = plannerSafetyService.findById(id);
		}else {
			return "redirect:/PlannerSafety/listar";
		}
		model2.put("plannerSafety",plannerSafety);
		flash.addFlashAttribute("success", "PlannerSafety Editado correctamente");
		model.addAttribute("titulo", "Planner Safety de trabajo / Editar plannerSafety ");
		model2.put("titulo2","Editar PlannerSafety de trabajo");
		model2.put("titulo3", "Editar PlannerSafety de Trabajo");          
		
		
		return "PlannerSafety/listar";
	}
	@GetMapping(value="/plannerSafety/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash, Locale locale) {
		
		try {
			if (id > 0) {
				PlannerSafety plannerSafety=plannerSafetyService.findById(id);
				plannerSafetyService.delete(id);
				flash.addFlashAttribute("success", "PlannerSafety eliminado correctamente");
			}
			return "redirect:/PlannerSafety/listar";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "El plannerSafety no se puede eliminar porque aun esta asignado a usuarios");
			return "redirect:/PlannerSafety/listar";
		}
		
	}
	
	
	
}
