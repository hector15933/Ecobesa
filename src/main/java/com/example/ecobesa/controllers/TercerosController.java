package com.example.ecobesa.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.entity.AltoRiesgo;
import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.ExtencionPermanente;
import com.example.ecobesa.entity.ExtencionTemporal;
import com.example.ecobesa.entity.Terceros;
import com.example.ecobesa.paginator.PageRender;
import com.example.ecobesa.service.IAltoRiesgoService;
import com.example.ecobesa.service.IExtencionPermanenteService;
import com.example.ecobesa.service.IExtencionTemporalService;
import com.example.ecobesa.service.ITercerosService;
import com.example.ecobesa.service.IUploadFileService;
import com.example.ecobesa.service.IUserService;

@Controller
@SessionAttributes("terceros")
public class TercerosController {
	
	@Autowired
	private ITercerosService tercerosService;
	
	@Autowired
	private IExtencionPermanenteService extencionPermanenteService;
	
	@Autowired
	private IExtencionTemporalService extencionTemporalService;
	
	@Autowired
	private IAltoRiesgoService altoRiesgoService;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	
	@GetMapping(value="/terceros/uploads/{filename:.+}")
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
	
	

	
	@GetMapping(value= {"/terceros/listar","/terceros/listar/{cat}/{param}"})
	public String listar(@RequestParam(name = "page",defaultValue = "0") int page,
			Model model,@PathVariable(value = "cat", required = false) String cat,
			@PathVariable(value = "param", required = false) String param) {
		
		
		
		Pageable pageRequest = PageRequest.of(page,10);
		Page<Terceros> tercerosListar = tercerosService.findAll(pageRequest);

		
		PageRender<Terceros> pageRender=new PageRender<Terceros>("/terceros/listar",tercerosListar);
		
		
		model.addAttribute("titulo", "Seguimiento Terceros");
		model.addAttribute("titulo2", "Agregar Empresa");
		model.addAttribute("listaVerificaciones",tercerosListar);
		model.addAttribute("page", pageRender);
				
		return "terceros/listar";
		
	}
	
	@RequestMapping(value="terceros/form")
	public String crear(Map<String,Object> model) {
		
		Terceros terceros = new Terceros();
		model.put("terceros", terceros);
		model.put("titulo", "Agregar Empresa");
		model.put("users", userService.findAll());
		
		
		
		return "terceros/form";
	}
	
