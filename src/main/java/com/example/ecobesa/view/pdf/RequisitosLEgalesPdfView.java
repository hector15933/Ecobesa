package com.example.ecobesa.view.pdf;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.ObjetivoGeneral;
import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.entity.RequisitosLegales;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("RequisitosLegales/requisitosLegales")
public class RequisitosLEgalesPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		document.setPageSize(PageSize.A3.rotate());
		document.setMargins(-100, -100, 25, 25);
		document.open();
		
		List<RequisitosLegales> requisitosLegales =  (ArrayList<RequisitosLegales>) model.get("requisitosLegales");
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
/*
		ProgramaAnual programaAnual = (ProgramaAnual) model.get("programaAnual");
		
		List<ObjetivoGeneral> objetivoGeneral =  programaAnual.getObjetivoGeneral();*/

		Empresa empresa = (Empresa) model.get("empresa");

		Font fuente2 = new Font();
		fuente2.setColor(255, 255, 255);
		
		Font fuente3 = new Font();
		fuente3.setColor(128,128,128);
		
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
		formatoP = new PdfPCell(new Phrase("Fecha Elaboracion:" ));
		formatoP.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
		formatoP.setPadding(3f);
		formatoP.setBorder(0);
		tablaEnca.setSpacingAfter(20);
		tablaEnca.addCell(formatoP);

		document.add(tablaEnca);

		// ======================================================
		//======================================================
		 
		 PdfPTable tabla = new PdfPTable(1);
		 
		 PdfPCell cell=null; 
		 cell=new PdfPCell(new Phrase("Matriz de Requisitos Legales",fuente2));
		 cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		 cell.setBackgroundColor(new Color(128,128,128)); 
		 cell.setPadding(20);
		 
		 tabla.setSpacingAfter(20); 
		 tabla.addCell(cell);
		 document.add(tabla);
		 
		//======================================================
		PdfPTable tablaEnca2 = new PdfPTable(7);
		tablaEnca2.setWidths(new float[] {70,105,35,35,35,70,35});
			
		PdfPCell enca01=null; 
		enca01=new PdfPCell(new Phrase("Razon Social:",fuente2));
		enca01.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		
		enca01.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca02=null; 
		enca02=new PdfPCell(new Phrase(empresa.getRazonSocial()));
		enca02.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		
		PdfPCell enca03=null; 
		enca03=new PdfPCell(new Phrase("RUC:",fuente2));
		enca03.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca03.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca04=null; 
		enca04=new PdfPCell(new Phrase(empresa.getRuc()));
		enca04.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		PdfPCell enca05=null; 
		enca05=new PdfPCell(new Phrase("Domicilio",fuente2));
		enca05.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca05.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca06=null; 
		enca06=new PdfPCell(new Phrase(empresa.getDomicilio()));
		enca06.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		PdfPCell enca07=null; 
		enca07=new PdfPCell(new Phrase("AVANCE TOTAL",fuente2));
		enca07.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca07.setBackgroundColor(new Color(128,128,128)); 
			
		tablaEnca2.addCell(enca01);
		tablaEnca2.addCell(enca02);
		tablaEnca2.addCell(enca03);
		tablaEnca2.addCell(enca04);
		tablaEnca2.addCell(enca05);
		tablaEnca2.addCell(enca06);
		tablaEnca2.addCell(enca07);
		
		document.add(tablaEnca2);
		//======================================================
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
		enca005=new PdfPCell(new Phrase("%"));
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
		
		
				PdfPTable tablaEnca4 = new PdfPTable(4);
				tablaEnca4.setWidths(new float[] {35,140,210,70});
					
				PdfPCell enca0001=null; 
				enca0001=new PdfPCell(new Phrase("Item"));
				enca0001.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca0001.setBackgroundColor(new Color(200,200,200)); 
				
				
				PdfPCell enca0002=null; 
				enca0002=new PdfPCell(new Phrase("Rango de Ley"));
				enca0002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca0002.setBackgroundColor(new Color(200,200,200)); 
				
				
				PdfPCell enca0003=null; 
				enca0003=new PdfPCell(new Phrase("Norme de la Norma"));
				enca0003.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca0003.setBackgroundColor(new Color(200,200,200)); 
				
				PdfPCell enca0004=null; 
				enca0004=new PdfPCell(new Phrase("Aplicable desde"));
				enca0004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca0004.setBackgroundColor(new Color(200,200,200)); 
				
				
				

					
			
				tablaEnca4.addCell(enca0001);
				tablaEnca4.addCell(enca0002);
				tablaEnca4.addCell(enca0003);
				tablaEnca4.addCell(enca0004);
			
				
			//=============================================================
				

				PdfPTable tablaEnca5 = new PdfPTable(5);
				tablaEnca5.setWidths(new float[] {140,70,35,35,140});
				
				
				PdfPCell enca00001=null; 
				enca00001=new PdfPCell(new Phrase("Requisito Legal Aplicable"));
				enca00001.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca00001.setBackgroundColor(new Color(200,200,200)); 
				
				
				PdfPCell enca00002=null; 
				enca00002=new PdfPCell(new Phrase("Responsable"));
				enca00002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca00002.setBackgroundColor(new Color(200,200,200)); 
				
				
				PdfPCell enca00003=null; 
				enca00003=new PdfPCell(new Phrase("Fecha Planificada"));
				enca00003.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca00003.setBackgroundColor(new Color(200,200,200)); 
				
				PdfPCell enca00004=null; 
				enca00004=new PdfPCell(new Phrase("Estado"));
				enca00004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca00004.setBackgroundColor(new Color(200,200,200)); 
				
				PdfPCell enca00005=null; 
				enca00005=new PdfPCell(new Phrase("Evidencia"));
				enca00005.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
				enca00005.setBackgroundColor(new Color(200,200,200)); 
				
				
				
				tablaEnca5.addCell(enca00001);
				tablaEnca5.addCell(enca00002);
				tablaEnca5.addCell(enca00003);
				tablaEnca5.addCell(enca00004);
				tablaEnca5.addCell(enca00005);
		
			//==============================================================
		
	
				Font fuente = new Font();
				fuente.setColor(0, 0, 0);
				fuente.setSize(14);
				
				//======================================================

				PdfPTable tablaCont = new PdfPTable(1);
				tablaCont.setWidths(new float[] { 1 });	
				
				PdfPTable tablaCont2 = new PdfPTable(1);
				tablaCont.setWidths(new float[] { 1 });	
			
				
				for(int i=0;i<requisitosLegales.size() ;i++) {
					
					 PdfPCell cellTop=null; 
					 cellTop=new PdfPCell(new Phrase("Datos Generales de la norma",fuente));
					 cellTop.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
					 cellTop.setBackgroundColor(new Color(200,200,200)); 
					 cellTop.setPadding(5);
					 tablaCont.addCell(cellTop);
					 
					tablaEnca4.addCell(new Phrase(""+(i+1)));
					tablaEnca4.addCell(new Phrase(""+requisitosLegales.get(i).getRangoLey().getNombre()));
					tablaEnca4.addCell(new Phrase(""+(requisitosLegales.get(i).getNombreNorma())));
					tablaEnca4.addCell(new Phrase(""+format1.format(requisitosLegales.get(i).getAplicableDesde())));
					
					
					PdfPCell cellTop2=null; 
					cellTop2=new PdfPCell(new Phrase("Datos de evaluacion",fuente));
					cellTop2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
					cellTop2.setBackgroundColor(new Color(200,200,200)); 
					cellTop2.setPadding(5);
					tablaCont2.addCell(cellTop2);
					
					
					for(int j=0;j<requisitosLegales.get(i).getDatosEvaluacion().size();j++) {
						
						tablaEnca5.addCell(new Phrase(requisitosLegales.get(i).getDatosEvaluacion().get(j).getRequisitoLegalAplicable()));
						tablaEnca5.addCell(new Phrase(requisitosLegales.get(i).getDatosEvaluacion().get(j).getResponsable()));
						tablaEnca5.addCell(new Phrase(format1.format(requisitosLegales.get(i).getDatosEvaluacion().get(j).getFechaPlanificada())+""));
						tablaEnca5.addCell(new Phrase(requisitosLegales.get(i).getDatosEvaluacion().get(j).getEstado()));
						tablaEnca5.addCell(new Phrase(requisitosLegales.get(i).getDatosEvaluacion().get(j).getEvidencia()));
					}
					
					
					
					document.add(tablaCont);
					document.add(tablaEnca4);
					document.add(tablaCont2);
					document.add(tablaEnca5);
					
					
					tablaCont.deleteBodyRows();
					tablaEnca4.deleteBodyRows();
					tablaCont2.deleteBodyRows();
					 cellTop=null; 
					document.newPage();
					
					tablaEnca4.addCell(enca0001);
					tablaEnca4.addCell(enca0002);
					tablaEnca4.addCell(enca0003);
					tablaEnca4.addCell(enca0004);
				}
	}

}
