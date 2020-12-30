package com.example.ecobesa.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

import com.example.ecobesa.entity.Empleado;
import com.example.ecobesa.service.IEmpleadoService;
import com.example.ecobesa.service.ISedeService;

@Controller
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService empleadoService;
	@Autowired
	ISedeService sedeService;
	
	@GetMapping("/admin/empleados")
	public String index(@RequestParam Map<String,Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())-1) : 0;
		PageRequest pageRequest = PageRequest.of(page, 10, Sort.by("id").descending());
		Page<Empleado> empleados = empleadoService.findAll(pageRequest);
		int totalPage=empleados.getTotalPages();
		if(totalPage>0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		model.addAttribute("empleados", empleados.getContent());
		model.addAttribute("actualPage", page+1);
		model.addAttribute("totalPage", totalPage);
		return "empleado/index";
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
