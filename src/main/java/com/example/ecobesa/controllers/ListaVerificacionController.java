package com.example.ecobesa.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.example.ecobesa.entity.ListaVerificacion;
import com.example.ecobesa.entity.ListaVerificacionItems;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.ILineaBaseService;
import com.example.ecobesa.service.ILineamientoService;
import com.example.ecobesa.service.IListaVerificacionItemService;
import com.example.ecobesa.service.IListaVerificacionService;


@Controller
public class ListaVerificacionController {
	
	
	@Autowired
	private IListaVerificacionService listaVerificacionService;
	@Autowired
	private ILineaBaseService lineaBaseService;
	@Autowired
	private IListaVerificacionItemService listaVerificacionItemSerivice;
	@Autowired
	private ILineamientoService lineamientoService;

	
	
	
	@GetMapping(value="/lista-verificacion/{id}")
	public String index(@PathVariable(value = "id") Long id, Map<String, Object> model) {
		model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId(id));
		model.put("lineaBase", lineaBaseService.findById(id));
		model.put("titulo", "Capitulos de auditoria / Editar capitulos");
		return "lista-verificacion/index";
	}
	@GetMapping(value="/lista-verificacion/listar")
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,Model model,Map<String, Object> model2) {
		
		Pageable pageRequest = PageRequest.of(page,10);
		Page<ListaVerificacion> listaVerificacionListar = listaVerificacionService.findAll(pageRequest);
		PageRender<ListaVerificacion> pageRender=new PageRender<ListaVerificacion>("/lista-verificacion/listar",listaVerificacionListar);
		
		model.addAttribute("titulo", "Capitulos de auditoria / Editar capitulos");
		model.addAttribute("titulo2", "Agregar Capitulo de auditoria");
		model.addAttribute("listaVerificaciones",listaVerificacionListar);
		model.addAttribute("page", pageRender);
		
		ListaVerificacion listaVerificacion = new ListaVerificacion();
		
		model2.put("listaVerificacion", listaVerificacion);
		model2.put("titulo3", "Crear Capitulo de Auditoria");
				
		return "lista-verificacion/listar";
	}
	
	
	
	
	
	
	
	@PostMapping("/import/checkListItems")
	public String mapReapExcelDatatoDB2(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
	    
	    List<ListaVerificacionItems> tempStudentList = new ArrayList<ListaVerificacionItems>();
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    
	    for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	    	ListaVerificacionItems tempStudent = new ListaVerificacionItems();
	            
	        XSSFRow row = worksheet.getRow(i);
	            
	        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
	        tempStudent.setListaVerificacion(listaVerificacionService.findById((long)1));
	        tempStudent.setLineamiento(lineamientoService.findById((long)1));
	        tempStudent.setIndicador(row.getCell(1).getStringCellValue());
	        tempStudentList.add(tempStudent);  
	        
	        listaVerificacionItemSerivice.saveAll(tempStudentList);
	    }
	    
	    
	    
	    return "lista-verificacion/index";
	}
	
	
	@PostMapping("/import/checkList/{id}")
	public String mapReapExcelDatatoDB(@PathVariable(value = "id") Long id,Map<String, Object> model,@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
	    
		List<ListaVerificacion> tempStudentList = new ArrayList<ListaVerificacion>();
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    
	    
	    List<ListaVerificacionItems> tempStudentList2 = new ArrayList<ListaVerificacionItems>();
	    XSSFWorkbook workbook2 = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet2 = workbook2.getSheetAt(1);
	    
	    try {
	        
	    	for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
		    	ListaVerificacion tempStudent = new ListaVerificacion();
		            
		        XSSFRow row = worksheet.getRow(i);
		            
		        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
		        tempStudent.setLineaBase(lineaBaseService.findById(id));
		        tempStudent.setNombre(row.getCell(1).getStringCellValue());
		        

		        
		        tempStudentList.add(tempStudent);  
		       
		        listaVerificacionService.save(tempStudent);
		    }
	    	
	    	for(int i=1;i<worksheet2.getPhysicalNumberOfRows() ;i++) {
	    		ListaVerificacionItems tempStudent = new ListaVerificacionItems();
		            
		        XSSFRow row = worksheet2.getRow(i);
		            
		        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
		        tempStudent.setListaVerificacion(listaVerificacionService.findById((long) Integer.valueOf((int)row.getCell(0).getNumericCellValue())));
		        tempStudent.setLineamiento(lineamientoService.findById((long) Integer.valueOf((int)row.getCell(1).getNumericCellValue())));
		        tempStudent.setIndicador(row.getCell(2).getStringCellValue());
		        tempStudent.setPuntuacion(Integer.valueOf((int) row.getCell(3).getNumericCellValue()));
		        listaVerificacionItemSerivice.save(tempStudent);

		    }
	    	
		    model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
			model.put("lineaBase", lineaBaseService.findById((long)1));
			return "redirect:../../lista-verificacion/1";
	    	
		
		} catch (Exception e) {
			try {/*
				for(int i=1;i<worksheet2.getPhysicalNumberOfRows() ;i++) {
		    		ListaVerificacionItems tempStudent = new ListaVerificacionItems();
			            
			        XSSFRow row = worksheet2.getRow(i);
			            
			        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
			        tempStudent.setListaVerificacion(listaVerificacionService.findById((long) Integer.valueOf((int)row.getCell(0).getNumericCellValue())));
			        tempStudent.setLineamiento(lineamientoService.findById((long)1));
			        tempStudent.setIndicador(row.getCell(2).getStringCellValue());
			        tempStudent.setPuntuacion(Integer.valueOf((int) row.getCell(3).getNumericCellValue()));
			        listaVerificacionItemSerivice.save(tempStudent);
			 		
			    }	*/
			} catch (Exception e2) {
				  model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
				model.put("lineaBase", lineaBaseService.findById((long)1));
				return "redirect:../../lista-verificacion/1";
			}
			
		    model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
			model.put("lineaBase", lineaBaseService.findById((long)1));
		    return "redirect:../../lista-verificacion/1";
		}
	    
	    
	
	}
}
