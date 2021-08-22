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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	@PutMapping("/empleados/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> editar(@RequestBody Empleado empleado,@PathVariable Long id){
		Empleado empleadoActual= empleadoService.findById(id);
		Empleado empleadoUpdated = null;

		Map<String,Object> response= new HashMap<>();
		if(empleadoActual == null) {	
			response.put("mensaje","Error: No se puede editar el  ID: ".concat(id.toString().concat("no existe en la base de datos")));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		try {
			/*empleadoActual.setApellidos(empleado.getApellidos());
			empleadoActual.setNombres(empleado.getNombres());
			empleadoActual.setDni(empleado.getDni());
			empleadoActual.setDireccion(empleado.getDireccion());
			empleadoActual.setEmail(empleado.getEmail());*/
			empleadoUpdated= empleadoService.save(empleado);	
		}catch(DataAccessException e) {
			response.put("message", "Error al actualizar datos en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);	
		}	
		response.put("message", "Actualizado correctamente");
		response.put("empleado", empleadoUpdated);
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);	
	}
	
	@DeleteMapping("/empleados/eliminar/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		Map<String,Object> response = new HashMap<>();
		
		try {
			empleadoService.delete(id);
		}catch(DataAccessException e) {
			response.put("message", "Error al eliminar datos en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		
		response.put("message", "Eliminado correctamente");
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);	
	}
	
	
	
}
