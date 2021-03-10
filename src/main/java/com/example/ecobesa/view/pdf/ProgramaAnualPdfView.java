package com.example.ecobesa.view.pdf;

import java.awt.Color;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.ecobesa.entity.Empresa;
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

@Component("programa-anual/ver")
public class ProgramaAnualPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		document.setPageSize(PageSize.A1.rotate());
		document.setMargins(-100, -100, 25, 25);
		document.open();

		ProgramaAnual programaAnual = (ProgramaAnual) model.get("programaAnual");
		
		List<ObjetivoGeneral> objetivoGeneral =  programaAnual.getObjetivoGeneral();

		Empresa empresa = (Empresa) model.get("empresa");

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
		 cell=new PdfPCell(new Phrase(programaAnual.getNombre(),fuente2));
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
		PdfPTable tablaEnca4 = new PdfPTable(7);
		tablaEnca4.setWidths(new float[] {35,210,70,105,70,700,140});
			
		PdfPCell enca0001=null; 
		enca0001=new PdfPCell(new Phrase("Item"));
		enca0001.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0001.setBackgroundColor(new Color(200,200,200)); 
		enca0001.setPadding(10);
		
		PdfPCell enca0002=null; 
		enca0002=new PdfPCell(new Phrase("Descripccion de la Actividad"));
		enca0002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0002.setBackgroundColor(new Color(200,200,200)); 
		enca0002.setPadding(10);
		
		PdfPCell enca0003=null; 
		enca0003=new PdfPCell(new Phrase("Frecuencia"));
		enca0003.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0003.setBackgroundColor(new Color(200,200,200)); 
		enca0003.setPadding(10);
		
		PdfPCell enca0004=null; 
		enca0004=new PdfPCell(new Phrase("Responsables"));
		enca0004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0004.setBackgroundColor(new Color(200,200,200));
		enca0004.setPadding(10);
		
		PdfPCell enca0005=null; 
		enca0005=new PdfPCell(new Phrase("Avanze"));
		enca0005.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0005.setBackgroundColor(new Color(200,200,200)); 
		enca0005.setPadding(10);
		
		PdfPTable tablaFechas = new PdfPTable(52);
		tablaFechas.setWidths(new float[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
		for(int i=0;i<52;i++) {
			
			PdfPCell numeroFecha=null;
			numeroFecha=new PdfPCell(new Phrase(i+1+""));
			numeroFecha.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			numeroFecha.setBackgroundColor(new Color(200,200,200)); 
			numeroFecha.setBorderWidthTop(0);
			numeroFecha.setBorderWidthBottom(0);
		
			numeroFecha.setBorderWidthRight(0);
			
			tablaFechas.addCell(numeroFecha);
			numeroFecha=null;
			
		}
		PdfPTable tablaFechas2 = new PdfPTable(52);
		tablaFechas2.setWidths(new float[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
		for(int i=0;i<52;i++) {
			/*
			PdfPCell numeroFecha2=null;
			numeroFecha2=new PdfPCell(new Phrase(""));
			numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
			
			tablaFechas2.addCell(numeroFecha2);
			numeroFecha2=null;*/
			
		}
		
		
		PdfPCell enca0006=null; 
		enca0006=new PdfPCell(new Phrase("Semanas del año - N:"));
		enca0006.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0006.setBackgroundColor(new Color(200,200,200)); 
		enca0006.setBorder(0);
		enca0006.setPadding(10);
		
		PdfPTable tablaFechasHeader = new PdfPTable(1);
		tablaFechasHeader.addCell(enca0006);
		tablaFechasHeader.addCell(tablaFechas);
		
		
		PdfPCell enca0007=null; 
		enca0007=new PdfPCell(new Phrase("Observacion"));
		enca0007.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0007.setBackgroundColor(new Color(200,200,200)); 
		enca0007.setPadding(10);

			
		
		tablaEnca4.addCell(enca0001);
		tablaEnca4.addCell(enca0002);
		tablaEnca4.addCell(enca0003);
		tablaEnca4.addCell(enca0004);
		tablaEnca4.addCell(enca0005);
		tablaEnca4.addCell(tablaFechasHeader);
		tablaEnca4.addCell(enca0007);
	
		
		//document.add(tablaEnca4);
		
		//============================================================
	
		
		
		
		//============================================================
		Font fuente = new Font();
		fuente.setColor(0, 0, 0);
		fuente.setSize(14);
		
		//======================================================
		
		
		PdfPTable tablaCont = new PdfPTable(2);
		tablaCont.setWidths(new float[] { 5 ,20});
		
		PdfPTable tablaContEspecificos = new PdfPTable(1);
		tablaContEspecificos.setWidths(new float[] { 1});
		
		
		
		
		for(int i=0;i<objetivoGeneral.size() ;i++) {
			
			PdfPCell pObjetivoGeneral=null; 
			pObjetivoGeneral=new PdfPCell(new Phrase("Objetivo General "+(i+1)));
			pObjetivoGeneral.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			pObjetivoGeneral.setBackgroundColor(new Color(200,200,200)); 
			pObjetivoGeneral.setPadding(10);
			
			tablaCont.addCell(pObjetivoGeneral);
			
			PdfPCell pObjetivoGeneral2=new PdfPCell(new Phrase(objetivoGeneral.get(i).getNombre()));
			pObjetivoGeneral2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			pObjetivoGeneral2.setPadding(10);
			tablaCont.addCell(pObjetivoGeneral2);
			
			
			PdfPCell pObjetivoEspecifico=null; 
			pObjetivoEspecifico=new PdfPCell(new Phrase("Objetivos Especificos"));
			pObjetivoEspecifico.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			pObjetivoEspecifico.setBackgroundColor(new Color(200,200,200)); 
			pObjetivoEspecifico.setPadding(10);
			tablaCont.addCell(pObjetivoEspecifico);
			
			for(int j=0;j<objetivoGeneral.get(i).getObjetivoEspecifico().size();j++) {
				PdfPCell pObjetivoEspecifico2=null; 
				pObjetivoEspecifico2=new PdfPCell(new Phrase((i+1)+"."+(j+1)+objetivoGeneral.get(i).getObjetivoEspecifico().get(j).getNombre()));
				pObjetivoEspecifico2.setBorder(0);
				tablaContEspecificos.addCell(pObjetivoEspecifico2);
				pObjetivoEspecifico2=null; 
			}
			tablaCont.addCell(tablaContEspecificos);
			
			
			PdfPCell meta=null; 
			meta=new PdfPCell(new Phrase("Meta"));
			meta.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			meta.setBackgroundColor(new Color(200,200,200)); 
			meta.setPadding(10);
			tablaCont.addCell(meta);
			
			PdfPCell meta2=new PdfPCell(new Phrase(objetivoGeneral.get(i).getMeta()));
			meta2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			meta2.setPadding(10);
			tablaCont.addCell(meta2);
			
			PdfPCell presupuesto=null; 
			presupuesto=new PdfPCell(new Phrase("Presupuesto"));
			presupuesto.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			presupuesto.setBackgroundColor(new Color(200,200,200)); 
			presupuesto.setPadding(10);
			tablaCont.addCell(presupuesto);
			
			PdfPCell presupuesto2=new PdfPCell(new Phrase("S./"+objetivoGeneral.get(i).getPresupuestoGeneral()+".00"));
			presupuesto2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			presupuesto2.setPadding(10);
			tablaCont.addCell(presupuesto2);
			
			PdfPCell recursos=null; 
			recursos=new PdfPCell(new Phrase("Recursos"));
			recursos.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			recursos.setBackgroundColor(new Color(200,200,200)); 
			recursos.setPadding(10);
			tablaCont.addCell(recursos);
			
			PdfPCell recursos2=new PdfPCell(new Phrase(""+objetivoGeneral.get(i).getRecursos()));
			recursos2.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
			recursos2.setPadding(10);
			tablaCont.addCell(recursos2);
			
			
			document.add(tablaCont);
			//=========================================
			
			
			//===============================================
			tablaContEspecificos.deleteBodyRows();
			tablaCont.deleteBodyRows();
			pObjetivoGeneral=null; 
			pObjetivoGeneral2=null;
			
			for(int j=0;j<objetivoGeneral.get(i).getActividad().size();j++) {
				
				tablaEnca4.addCell(new Phrase(""+(i+1)+"."+j));
				tablaEnca4.addCell(new Phrase(objetivoGeneral.get(i).getActividad().get(j).getNombre()));
				tablaEnca4.addCell(new Phrase(objetivoGeneral.get(i).getActividad().get(j).getFrecuencia()));
				
				String responsables01="";
				for(int k=0;k<objetivoGeneral.get(i).getActividad().get(j).getUsers().size();k++) {
					
					responsables01=responsables01+"/"+objetivoGeneral.get(i).getActividad().get(j).getUsers().get(k).getCargo().getNombre();
				}
				
				
				tablaEnca4.addCell(new Phrase(""+responsables01));
				tablaEnca4.addCell(new Phrase(""+objetivoGeneral.get(i).getActividad().get(j).CalcularAvanze()));
				
				for(int k=0;k<52;k++) {
					PdfPCell numeroFecha2=null;
					if(objetivoGeneral.get(i).getActividad().get(j).getActividadSemana().get(k).getAsignado()==true) {

						numeroFecha2=new PdfPCell(new Phrase("1"));
						numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
						numeroFecha2.setBackgroundColor(new Color(244,204,204));
						
						tablaFechas2.addCell(numeroFecha2);
						numeroFecha2=null;
					
					}else {
						numeroFecha2=new PdfPCell(new Phrase(""));
						numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
						
						tablaFechas2.addCell(numeroFecha2);
						numeroFecha2=null;
					}
			
					
					
				}
				for(int k=0;k<52;k++) {
					PdfPCell numeroFecha2=null;
					if(objetivoGeneral.get(i).getActividad().get(j).getActividadSemana().get(k).getAsignado()==true) {
						
						if(objetivoGeneral.get(i).getActividad().get(j).getActividadSemana().get(k).getRealizado()==true) {
							numeroFecha2=new PdfPCell(new Phrase("1"));
							numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
							numeroFecha2.setBackgroundColor(new Color(137,199,137));
							
							tablaFechas2.addCell(numeroFecha2);
							numeroFecha2=null;
						}else {
							numeroFecha2=new PdfPCell(new Phrase("0"));
							numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
							
							
							tablaFechas2.addCell(numeroFecha2);
							numeroFecha2=null;
						}
					
					
					}else {
						numeroFecha2=new PdfPCell(new Phrase(""));
						numeroFecha2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
						
						tablaFechas2.addCell(numeroFecha2);
						numeroFecha2=null;
					}
			
					
					
				}
				
				tablaEnca4.addCell(tablaFechas2);
			
				tablaEnca4.addCell(new Phrase(""+(i+1)+"."+j));
				document.add(tablaEnca4);
				tablaEnca4.deleteBodyRows();
				tablaFechas2.deleteBodyRows();
				
			}
			
			
		
		
			
			document.newPage();
			
			tablaEnca4.addCell(enca0001);
			tablaEnca4.addCell(enca0002);
			tablaEnca4.addCell(enca0003);
			tablaEnca4.addCell(enca0004);
			tablaEnca4.addCell(enca0005);
			tablaEnca4.addCell(enca0006);
			tablaEnca4.addCell(enca0007);
			
			
			
			
			
		}
		//======================================================
		
		
		 PdfPTable tabla2 = new PdfPTable(1); tabla2.setSpacingAfter(20);
		 tabla2.addCell("Datos Programa Anual: ");
		 tabla2.addCell("Elaborado: ");
		 tabla2.addCell("Revisado: ");
		 tabla2.addCell("Aprobado: ");
		 
		  document.add(tabla2);
		//======================================================
		
		
	}

}