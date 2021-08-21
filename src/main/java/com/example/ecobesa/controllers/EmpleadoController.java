package com.example.ecobesa.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.entity.Riesgos;
import com.example.ecobesa.service.IEmpleadoService;
import com.example.ecobesa.service.ISedeService;

@RestController
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService empleadoService;
	@Autowired
	ISedeService sedeService;
	
	@GetMapping(value="/empleados")
	public String vista(Model model,Map<String, Object> model2) {
		
		return "empleados/index";
	}
	
	@GetMapping("/empleados/listar")
	public List<Empleado> listar() {
		List<Empleado> listas = empleadoService.findAll();
		return listas;
	}
	
	@GetMapping("/empleados/{id}")
	public ResponseEntity<?> show(@PathVariable Long id){
		Map<String,Object> response = new HashMap<>();
		Empleado empleado = null;
		try{
			 empleado = empleadoService.findById(id);	
		}catch(DataAccessException e){
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(empleado==null) {
			response.put("mensaje", "El Cliente ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Empleado>(empleado,HttpStatus.OK);		
	}
	
	@PostMapping("/empleados/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> create(@RequestBody Empleado empleado) {
		Map<String,Object> response = new HashMap<>();
		Empleado empleadoNew = null;
		try {
			empleadoNew= empleadoService.save(empleado);
			
		}catch(DataAccessException e){
			
			response.put("message", "Error al realizar insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("message", "Creado correctamente");
		response.put("cliente", empleadoNew);
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);	
	}
	
	
	@GetMapping(value = "/admin/empleados/show/{id}")
	public String show(@PathVariable(value = "id") Long id,Model model) {
		Empleado empleado = empleadoService.findById(id);
		model.addAttribute("empleado", empleado);
		return "empleado/show";
	}
	
	@GetMapping(value = "/admin/empleados/crear")
	public String create(Map<String, Object> model) {
		Empleado empleado = new Empleado();
		model.put("empleado", empleado);
		model.put("sedes", sedeService.findAll());
		model.put("titulo", "Registrar Nuevo Empleado");
		model.put("btn", "Registrar");
		//model.put("Empleados", EmpleadoService.findAll(Sort.by(Sort.Direction.ASC, "apellidos")));
		return "empleado/form";
	}
	
	@RequestMapping(value="/admin/empleados/editar/{id}")
	public String edit(@PathVariable(value="id") Long id,Map<String,Object> model) {
		//Validar que el id exista en la tabla empleados
		Empleado empleado = empleadoService.findById(id);
		model.put("titulo", "Editar Empleado");
		model.put("empleado",empleado);
		model.put("sedes", sedeService.findAll());
		model.put("btn","Actualizar");
		return "empleado/form";
	}
	
	@PostMapping(value = "/admin/empleados")
	public String guardar(@RequestParam("foto") MultipartFile foto,@Valid Empleado empleado,BindingResult bindingResult, Model model, RedirectAttributes flash) throws IOException {
		if(empleado.getId()!=null && foto.isEmpty()) {
			Empleado oldEmpleado = empleadoService.findById(empleado.getId());
			empleado.setFoto(oldEmpleado.getFoto());
		}else {
			if(!foto.isEmpty()) {
				byte[] fotoBytes = foto.getBytes();
				StringBuilder builder = new StringBuilder();
				builder.append("C:\\Spring\\Ecobesa\\src\\main\\resources\\static\\img\\empleados\\");
				builder.append(foto.getOriginalFilename());
				Path path=Paths.get(builder.toString());
				Files.write(path, fotoBytes);
				empleado.setFoto(foto.getOriginalFilename());
			}
		}
		empleadoService.save(empleado);
		flash.addFlashAttribute("success", "Acción realizada correctamente");
		return "redirect:/admin/empleados";
	}
	
	@GetMapping(value="/admin/empleados/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
		//validar que el id exista en la tabla Empleados
		try {
			empleadoService.delete(id);
			flash.addFlashAttribute("success", "Empleado eliminado correctamente");
			return "redirect:/admin/empleados";
		} catch (Exception e) {
			flash.addFlashAttribute("error", "Ocurrió un error al tratar de eliminar el usuario");
			return "redirect:/admin/empleados";
		}
	}
}
