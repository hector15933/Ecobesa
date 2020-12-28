package com.example.ecobesa.controllers;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.Actividad;
import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.service.IActividadService;
import com.example.ecobesa.service.IObjetivoGeneralService;

@Controller
public class ActividadController {
	
	@Autowired
	private IObjetivoGeneralService objetivoGeneralService;
	@Autowired
	private IActividadService actividadService;
	
	@GetMapping(value="/actividades/{id}")
	public String index(@PathVariable(value = "id") Long id, Map<String, Object> model) {
		model.put("actividades", objetivoGeneralService.findById(id).getActividad());
		model.put("objetivoGeneral", objetivoGeneralService.findById(id));
		return "actividad/index";
	}
	
	@GetMapping(value = "/actividades/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		Actividad actividad = actividadService.findById(id);
		model.put("actividad", actividad);
		return "actividad/show";
	}
	
	@GetMapping(value = "/actividades/crear/{id}")
	public String crear(@PathVariable(value = "id") Long id,Map<String, Object> model) {
		ObjetivoGeneral objetivoGeneral = objetivoGeneralService.findById(id);
		Actividad actividad = new Actividad();
		actividad.setObjetivoGeneral(objetivoGeneral);
		model.put("actividad", actividad);
		model.put("titulo", "Crear Actividad");
		model.put("btn", "Crear");
		return "actividad/form";
	}
	
	@RequestMapping(value="/actividades/editar/{id}")
	public String editar(@PathVariable(value="id") Long id,Map<String,Object> model) {
		Actividad actividad=null;
		if(id>0){
			actividad = actividadService.findById(id);
		}else {
			
		}
		model.put("titulo", "Editar");
		model.put("actividad",actividad);
		model.put("btn","Actualizar");
		return "actividad/form";
	}
	
	@GetMapping(value="/actividades/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//Validar que el id exista en la tabla actividad
		Long objetivoGeneralId=actividadService.findById(id).getObjetivoGeneral().getId();
		String ruta="redirect:/actividades/"+objetivoGeneralId;
		try {
			actividadService.delete(id);
			flash.addFlashAttribute("success", "Actividad eliminada correctamente");
			return ruta;
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar la actividad");
			return ruta;
		}
	}
}