	@RequestMapping(value = "tercero/form", method = RequestMethod.POST)
	public String guardar(@Valid Terceros terceros,BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario Empresa");
			return "terceros/form";
		}
		if(!foto.isEmpty()) {
			if(terceros.getId() != null && terceros.getId()>0 && terceros.getListaColaboradores()!=null
					&& terceros.getListaColaboradores().length()>0) {
				
				uploadFileService.delete(terceros.getListaColaboradores());
			}
			
			String uniqueFilename = null;
			
			try {
				uniqueFilename = uploadFileService.copy(foto);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			flash.addFlashAttribute("info", "Has subido correctamente  '"+uniqueFilename +"'");
			
			terceros.setListaColaboradores(uniqueFilename);
			
		}
	
	
		String mensajeFlash = (terceros.getId()!=null) ? "Datos Empresa editado con Exito" : "Empresa creada con exito!";
		

		
		List<ExtencionPermanente> extencionPermanente = new ArrayList<ExtencionPermanente>();
		
		ExtencionPermanente extencion001= new ExtencionPermanente("¿Se realiza una evaluación de riesgos en el área de trabajo,  instalaciones y equipos? IPERC.",terceros);
		ExtencionPermanente extencion002= new ExtencionPermanente("Registro de Participación de los trabajadores en la elaboración del IPERC y Mapa de Riesgos",terceros);
		ExtencionPermanente extencion003= new ExtencionPermanente("¿Se presenta un trabajo que no se contenplo en la IPERC inicial?",terceros);
		ExtencionPermanente extencion004= new ExtencionPermanente("¿Cuenta ATS para trabajos Controlados?",terceros);
		ExtencionPermanente extencion005= new ExtencionPermanente("Relacion de Trabajadores Formato Lindley (Capacitaciones, EMO)",terceros);
		ExtencionPermanente extencion006= new ExtencionPermanente("SCTR Salud, Pensión",terceros);
		ExtencionPermanente extencion007= new ExtencionPermanente("Informe de  Monitoreo de agentes físicos, quimicos, biológicos, psicosociales, y factores de riesgo disergonomico; certificado de calibración de Equipos.",terceros);
		ExtencionPermanente extencion008= new ExtencionPermanente("Informe Trimestral de Resultados de Seguridad. / Informe Anual",terceros);
		ExtencionPermanente extencion009= new ExtencionPermanente("Evaluación de Linea Base de Seguridad y Salud en el Trabajo",terceros);
		ExtencionPermanente extencion0010= new ExtencionPermanente("¿Cuentan con un Comité de Seguridad e Higiene ocupacional, que se reúna periódicamente? Acta de Conformación de Comité.",terceros);
		ExtencionPermanente extencion0011= new ExtencionPermanente("Registro del Proceso Electoral del Comité Paritario.",terceros);
		ExtencionPermanente extencion0012= new ExtencionPermanente("Libro de Actas del Comité Paritario de SST.",terceros);
		ExtencionPermanente extencion0013= new ExtencionPermanente("¿Cuenta con un Supervisor de Seguridad y/o Prevencioncita de Riesgos? Curriculum",terceros);
		ExtencionPermanente extencion0014= new ExtencionPermanente("¿Cuenta con Política de Seguridad y Salud en el Trabajo? Objetivos en Materia de SST.",terceros);
		ExtencionPermanente extencion0015= new ExtencionPermanente("¿Posee un Reglamento de Seguridad y Salud en el Trabajo aprobado por el Ministerio de Trabajo?",terceros);
		ExtencionPermanente extencion0016= new ExtencionPermanente("Plan Anual de Seguridad y Salud en el Trabajo",terceros);
		ExtencionPermanente extencion0017= new ExtencionPermanente("¿Cuenta con Programa Anual de Seguridad y Salud en el Trabajo?",terceros);
		ExtencionPermanente extencion0018= new ExtencionPermanente("¿Programa Anual de Capacitaciones ?",terceros);
		ExtencionPermanente extencion0019= new ExtencionPermanente("¿Cuenta con Organigrama?",terceros);
		ExtencionPermanente extencion0020= new ExtencionPermanente("Perfil de Puestos ; Incluir responsabilidades y definición de competencias.",terceros);
		ExtencionPermanente extencion0021= new ExtencionPermanente("¿ Cuenta con Mapa de Riesgos?",terceros);
		ExtencionPermanente extencion0022= new ExtencionPermanente("¿Cuenta con Equipos Certificados?",terceros);
		ExtencionPermanente extencion0023= new ExtencionPermanente("¿MSDS de productos a utilizar?",terceros);
		ExtencionPermanente extencion0024= new ExtencionPermanente("Procedimiento de  Reporte de actos y condiciones",terceros);
		ExtencionPermanente extencion0025= new ExtencionPermanente("Procedimiento de Identificación de Peligros Evaluación y Control de Riesgos",terceros);
		ExtencionPermanente extencion0026= new ExtencionPermanente("Procedimiento de Preparación y respuesta a emergencias",terceros);
		ExtencionPermanente extencion0027= new ExtencionPermanente("Investigación de Incidentes, accidentes",terceros);
		ExtencionPermanente extencion0028= new ExtencionPermanente("Inspecciones planeadas (de trabajo en campo) EPP, Herramientas.",terceros);
		ExtencionPermanente extencion0029= new ExtencionPermanente("Trabajos en Altura.",terceros);
		ExtencionPermanente extencion0030= new ExtencionPermanente("Trabajos en Espacios Confinados.",terceros);
		ExtencionPermanente extencion0031= new ExtencionPermanente("Perforación con taladros, excavación de superficies.",terceros);
		ExtencionPermanente extencion0032= new ExtencionPermanente("Trabajos en caliente.",terceros);
		ExtencionPermanente extencion0033= new ExtencionPermanente("Trabajos eléctricos.",terceros);
		ExtencionPermanente extencion0034= new ExtencionPermanente("Trabajos con Energía Peligrosa.",terceros);
		ExtencionPermanente extencion0035= new ExtencionPermanente("Trabajo con Materiales Peligrosos",terceros);
		ExtencionPermanente extencion0036= new ExtencionPermanente("Izajes, movimientos de maquinaria.",terceros);
		ExtencionPermanente extencion0037= new ExtencionPermanente("Seguridad en operación de vehículos / grúas / montacargas, etc.",terceros);
		ExtencionPermanente extencion0038= new ExtencionPermanente("Procedimiento de Trabajo Seguro Tareas Criticas",terceros);
		ExtencionPermanente extencion0039= new ExtencionPermanente("Registro de accidentes de trabajo, enfermedades ocupacionales, incidentes peligrosos y otros incidentes.",terceros);
		ExtencionPermanente extencion0040= new ExtencionPermanente("Registro de exámenes médicos ocupacionales.",terceros);
		ExtencionPermanente extencion0041= new ExtencionPermanente("Registro del monitoreo de agentes físicos, químicos, biológicos, psicosociales y factores de riesgo disergonómicos.",terceros);
		ExtencionPermanente extencion0042= new ExtencionPermanente("Registro de Entrega de Epps",terceros);	
		ExtencionPermanente extencion0043= new ExtencionPermanente("Registro de inspecciones internas de seguridad y salud en el trabajo. Extintores; EPPs; Herramientas, botiquines.",terceros);
		ExtencionPermanente extencion0044= new ExtencionPermanente("Registro de estadísticas de seguridad y salud y sus tendencias.",terceros);
		ExtencionPermanente extencion0045= new ExtencionPermanente("Registro de equipos de seguridad o emergencia.",terceros);
		ExtencionPermanente extencion0046= new ExtencionPermanente("Registro de Simulacros de emergencia.",terceros);
		ExtencionPermanente extencion0047= new ExtencionPermanente("Registro de auditorías.",terceros);
		ExtencionPermanente extencion0048= new ExtencionPermanente("Registro de reporte de actos y condiciones",terceros);
		ExtencionPermanente extencion0049= new ExtencionPermanente("DECLARACIÓN JURADA DE CUMPLIMIENTO DE REQUISITOS DE SEGURIDAD",terceros);
		
		
		extencionPermanente.add(extencion001);
		extencionPermanente.add(extencion002);
		extencionPermanente.add(extencion003);
		extencionPermanente.add(extencion004);
		extencionPermanente.add(extencion005);
		extencionPermanente.add(extencion006);
		extencionPermanente.add(extencion007);
		extencionPermanente.add(extencion008);
		extencionPermanente.add(extencion009);
		extencionPermanente.add(extencion0010);
		extencionPermanente.add(extencion0011);
		extencionPermanente.add(extencion0012);
		extencionPermanente.add(extencion0013);
		extencionPermanente.add(extencion0014);
		extencionPermanente.add(extencion0015);
		extencionPermanente.add(extencion0016);
		extencionPermanente.add(extencion0017);
		extencionPermanente.add(extencion0018);
		extencionPermanente.add(extencion0019);
		extencionPermanente.add(extencion0020);
		extencionPermanente.add(extencion0021);
		extencionPermanente.add(extencion0022);
		extencionPermanente.add(extencion0023);
		extencionPermanente.add(extencion0024);
		extencionPermanente.add(extencion0025);
		extencionPermanente.add(extencion0026);
		extencionPermanente.add(extencion0027);
		extencionPermanente.add(extencion0028);
		extencionPermanente.add(extencion0029);
		extencionPermanente.add(extencion0030);
		extencionPermanente.add(extencion0031);
		extencionPermanente.add(extencion0032);
		extencionPermanente.add(extencion0033);
		extencionPermanente.add(extencion0034);
		extencionPermanente.add(extencion0035);
		extencionPermanente.add(extencion0036);
		extencionPermanente.add(extencion0037);
		extencionPermanente.add(extencion0038);
		extencionPermanente.add(extencion0039);
		extencionPermanente.add(extencion0040);
		extencionPermanente.add(extencion0041);
		extencionPermanente.add(extencion0042);
		extencionPermanente.add(extencion0043);
		extencionPermanente.add(extencion0044);
		extencionPermanente.add(extencion0045);
		extencionPermanente.add(extencion0046);
		extencionPermanente.add(extencion0047);
		extencionPermanente.add(extencion0048);
		extencionPermanente.add(extencion0049);
		
		
		List<ExtencionTemporal> extencionTemporal = new ArrayList<ExtencionTemporal>();
		
		List<AltoRiesgo> altoRiesgo= new ArrayList<AltoRiesgo>();
		
		
		
		
		ExtencionTemporal extencionTemporal001= new ExtencionTemporal("REQUISITOS BASICOS",terceros);	
		ExtencionTemporal extencionTemporal002= new ExtencionTemporal("TRABAJO EN ALTURA",terceros);	
		ExtencionTemporal extencionTemporal003= new ExtencionTemporal("TRABAJO CON ENERGIA PELIGROSA ",terceros);	
		ExtencionTemporal extencionTemporal004= new ExtencionTemporal("TRABAJOS CON MATPEL",terceros);	
		ExtencionTemporal extencionTemporal005= new ExtencionTemporal("TRABAJOS EN CALIENTE",terceros);	
		ExtencionTemporal extencionTemporal006= new ExtencionTemporal("TRABAJO EN ESPACIO CONFINADO",terceros);	
		ExtencionTemporal extencionTemporal007= new ExtencionTemporal("TRABAJO CON ENERGIA ELECTRICA",terceros);	
		ExtencionTemporal extencionTemporal008= new ExtencionTemporal("TRABAJO DE PERFORACION Y EXCAVACION ",terceros);	
		ExtencionTemporal extencionTemporal009= new ExtencionTemporal("IZAJE MONTAJE",terceros);	
		
		AltoRiesgo altoRiesgo001=new AltoRiesgo("SCTR (Salud y Pensión)",extencionTemporal001);
		AltoRiesgo altoRiesgo002=new AltoRiesgo("IPERC o ATS",extencionTemporal001);
		AltoRiesgo altoRiesgo003=new AltoRiesgo("Certificado de Aptitud Medico Ocupacional",extencionTemporal001);
		AltoRiesgo altoRiesgo004=new AltoRiesgo("Declaracion Jurada de que el personal esta Capacitado / Capacitaciones ",extencionTemporal001);
		AltoRiesgo altoRiesgo005=new AltoRiesgo("Inducción (Realizada en la empresa usuaria )",extencionTemporal001);
		AltoRiesgo altoRiesgo006=new AltoRiesgo("Plan de trabajo",extencionTemporal001);
		AltoRiesgo altoRiesgo007=new AltoRiesgo("Declaración Jurada de Cumplimiento de Requisitos de Seguridad",extencionTemporal001);
		AltoRiesgo altoRiesgo008=new AltoRiesgo("Prevencionista de Riesgo (Solo para Trabajos Controlados)",extencionTemporal001);
		
		
		
		
		AltoRiesgo altoRiesgo009=new AltoRiesgo("Cerficado de Aptitud Medica Ocupacional Altura Estructural",extencionTemporal002);
		AltoRiesgo altoRiesgo0010=new AltoRiesgo("Capacitación en Trabajos en Altura ",extencionTemporal002);
		AltoRiesgo altoRiesgo0011=new AltoRiesgo("Inspección de Preuso de Equipos Contra Caidas",extencionTemporal002);
		AltoRiesgo altoRiesgo0012=new AltoRiesgo("Check List de Andamios y/o Escaleras",extencionTemporal002);
		AltoRiesgo altoRiesgo0013=new AltoRiesgo("Plan de Rescate",extencionTemporal002);
		AltoRiesgo altoRiesgo0014=new AltoRiesgo("Andamios Multidireccional  y Escaleras Homologadas",extencionTemporal002);
		AltoRiesgo altoRiesgo0015=new AltoRiesgo("Certificado de EPPs Contra Caidas",extencionTemporal002);
		AltoRiesgo altoRiesgo0016=new AltoRiesgo("Entrenamiento en Montaje de Andamios",extencionTemporal002);
		AltoRiesgo altoRiesgo0017=new AltoRiesgo("Procedimientos de Trabajos en Altura",extencionTemporal002);
		AltoRiesgo altoRiesgo0018=new AltoRiesgo("Certificados de Operador de Plantaforma Elevadora y/o Similares",extencionTemporal002);
		AltoRiesgo altoRiesgo0019=new AltoRiesgo("Certificación de Puntos de Anclaje y Estructuras",extencionTemporal002);
		
		AltoRiesgo altoRiesgo0020=new AltoRiesgo("Capacitación entranamiento en LOTO",extencionTemporal003);
		AltoRiesgo altoRiesgo0021=new AltoRiesgo("Equipos de Bloqueo y Tarjeteo",extencionTemporal003);
		AltoRiesgo altoRiesgo0022=new AltoRiesgo("Inspección de Equipos de Bloqueo",extencionTemporal003);
		AltoRiesgo altoRiesgo0023=new AltoRiesgo("Formato de Identificación de las Energias Peligrosas a Trabajar ",extencionTemporal003);
		
		AltoRiesgo altoRiesgo0025=new AltoRiesgo("Capacitación en Matpel",extencionTemporal004);
		AltoRiesgo altoRiesgo0026=new AltoRiesgo("Hojas de MSDS",extencionTemporal004);
		AltoRiesgo altoRiesgo0027=new AltoRiesgo("Relación o Lista de Quimicos ",extencionTemporal004);
		AltoRiesgo altoRiesgo0028=new AltoRiesgo("Kit antiderrames / Contenedor Secundario",extencionTemporal004);
		AltoRiesgo altoRiesgo0029=new AltoRiesgo("Plan de Contingencia",extencionTemporal004);
		AltoRiesgo altoRiesgo0030=new AltoRiesgo("Prueba hidrostática vigente para cilindros de Gas comprimido Certificado de Valvulas",extencionTemporal004);
		
		AltoRiesgo altoRiesgo0031=new AltoRiesgo("Capacitación para Trabajos en Caliente. Ejecutante / Vigia",extencionTemporal005);
		AltoRiesgo altoRiesgo0032=new AltoRiesgo("Inspección Preuso de Maquina de Soldar",extencionTemporal005);
		AltoRiesgo altoRiesgo0033=new AltoRiesgo("Ficha Tecnica de Arnes Ignifugo",extencionTemporal005);
		AltoRiesgo altoRiesgo0034=new AltoRiesgo("Certificado de Mantas, Bionbos Ignifugos",extencionTemporal005);
		AltoRiesgo altoRiesgo0035=new AltoRiesgo("Plan de Contingencia",extencionTemporal005);
		AltoRiesgo altoRiesgo0036=new AltoRiesgo("Monitoreo de Gases Area Sensible Trabajo en Caliente / E Confinado",extencionTemporal005);
		
		AltoRiesgo altoRiesgo0037=new AltoRiesgo("Cerficado de Aptitud Medica Ocupacional Espacio Confinado",extencionTemporal006);
		AltoRiesgo altoRiesgo0038=new AltoRiesgo("Capacitación en Espacio Confinado (Entrante/Vigia /Supervisor).",extencionTemporal006);
		AltoRiesgo altoRiesgo0039=new AltoRiesgo("Plan de Rescate",extencionTemporal006);
		AltoRiesgo altoRiesgo0040=new AltoRiesgo("Brigada de Rescate",extencionTemporal006);
		AltoRiesgo altoRiesgo0041=new AltoRiesgo("Medidor de Gas / Certificado de Calibración",extencionTemporal006);
		AltoRiesgo altoRiesgo0042=new AltoRiesgo("Ventilación Forzada",extencionTemporal006);
		AltoRiesgo altoRiesgo0043=new AltoRiesgo("Equipos de Rescate Certificados",extencionTemporal006);
		
		AltoRiesgo altoRiesgo0044=new AltoRiesgo("Certificación Técnica Eléctricista",extencionTemporal007);
		AltoRiesgo altoRiesgo0045=new AltoRiesgo("Equipos Dielectricos ;  herramientas dieléctricas",extencionTemporal007);
		AltoRiesgo altoRiesgo0046=new AltoRiesgo("Equipos de Medición y Reveladores / Certificados de Calibración",extencionTemporal007);
		AltoRiesgo altoRiesgo0047=new AltoRiesgo("Equipos de Protección acordes al nivel de tensión ver NFPA 70",extencionTemporal007);
		
		AltoRiesgo altoRiesgo0048=new AltoRiesgo("Capacitación en Perforación y Excavación",extencionTemporal008);
		AltoRiesgo altoRiesgo0049=new AltoRiesgo("Capacitación en Perforación y Excavación",extencionTemporal008);
		
		AltoRiesgo altoRiesgo0050=new AltoRiesgo("Capacitación de Izaje y Montaje / Capacitación de Rigger",extencionTemporal009);
		AltoRiesgo altoRiesgo0051=new AltoRiesgo("Certificado de Operador de Maquinaria",extencionTemporal009);
		AltoRiesgo altoRiesgo0052=new AltoRiesgo("Certificado de Equipo y Accesorios",extencionTemporal009);
		AltoRiesgo altoRiesgo0053=new AltoRiesgo("Plan de Izaje",extencionTemporal009);
		
		
		altoRiesgo.add(altoRiesgo001);
		altoRiesgo.add(altoRiesgo002);
		altoRiesgo.add(altoRiesgo003);
		altoRiesgo.add(altoRiesgo004);
		altoRiesgo.add(altoRiesgo005);
		altoRiesgo.add(altoRiesgo006);
		altoRiesgo.add(altoRiesgo007);
		altoRiesgo.add(altoRiesgo008);
		altoRiesgo.add(altoRiesgo009);
		altoRiesgo.add(altoRiesgo0010);
		altoRiesgo.add(altoRiesgo0011);
		altoRiesgo.add(altoRiesgo0012);
		altoRiesgo.add(altoRiesgo0013);
		altoRiesgo.add(altoRiesgo0014);
		altoRiesgo.add(altoRiesgo0015);
		altoRiesgo.add(altoRiesgo0016);
		altoRiesgo.add(altoRiesgo0017);
		altoRiesgo.add(altoRiesgo0018);
		altoRiesgo.add(altoRiesgo0019);
		altoRiesgo.add(altoRiesgo0020);
		altoRiesgo.add(altoRiesgo0021);
		altoRiesgo.add(altoRiesgo0022);
		altoRiesgo.add(altoRiesgo0023);
		altoRiesgo.add(altoRiesgo0025);
		altoRiesgo.add(altoRiesgo0026);
		altoRiesgo.add(altoRiesgo0027);
		altoRiesgo.add(altoRiesgo0028);
		altoRiesgo.add(altoRiesgo0029);
		altoRiesgo.add(altoRiesgo0030);
		altoRiesgo.add(altoRiesgo0031);
		altoRiesgo.add(altoRiesgo0032);
		altoRiesgo.add(altoRiesgo0033);
		altoRiesgo.add(altoRiesgo0034);
		altoRiesgo.add(altoRiesgo0035);
		altoRiesgo.add(altoRiesgo0036);
		altoRiesgo.add(altoRiesgo0037);
		altoRiesgo.add(altoRiesgo0038);
		altoRiesgo.add(altoRiesgo0039);
		altoRiesgo.add(altoRiesgo0040);
		altoRiesgo.add(altoRiesgo0041);
		altoRiesgo.add(altoRiesgo0042);
		altoRiesgo.add(altoRiesgo0043);
		altoRiesgo.add(altoRiesgo0044);
		altoRiesgo.add(altoRiesgo0045);
		altoRiesgo.add(altoRiesgo0046);
		altoRiesgo.add(altoRiesgo0047);
		altoRiesgo.add(altoRiesgo0048);
		altoRiesgo.add(altoRiesgo0049);
		altoRiesgo.add(altoRiesgo0050);
		altoRiesgo.add(altoRiesgo0051);
		altoRiesgo.add(altoRiesgo0052);
		altoRiesgo.add(altoRiesgo0053);
		
		
		
		
		extencionTemporal.add(extencionTemporal001);
		extencionTemporal.add(extencionTemporal002);
		extencionTemporal.add(extencionTemporal003);
		extencionTemporal.add(extencionTemporal004);
		extencionTemporal.add(extencionTemporal005);
		extencionTemporal.add(extencionTemporal006);
		extencionTemporal.add(extencionTemporal007);
		extencionTemporal.add(extencionTemporal008);
		extencionTemporal.add(extencionTemporal009);
		
		
		tercerosService.save(terceros);
		extencionPermanenteService.saveAll(extencionPermanente);
		extencionTemporalService.saveAll(extencionTemporal);
		altoRiesgoService.saveAll(altoRiesgo);
		
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		
		return "redirect:/terceros/listar";
	}
	
