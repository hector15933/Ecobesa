package com.example.ecobesa.view.pdf;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.GestionIncidentes;
import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.entity.ProgramaAnual;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("GestionIncidentes/ver")
public class GestionIncidentesPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		
		document.setPageSize(PageSize.A3.rotate());
		document.setMargins(-100, -100, 25, 25);
		document.open();



		Empresa empresa = (Empresa) model.get("empresa");
		
		GestionIncidentes gestionIncidentes = (GestionIncidentes) model.get("gestionIncidentes"); 

		Font fuente2 = new Font();
		fuente2.setColor(255, 255, 255);
		
		// ======================================================
	
		PdfPTable tablaEnca = new PdfPTable(2);
		tablaEnca.setWidths(new float[] { 0.3f, 1.4f });
		Image logoI = Image.getInstance("uploads/" + empresa.getFoto());
		logoI.scaleToFit(60, 60);
		logoI.setBorder(0);

		// document.add(logoI);
		PdfPCell logo = null;

		logo = new PdfPCell(logoI);

		logo.setBorder(0);

		tablaEnca.addCell(logo);

		PdfPCell formatoP = null;
		formatoP = new PdfPCell(new Phrase(""));
		formatoP.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		formatoP.setPadding(3f);
		formatoP.setBorder(0);
		tablaEnca.setSpacingAfter(20);
		tablaEnca.addCell(formatoP);

		document.add(tablaEnca);

		// ======================================================
		
		PdfPTable tabla = new PdfPTable(1);
		 
		 PdfPCell cell=null; 
		 cell=new PdfPCell(new Phrase("REGISTRO DE ACCIDENTES DE TRABAJO",fuente2));
		 cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		 cell.setBackgroundColor(new Color(128,128,128)); 
		 cell.setPadding(20);
		 
		 tabla.setSpacingAfter(20); 
		 tabla.addCell(cell);
		 document.add(tabla);
		 
		//======================================================
			PdfPTable tablaEnca2 = new PdfPTable(7);
			tablaEnca2.setWidths(new float[] { 70, 105, 35, 35, 35, 70, 35 });

			PdfPCell enca01 = null;
			enca01 = new PdfPCell(new Phrase("Razon Social:", fuente2));
			enca01.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);

			enca01.setBackgroundColor(new Color(128, 128, 128));

			PdfPCell enca02 = null;
			enca02 = new PdfPCell(new Phrase(empresa.getRazonSocial()));
			enca02.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);

			PdfPCell enca03 = null;
			enca03 = new PdfPCell(new Phrase("RUC:", fuente2));
			enca03.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
			enca03.setBackgroundColor(new Color(128, 128, 128));

			PdfPCell enca04 = null;
			enca04 = new PdfPCell(new Phrase(empresa.getRuc()));
			enca04.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);

			PdfPCell enca05 = null;
			enca05 = new PdfPCell(new Phrase("Domicilio", fuente2));
			enca05.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
			enca05.setBackgroundColor(new Color(128, 128, 128));

			PdfPCell enca06 = null;
			enca06 = new PdfPCell(new Phrase(empresa.getDomicilio()));
			enca06.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);

			PdfPCell enca07 = null;
			enca07 = new PdfPCell(new Phrase("AVANCE TOTAL", fuente2));
			enca07.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
			enca07.setBackgroundColor(new Color(128, 128, 128));

			tablaEnca2.addCell(enca01);
			tablaEnca2.addCell(enca02);
			tablaEnca2.addCell(enca03);
			tablaEnca2.addCell(enca04);
			tablaEnca2.addCell(enca05);
			tablaEnca2.addCell(enca06);
			tablaEnca2.addCell(enca07);

			document.add(tablaEnca2);
			// ======================================================
			PdfPTable tablaEnca3 = new PdfPTable(5);
			tablaEnca3.setWidths(new float[] {70,105,105,70,35});
				
			PdfPCell enca001=null; 
			enca001=new PdfPCell(new Phrase("Actividad economica principal:",fuente2));
			enca001.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
			enca001.setBackgroundColor(new Color(128,128,128)); 
			
			PdfPCell enca002=null; 
			enca002=new PdfPCell(new Phrase(empresa.getActividadEconomica()));
			enca002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			
			
			PdfPCell enca003=null; 
			enca003=new PdfPCell(new Phrase("N° de trabajadores en el centro de labores :",fuente2));
			enca003.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
			enca003.setBackgroundColor(new Color(128,128,128)); 
			
			PdfPCell enca004=null; 
			enca004=new PdfPCell(new Phrase("Aproximadamente"+String.valueOf(empresa.getNumeroTrabajadores())));
			enca004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			
			PdfPCell enca005=null; 
			enca005=new PdfPCell(new Phrase(gestionIncidentes.getEmpleados().get(0).getNombres()));
			enca005.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			enca005.setBackgroundColor(new Color(128,128,128)); 
			

				
			tablaEnca3.setSpacingAfter(20);
			tablaEnca3.addCell(enca001);
			tablaEnca3.addCell(enca002);
			tablaEnca3.addCell(enca003);
			tablaEnca3.addCell(enca004);
			tablaEnca3.addCell(enca005);

			
			document.add(tablaEnca3);
			//==============================================================
	
			if(gestionIncidentes.getEvento().equals("")) {
				
			}
			
			PdfPTable tabla2 = new PdfPTable(1);
			
			PdfPCell cell2=null; 
			cell2=new PdfPCell(new Phrase("DATOS DE TRABAJADORES :",fuente2));
			cell2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cell2.setBackgroundColor(new Color(128,128,128)); 
			cell2.setPadding(5);

			tabla2.addCell(cell2);
			document.add(tabla2);
			
			//==============================================================
			PdfPTable tablaTrabajador = new PdfPTable(5);
			
			tablaTrabajador.setWidths(new float[] {105,35,35,70,70});
			
			PdfPCell cellTrabajador1=null; 
			cellTrabajador1=new PdfPCell(new Phrase("APELLIDOS Y NOMBRES DEL TRABAJADOR ACCIDENTADO::",fuente2));
			cellTrabajador1.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador1.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador1.setPadding(5);
			
			PdfPCell cellTrabajador2=null; 
			cellTrabajador2=new PdfPCell(new Phrase("Nº DNI/CE :",fuente2));
			cellTrabajador2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador2.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador2.setPadding(5);
			
			PdfPCell cellTrabajador3=null; 
			cellTrabajador3=new PdfPCell(new Phrase("EDAD :",fuente2));
			cellTrabajador3.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador3.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador3.setPadding(5);
			
			PdfPCell cellTrabajador4=null; 
			cellTrabajador4=new PdfPCell(new Phrase("AREA",fuente2));
			cellTrabajador4.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador4.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador4.setPadding(5);
			
			PdfPCell cellTrabajador5=null; 
			cellTrabajador5=new PdfPCell(new Phrase("PUESTO - TRABAJO",fuente2));
			cellTrabajador5.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador5.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador5.setPadding(5);
			
			PdfPCell cellTrabajador6=null; 
			cellTrabajador6=new PdfPCell(new Phrase("ANTIGÜEDAD EN EL EMPLEO",fuente2));
			cellTrabajador6.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador6.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador6.setPadding(5);
			
			PdfPCell cellTrabajador7=null; 
			cellTrabajador7=new PdfPCell(new Phrase("SEXO",fuente2));
			cellTrabajador7.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador7.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador7.setPadding(5);
			
			PdfPCell cellTrabajador8=null; 
			cellTrabajador8=new PdfPCell(new Phrase("TURNO",fuente2));
			cellTrabajador8.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador8.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador8.setPadding(5);
			
			PdfPCell cellTrabajador9=null; 
			cellTrabajador9=new PdfPCell(new Phrase("TIEMPO DE EXPERIENCIA EN EL PUESTO DE TRABAJO",fuente2));
			cellTrabajador9.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador9.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador9.setPadding(5);
			
			PdfPCell cellTrabajador10=null; 
			cellTrabajador10=new PdfPCell(new Phrase("N° HORAS TRABAJADAS EN LA JORNADA LABORAL",fuente2));
			cellTrabajador10.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			cellTrabajador10.setBackgroundColor(new Color(128,128,128)); 
			cellTrabajador10.setPadding(5);
			
			
			tablaTrabajador.addCell(cellTrabajador1);
			tablaTrabajador.addCell(cellTrabajador2);
			tablaTrabajador.addCell(cellTrabajador3);
			tablaTrabajador.addCell(cellTrabajador4);
			tablaTrabajador.addCell(cellTrabajador5);
	
			
			for(int i=0;i<gestionIncidentes.getEmpleados().size();i++) {
				
				tablaTrabajador.addCell(new Phrase(" "+gestionIncidentes.getEmpleados().get(i).getNombres()+' '+gestionIncidentes.getEmpleados().get(i).getApellidos()));
				tablaTrabajador.addCell(new Phrase(" "+gestionIncidentes.getEmpleados().get(i).getDni()));
				tablaTrabajador.addCell(new Phrase(" "+gestionIncidentes.getEmpleados().get(i).calcularEdad()));
				tablaTrabajador.addCell(new Phrase("AREA1"));
				tablaTrabajador.addCell(new Phrase("PUESTO1"));
				tablaTrabajador.addCell(cellTrabajador6);
				tablaTrabajador.addCell(cellTrabajador7);
				tablaTrabajador.addCell(cellTrabajador8);
				tablaTrabajador.addCell(cellTrabajador9);
				tablaTrabajador.addCell(cellTrabajador10);
				tablaTrabajador.addCell(new Phrase("25 años"));
				tablaTrabajador.addCell(new Phrase("M"));
				tablaTrabajador.addCell(new Phrase("D"));
				tablaTrabajador.addCell(new Phrase("CONTRATO X"));
				tablaTrabajador.addCell(new Phrase("591 horas"));
				document.add(tablaTrabajador);
				
				tablaTrabajador.deleteBodyRows();
				tablaTrabajador.addCell(cellTrabajador1);
				tablaTrabajador.addCell(cellTrabajador2);
				tablaTrabajador.addCell(cellTrabajador3);
				tablaTrabajador.addCell(cellTrabajador4);
				tablaTrabajador.addCell(cellTrabajador5);
				
			}
			//=================================================================================================
			PdfPCell cellDescripccion=null; 
			cellDescripccion=new PdfPCell(new Phrase("DESCRIPCIÓN DEL ACCIDENTE DE TRABAJO"));
			cellDescripccion.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellDescripccion.setBackgroundColor(new Color(128,128,128)); 
			cellDescripccion.setPadding(5);
			tabla2.setSpacingBefore(20);
			
			PdfPCell cellDescripccion2=null; 
			cellDescripccion2=new PdfPCell(new Phrase(gestionIncidentes.getDescripcion()));
			cellDescripccion2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellDescripccion2.setPadding(5);
			
			
			tabla2.deleteBodyRows();
			tabla2.addCell(cellDescripccion);
			tabla2.addCell(cellDescripccion2);
			
			document.add(tabla2);
			document.newPage();
			//=================================================================================================
			PdfPCell cellInvestigacion=null; 
			cellInvestigacion=new PdfPCell(new Phrase("INVESTIGACIÓN DEL ACCIDENTE DE TRABAJO"));
			cellInvestigacion.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion.setBackgroundColor(new Color(128,128,128)); 
			cellInvestigacion.setPadding(5);
			tabla2.setSpacingBefore(20);
			
			tabla2.deleteBodyRows();
			tabla2.addCell(cellInvestigacion);
			
			document.add(tabla2);
			
			//=================================================================================================
			
			PdfPTable tablaInvestigacion2= new PdfPTable(3);
			tablaInvestigacion2.setWidths(new float[] {70,70,70});
			
			PdfPCell cellInvestigacion1=null; 
			cellInvestigacion1=new PdfPCell(new Phrase("FECHA Y HORA DE OCURRENCIA DEL ACCIDENTE"));
			cellInvestigacion1.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion1.setBackgroundColor(new Color(128,128,128)); 
			cellInvestigacion1.setPadding(5);
		
			
			PdfPCell cellInvestigacion2=null; 
			cellInvestigacion2=new PdfPCell(new Phrase("FECHA DE INICIO DE LA INVESTIGACIÓN"));
			cellInvestigacion2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion2.setBackgroundColor(new Color(128,128,128)); 
			cellInvestigacion2.setPadding(5);
		
			
			PdfPCell cellInvestigacion3=null; 
			cellInvestigacion3=new PdfPCell(new Phrase("LUGAR EXACTO DONDE OCURRIÓ EL ACCIDENTE"));
			cellInvestigacion3.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion3.setBackgroundColor(new Color(128,128,128)); 
			cellInvestigacion3.setPadding(5);
		
			PdfPCell cellInvestigacion4=null; 
			cellInvestigacion4=new PdfPCell(new Phrase(format1.format(gestionIncidentes.getFecha())+" "+gestionIncidentes.getHora()));
			cellInvestigacion4.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion4.setPadding(5);
		
			
			PdfPCell cellInvestigacion5=null; 
			cellInvestigacion5=new PdfPCell(new Phrase("12/12/2020"));
			cellInvestigacion5.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion5.setPadding(5);
		
			
			PdfPCell cellInvestigacion6=null; 
			cellInvestigacion6=new PdfPCell(new Phrase(gestionIncidentes.getCoordenadax()+" ,"+gestionIncidentes.getCoordenaday() ));
			cellInvestigacion6.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellInvestigacion6.setPadding(5);
			
			
			tablaInvestigacion2.addCell(cellInvestigacion1);
			tablaInvestigacion2.addCell(cellInvestigacion2);
			tablaInvestigacion2.addCell(cellInvestigacion3);
			tablaInvestigacion2.addCell(cellInvestigacion4);
			tablaInvestigacion2.addCell(cellInvestigacion5);
			tablaInvestigacion2.addCell(cellInvestigacion6);
			
			
			document.add(tablaInvestigacion2);
			
			
			
			//===================================================================
			PdfPTable tablaGravedad= new PdfPTable(4);
			tablaGravedad.setWidths(new float[] {70,70,70,70});
			
			

			PdfPCell cellGravedad=null; 
			cellGravedad=new PdfPCell(new Phrase("GRAVEDAD DEL ACCIDENTE DE TRABAJO"));
			cellGravedad.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad.setBackgroundColor(new Color(128,128,128)); 
			cellGravedad.setPadding(5);
			
			PdfPCell cellGravedad2=null; 
			cellGravedad2=new PdfPCell(new Phrase("GRADO DEL ACCIDENTE INCAPACITANTE (DE SER EL CASO)"));
			cellGravedad2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad2.setBackgroundColor(new Color(128,128,128)); 
			cellGravedad2.setPadding(5);
			
			PdfPCell cellGravedad3=null; 
			cellGravedad3=new PdfPCell(new Phrase("Nº DÍAS DE DESCANSO MÉDICO"));
			cellGravedad3.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad3.setBackgroundColor(new Color(128,128,128)); 
			cellGravedad3.setPadding(5);
			
			PdfPCell cellGravedad4=null; 
			cellGravedad4=new PdfPCell(new Phrase("Nº DE TRABAJADORES AFECTADOS"));
			cellGravedad4.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad4.setBackgroundColor(new Color(128,128,128)); 
			cellGravedad4.setPadding(5);
			
			PdfPCell cellGravedad5=null; 
			cellGravedad5=new PdfPCell(new Phrase(gestionIncidentes.getGravedad()+""));
			cellGravedad5.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad5.setPadding(5);
			
			PdfPCell cellGravedad6=null; 
			cellGravedad6=new PdfPCell(new Phrase(gestionIncidentes.getGrado()+""));
			cellGravedad6.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad6.setPadding(5);
			
			PdfPCell cellGravedad7=null; 
			cellGravedad7=new PdfPCell(new Phrase(gestionIncidentes.getNumeroDescanso()+""));
			cellGravedad7.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad7.setPadding(5);
			
			PdfPCell cellGravedad8=null; 
			cellGravedad8=new PdfPCell(new Phrase(gestionIncidentes.getNumeroAfectados()+""));
			cellGravedad8.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellGravedad8.setPadding(5);
			
			
			
			
			
			tablaGravedad.addCell(cellGravedad);
			tablaGravedad.addCell(cellGravedad2);
			tablaGravedad.addCell(cellGravedad3);
			tablaGravedad.addCell(cellGravedad4);
			tablaGravedad.addCell(cellGravedad5);
			tablaGravedad.addCell(cellGravedad6);
			tablaGravedad.addCell(cellGravedad7);
			tablaGravedad.addCell(cellGravedad8);
			
			
			
			document.add(tablaGravedad);
			
			
			//===============================================================================================
			PdfPCell cellCausas=null; 
			cellCausas=new PdfPCell(new Phrase("DESCRIPCIÓN DE LAS CAUSAS QUE ORIGINARON EL ACCIDENTE DE TRABAJO"));
			cellCausas.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellCausas.setBackgroundColor(new Color(128,128,128)); 
			cellCausas.setPadding(5);
			tabla2.setSpacingBefore(20);
			
			tabla2.deleteBodyRows();
			tabla2.addCell(cellCausas);
			
			document.add(tabla2);
			
			//=======================================================================================
			
			PdfPCell cellResponsables=null; 
			cellResponsables=new PdfPCell(new Phrase("RESPONSABLES DEL REGISTRO Y DE LA INVESTIGACIÓN"));
			cellResponsables.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables.setBackgroundColor(new Color(128,128,128)); 
			cellResponsables.setPadding(5);
			tabla2.setSpacingBefore(20);
			
			tabla2.deleteBodyRows();
			tabla2.addCell(cellResponsables);
			
			document.add(tabla2);
			
			//===========================================================================================
			
			
			
			
			
			PdfPCell cellResponsables1=null; 
			cellResponsables1=new PdfPCell(new Phrase("NOMBRE"));
			cellResponsables1.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables1.setBackgroundColor(new Color(128,128,128)); 
			cellResponsables1.setPadding(5);
			
			PdfPCell cellResponsables2=null; 
			cellResponsables2=new PdfPCell(new Phrase("CARGO"));
			cellResponsables2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables2.setBackgroundColor(new Color(128,128,128)); 
			cellResponsables2.setPadding(5);
			
			PdfPCell cellResponsables3=null; 
			cellResponsables3=new PdfPCell(new Phrase("FECHA"));
			cellResponsables3.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables3.setBackgroundColor(new Color(128,128,128)); 
			cellResponsables3.setPadding(5);
			
			PdfPCell cellResponsables4=null; 
			cellResponsables4=new PdfPCell(new Phrase("FIRMA"));
			cellResponsables4.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables4.setBackgroundColor(new Color(128,128,128)); 
			cellResponsables4.setPadding(5);
			
			
			PdfPCell cellResponsables5=null; 
			cellResponsables5=new PdfPCell(new Phrase(" "));
			cellResponsables5.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables5.setPadding(5);
			
			PdfPCell cellResponsables6=null; 
			cellResponsables6=new PdfPCell(new Phrase(" "));
			cellResponsables6.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables6.setPadding(5);
			
			PdfPCell cellResponsables7=null; 
			cellResponsables7=new PdfPCell(new Phrase(" "));
			cellResponsables7.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables7.setPadding(5);
			
			PdfPCell cellResponsables8=null; 
			cellResponsables8=new PdfPCell(new Phrase(" "));
			cellResponsables8.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables8.setPadding(5);
			
			PdfPCell cellResponsables9=null; 
			cellResponsables9=new PdfPCell(new Phrase(" "));
			cellResponsables9.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables9.setPadding(5);
			
			PdfPCell cellResponsables10=null; 
			cellResponsables10=new PdfPCell(new Phrase(" "));
			cellResponsables10.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables10.setPadding(5);
			
			PdfPCell cellResponsables11=null; 
			cellResponsables11=new PdfPCell(new Phrase(" "));
			cellResponsables11.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables11.setPadding(5);
			
			PdfPCell cellResponsables12=null; 
			cellResponsables12=new PdfPCell(new Phrase(" "));
			cellResponsables12.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cellResponsables12.setPadding(5);
			
			
			tablaGravedad.deleteBodyRows();
			tablaGravedad.addCell(cellResponsables1);
			tablaGravedad.addCell(cellResponsables2);
			tablaGravedad.addCell(cellResponsables3);
			tablaGravedad.addCell(cellResponsables4);
			tablaGravedad.addCell(cellResponsables5);
			tablaGravedad.addCell(cellResponsables6);
			tablaGravedad.addCell(cellResponsables7);
			tablaGravedad.addCell(cellResponsables8);
			tablaGravedad.addCell(cellResponsables9);
			tablaGravedad.addCell(cellResponsables10);
			tablaGravedad.addCell(cellResponsables11);
			tablaGravedad.addCell(cellResponsables12);
			
			document.add(tablaGravedad);
	
	}
	
}
