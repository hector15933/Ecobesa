package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.DatosEvaluacion;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.ListaVerificacion;
import com.example.ecobesa.entity.ListaVerificacionItems;
import com.example.ecobesa.entity.RequisitosLegales;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.IDatosEvaluacionService;
import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IRangoLeyService;
import com.example.ecobesa.service.IRequisitosLegalesService;
import com.example.ecobesa.service.IUploadFileService;

@Controller
@SessionAttributes("requisitosLegales")
public class RequisitosLegalesController {
	
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	@Autowired
	private IRequisitosLegalesService requisitoLegalService;
	
	@Autowired
	private IDatosEvaluacionService datosEvaluacionService;
	
	@Autowired
	private IEmpresaService empresaService;
	
	
	@Autowired 
	private IRangoLeyService rangoLeyService;
	
	
	
	
	@GetMapping(value="RequisitosLegales/uploads/{filename:.+}")
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
	
	
	
	
	
	@RequestMapping(value={"/requisitosLegales/listar","/requisitosLegales/listar/{cat}/{param}"}, method = RequestMethod.GET)
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,
			Model model,@PathVariable(value = "cat", required = false) String cat,
			@PathVariable(value = "param", required = false) String param
			) {
		Pageable pageRequest = PageRequest.of(page,10);
		Page<RequisitosLegales> userListar = null;
		
		if (cat!= null && param != null) {
			
		
			/*if(cat.equals("nombres")) {
				userListar = requisitoLegalService.findByNombre(param, pageRequest);
			}
			if(cat.equals("apellidos")) {
				userListar = userService.findByApellidosStartsWith(param, pageRequest);
			}
			if(cat.equals("dni")) {
				userListar = userService.findByDniStartsWith(Integer.parseInt(param), pageRequest);
			}*/
	
			
		} else {
			userListar = requisitoLegalService.findAll(pageRequest);
		}
		
	
		
		//Page<User> userListar = userService.findAll(pageRequest);
		PageRender<RequisitosLegales> pageRender=new PageRender<RequisitosLegales>("/requisitosLegales/listar",userListar);
		
		model.addAttribute("titulo", "Users de trabajo / Editar users");
		model.addAttribute("lineasBases",userListar);
		model.addAttribute("requisitosLegales",requisitoLegalService.findAll());
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));
		model.addAttribute("page", pageRender);

		
				
		return "RequisitosLegales/requisitosLegales";
	}
	
	
	

	
	@GetMapping(value="requisitoLegal/ver/{id}")
	public String ver(Model model,@PathVariable(value="id") Long id,Map<String,Object> model2) {
		
		model.addAttribute("requisitoLegal",requisitoLegalService.findById(id));
		
		
		long id2=1;
		model.addAttribute("empresa", empresaService.findById(id2));
		

		return "RequisitosLegales/ver";
	}
	
	@RequestMapping(value="RequisitosLegales/form")
	public String crear(Map<String,Object> model) {
		
		RequisitosLegales requisitosLegales = new RequisitosLegales();
		model.put("requisitosLegales", requisitosLegales);
		model.put("rangoLeyes", rangoLeyService.findAll());
		model.put("titulo", "Crear Requisito Legal");
		
		return "RequisitosLegales/form";
	}
	
	
	@RequestMapping(value="RequisitosLegales/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,Object> model , RedirectAttributes flash) {
		
		RequisitosLegales requisitosLegales = null;
		
		if(id>0) {
			requisitosLegales = requisitoLegalService.findById(id);
			if(requisitosLegales==null) {
				flash.addFlashAttribute("error", "el id de la empresa no puede ser cero!");
				return "redirect:RequisitosLegales/listar";
			}
		}else {
			flash.addFlashAttribute("error", "El id de la empresa no puede ser cero!");
			return "redirect:/RequisitosLegales/listar";
		}
		
		model.put("rangoLeyes", rangoLeyService.findAll());
		model.put("requisitosLegales", requisitosLegales);
		model.put("titulo", "Editar Requisito Legal");
		
		return "RequisitosLegales/form";
	}
	
	
	@RequestMapping(value = "RequisitosLegales/form", method = RequestMethod.POST)
	public String guardar(@Valid RequisitosLegales requisitosLegales,BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empresa");
			return "RequisitosLegales/form";
		}
		if(!foto.isEmpty()) {
			if(requisitosLegales.getId() != null && requisitosLegales.getId()>0 && requisitosLegales.getArchivoNorma()!=null
					&& requisitosLegales.getArchivoNorma().length()>0) {
				
				uploadFileService.delete(requisitosLegales.getArchivoNorma());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			requisitosLegales.setArchivoNorma(uniqueFilename);
			
		}
	
		
		String mensajeFlash = (requisitosLegales.getId()!=null) ? "Datos  editado con Exito" : "Requisito Legal creada con exito!";
		
		requisitoLegalService.save(requisitosLegales);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/requisitosLegales/listar";
	}
	
	
	@PostMapping("/import/requisitosLegales/")
	public String mapReapExcelDatatoDB(Map<String, Object> model,@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
	    
		List<RequisitosLegales> tempStudentList = new ArrayList<RequisitosLegales>();
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(1);
	    
	    
	    List<DatosEvaluacion> tempStudentList2 = new ArrayList<DatosEvaluacion>();
	    XSSFWorkbook workbook2 = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet2 = workbook2.getSheetAt(2);
	    
	    try {
	        
	    	for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	    		RequisitosLegales tempStudent = new RequisitosLegales();
		            
		        XSSFRow row = worksheet.getRow(i);
		            
		        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
		        tempStudent.setRangoLey(rangoLeyService.findById((long)row.getCell(1).getNumericCellValue()));
		        tempStudent.setNombreNorma(row.getCell(2).getStringCellValue());
		        tempStudent.setAplicableDesde(row.getCell(3).getDateCellValue());
		        
		        tempStudentList.add(tempStudent);  
		       
		        requisitoLegalService.save(tempStudent);
		    }
	    	
	    	for(int i=1;i<worksheet2.getPhysicalNumberOfRows() ;i++) {
	    		DatosEvaluacion tempStudent = new DatosEvaluacion();
		            
		        XSSFRow row = worksheet2.getRow(i);
		            
		        //tempStudent.setId((long) row.getCell(0).getNumericCellValue());
		        tempStudent.setRequisitosLegales(requisitoLegalService.findById((long) Integer.valueOf((int)row.getCell(0).getNumericCellValue())));
		        tempStudent.setRequisitoLegalAplicable(row.getCell(1).getStringCellValue());
		        tempStudent.setResponsable(row.getCell(2).getStringCellValue());
		        tempStudent.setFechaPlanificada(row.getCell(3).getDateCellValue());
		        tempStudent.setEvidencia(row.getCell(4).getStringCellValue());
		        tempStudent.setEstado(row.getCell(5).getStringCellValue());
		        datosEvaluacionService.save(tempStudent);

		    }
	    	/*
		    model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
			model.put("lineaBase", lineaBaseService.findById((long)1));*/
			return "redirect:/requisitosLegales/listar";
	    	
		
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
				/*
				model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
				model.put("lineaBase", lineaBaseService.findById((long)1));
				return "redirect:../../lista-verificacion/1";*/
			}
			/*
		    model.put("listasVerificaciones", listaVerificacionService.findAllByLineaBaseId((long)1));
			model.put("lineaBase", lineaBaseService.findById((long)1));*/
			
		    return "redirect:/requisitosLegales/listar";
		}
	    
	    
	
	}

	
}