	@GetMapping(value="terceros/ver-permanente/{id}")
	public String ver(@PathVariable(value="id") Long id, Map<String,Object> model, RedirectAttributes flash) {
		
		Terceros terceros = tercerosService.findById(id);
		if(terceros == null) {
			flash.addFlashAttribute("error", "La empresa no existe en la base de datos");
			return "redirect:/terceros/listar";
		}
		model.put("titulo","DOCUMENTOS DE SISTEMA DE GESTIÓN DE SEGURIDAD Y SALUD EN EL TRABAJO IN HOUSE");
		model.put("tercero",terceros);
		
		return "terceros/ver-permanente";
	}
	
	@GetMapping(value="terceros/ver-temporal/{id}")
	public String ver2(@PathVariable(value="id") Long id, Map<String,Object> model, RedirectAttributes flash) {
		
		Terceros terceros = tercerosService.findById(id);
		if(terceros == null) {
			flash.addFlashAttribute("error", "La empresa no existe en la base de datos");
			return "redirect:/terceros/listar";
		}
		model.put("titulo","DOCUMENTOS DE SISTEMA DE GESTIÓN DE SEGURIDAD Y SALUD EN EL TRABAJO IN HOUSE");
		model.put("tercero",terceros);
		
		return "terceros/ver-temporal";
	}
	
	
}
