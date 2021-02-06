package com.example.ecobesa.view.pdf;

import java.awt.Color;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.ecobesa.entity.Empresa;
import com.example.ecobesa.entity.LineaBase;
import com.example.ecobesa.entity.ListaVerificacion;
import com.example.ecobesa.entity.ListaVerificacionItems;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("LineaBase/ver")
public class LineaBasePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		document.setPageSize(PageSize.A3.rotate());
		document.setMargins(-100, -100, 25, 25);
		document.open();

		LineaBase lineaBase = (LineaBase) model.get("lineaBase");
		List<ListaVerificacion> listaVerificacion =  lineaBase.getListaVerificacion();
		

		
		Empresa empresa = (Empresa) model.get("empresa");
		
		
		//======================================================
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
		//======================================================
		
		/*
		PdfPCell cellE = null;

		cellE = new PdfPCell(new Phrase("Elaborado por:\n" + "Revisado por:\n" + "Aprovado por:\n" + "Fecha:"));
		cellE.setPadding(3f);
		/*
		 tablaE.addCell("Elaborado por:"); tablaE.addCell("Revisado por:");
		 tablaE.addCell("Aprovado por:"); tablaE.addCell("Fecha:");
		 
		cellE.setBorder(0);
		tablaEnca.addCell(cellE);*/
	
		

	
		//======================================================
		 
		 PdfPTable tabla = new PdfPTable(1);
		 
		 PdfPCell cell=null; 
		 cell=new PdfPCell(new Phrase(lineaBase.getNombre()));
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
		enca01=new PdfPCell(new Phrase("Razon Social:"));
		enca01.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca01.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca02=null; 
		enca02=new PdfPCell(new Phrase(empresa.getRazonSocial()));
		enca02.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		
		PdfPCell enca03=null; 
		enca03=new PdfPCell(new Phrase("RUC:"));
		enca03.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca03.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca04=null; 
		enca04=new PdfPCell(new Phrase(empresa.getRuc()));
		enca04.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		PdfPCell enca05=null; 
		enca05=new PdfPCell(new Phrase("Domicilio"));
		enca05.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca05.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca06=null; 
		enca06=new PdfPCell(new Phrase(empresa.getDomicilio()));
		enca06.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		PdfPCell enca07=null; 
		enca07=new PdfPCell(new Phrase("AVANCE TOTAL"));
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
		enca001=new PdfPCell(new Phrase("Actividad economica principal:"));
		enca001.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca001.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca002=null; 
		enca002=new PdfPCell(new Phrase(empresa.getActividadEconomica()));
		enca002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		
		PdfPCell enca003=null; 
		enca003=new PdfPCell(new Phrase("N° de trabajadores en el centro de labores :"));
		enca003.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		enca003.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca004=null; 
		enca004=new PdfPCell(new Phrase("Aproximadamente"+String.valueOf(empresa.getNumeroTrabajadores())));
		enca004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		
		PdfPCell enca005=null; 
		enca005=new PdfPCell(new Phrase(lineaBase.PuntajeTotal()+"%"));
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
		tablaEnca4.setWidths(new float[] {35,70,105,35,35,35,105});
			
		PdfPCell enca0001=null; 
		enca0001=new PdfPCell(new Phrase("Item"));
		enca0001.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0001.setBackgroundColor(new Color(128,128,128)); 
		
		
		PdfPCell enca0002=null; 
		enca0002=new PdfPCell(new Phrase("Lineamiento"));
		enca0002.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0002.setBackgroundColor(new Color(128,128,128)); 
		
		
		PdfPCell enca0003=null; 
		enca0003=new PdfPCell(new Phrase("Indicador"));
		enca0003.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0003.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca0004=null; 
		enca0004=new PdfPCell(new Phrase("En proceso"));
		enca0004.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0004.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca0005=null; 
		enca0005=new PdfPCell(new Phrase("Puntuacion"));
		enca0005.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0005.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca0006=null; 
		enca0006=new PdfPCell(new Phrase("Cumplimieton %"));
		enca0006.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0006.setBackgroundColor(new Color(128,128,128)); 
		
		PdfPCell enca0007=null; 
		enca0007=new PdfPCell(new Phrase("Observacion"));
		enca0007.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		enca0007.setBackgroundColor(new Color(128,128,128)); 
		

			
		tablaEnca4.setSpacingAfter(20);
		tablaEnca4.addCell(enca0001);
		tablaEnca4.addCell(enca0002);
		tablaEnca4.addCell(enca0003);
		tablaEnca4.addCell(enca0004);
		tablaEnca4.addCell(enca0005);
		tablaEnca4.addCell(enca0006);
		tablaEnca4.addCell(enca0007);
	
		
		//document.add(tablaEnca4);
		
		//============================================================
		Font fuente = new Font();
		fuente.setColor(0, 0, 0);
		fuente.setSize(14);
		
		//======================================================

		PdfPTable tablaCont = new PdfPTable(1);
		tablaCont.setWidths(new float[] { 1 });
	
		
		for(int i=0;i<listaVerificacion.size() ;i++) {
			
			PdfPCell ecaVerificacion=null; 
			ecaVerificacion=new PdfPCell(new Phrase(listaVerificacion.get(i).getNombre()));
			ecaVerificacion.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			ecaVerificacion.setBackgroundColor(new Color(128,128,128)); 
			ecaVerificacion.setPadding(10);
			
			PdfPCell ecaVerificacion2=null; 
			ecaVerificacion2=new PdfPCell(new Phrase(listaVerificacion.get(i).PuntajeParcial()+"%"));
			ecaVerificacion2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			ecaVerificacion2.setBackgroundColor(new Color(128,128,128)); 
			ecaVerificacion2.setPadding(10);
			
			
			for(int j=0;j<listaVerificacion.get(i).getListaVerificacionItems().size();j++) {
				
				tablaEnca4.addCell(new Phrase(""+(i+1)+"."+j));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).getLineamiento().getNombre()));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).getIndicador()));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).getId()));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).getPuntuacion()+""));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).CalcularAvanze()+"%"));
				tablaEnca4.addCell(new Phrase(listaVerificacion.get(i).getListaVerificacionItems().get(j).getObservacion()));
				
			}
			
			
			tablaCont.addCell(ecaVerificacion);
			tablaCont.addCell(ecaVerificacion2);
			
			document.add(tablaCont);
			tablaCont.deleteBodyRows();
			ecaVerificacion=null; 
			ecaVerificacion2=null;
			document.add(tablaEnca4);
			tablaEnca4.deleteBodyRows();
			document.newPage();
			
			tablaEnca4.addCell(enca0001);
			tablaEnca4.addCell(enca0002);
			tablaEnca4.addCell(enca0003);
			tablaEnca4.addCell(enca0004);
			tablaEnca4.addCell(enca0005);
			tablaEnca4.addCell(enca0006);
			tablaEnca4.addCell(enca0007);
			
			
		}
		
	
		

			
			/*
			for(ListaVerificacionItems listaItems: listaVerif.getListaVerificacionItems()) {
				PdfPCell item2 = new PdfPCell(new Phrase(listaItems.getListaVerificacion().getNombre(), fuente));
				item2.setPadding(15);
				tablaCont.addCell(item2);
				
				tablaEnca4.setHeaderRows(1);
				tablaEnca4.addCell(new Phrase(listaItems.getId()));
				tablaEnca4.addCell(new Phrase(listaItems.getLineamiento().getNombre()));
				tablaEnca4.addCell(new Phrase(listaItems.getIndicador()));
				tablaEnca4.addCell(new Phrase("Cumplimieton %"));
				tablaEnca4.addCell(new Phrase("Cumplimieton %"));
				tablaEnca4.addCell(new Phrase("Cumplimieton %"));
				tablaEnca4.addCell(new Phrase("Cumplimieton %"));
				tablaCont.addCell(tablaEnca4);
			
			}
			*/
		
			
			/*PdfPCell acti2 = new PdfPCell(new Phrase(activi.getMeta(), fuente));
			tablaCont.addCell(acti2);
			User userA = null;
			userA = activi.getResponsableUser();
			PdfPCell respon2 = new PdfPCell(new Phrase(userA.getNombres(), fuente));
			tablaCont.addCell(respon2);
			PdfPCell frecu2 = new PdfPCell(new Phrase(activi.getRepeticiones().toString(), fuente));
			tablaCont.addCell(frecu2);
			PdfPCell avanc2 = new PdfPCell(new Phrase("", fuente));
			tablaCont.addCell(avanc2);

			PdfPCell ufecha2 = new PdfPCell(new Phrase(activi.getFechaInicio().toGMTString(), fuente));
			tablaCont.addCell(ufecha2);
			PdfPCell indicP2 = new PdfPCell(new Phrase("80%", fuente));
			tablaCont.addCell(indicP2);
			PdfPCell obse2 = new PdfPCell(new Phrase(activi.getComentario(), fuente));
			tablaCont.addCell(obse2);*/

	

	
		
		
		//======================================================
		
		
		 PdfPTable tabla2 = new PdfPTable(1); tabla2.setSpacingAfter(20);
		 tabla2.addCell("Datos de Auditoria: ");
		 tabla2.addCell("Elaborado: "+lineaBase.getAprobado());
		 tabla2.addCell("Revisado: "+lineaBase.getRevisado());
		 tabla2.addCell("Aprobado: "+lineaBase.getAprobado());
		 
		  document.add(tabla2);
		//======================================================

	}

}
