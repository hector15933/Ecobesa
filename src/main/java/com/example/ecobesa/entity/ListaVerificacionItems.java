package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lista_verificacion_items")
public class ListaVerificacionItems implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double item;
	
	@ManyToOne
	@JoinColumn(name="lineamiento_id", nullable=false)
	private Lineamiento lineamiento;
	
	@ManyToOne
	@JoinColumn(name="lista_verificacion_id", nullable=false)
	private ListaVerificacion listaVerificacion;
	
    @Column(columnDefinition="TEXT")
	private String indicador;
	
	private Boolean cumpleSi;
	private Boolean cumpleNo;
	private Boolean proceso;
	private Integer puntuacion;
	private String observacion;
	
	private String evicendia01;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getItem() {
		return item;
	}
	public void setItem(Double item) {
		this.item = item;
	}
	public Lineamiento getLineamiento() {
		return lineamiento;
	}
	public void setLineamiento(Lineamiento lineamiento) {
		this.lineamiento = lineamiento;
	}
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}


	public Boolean getCumpleSi() {
		return cumpleSi;
	}
	public void setCumpleSi(Boolean cumpleSi) {
		this.cumpleSi = cumpleSi;
	}
	public Boolean getCumpleNo() {
		return cumpleNo;
	}
	public void setCumpleNo(Boolean cumpleNo) {
		this.cumpleNo = cumpleNo;
	}
	public Boolean getProceso() {
		return proceso;
	}
	public void setProceso(Boolean proceso) {
		this.proceso = proceso;
	}
	public Integer getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	public ListaVerificacion getListaVerificacion() {
		return listaVerificacion;
	}
	public void setListaVerificacion(ListaVerificacion listaVerificacion) {
		this.listaVerificacion = listaVerificacion;
	}
	
	public String getEvicendia01() {
		return evicendia01;
	}
	public void setEvicendia01(String evicendia01) {
		this.evicendia01 = evicendia01;
	}
	public int CalcularAvanze() {
		
		int avanze=0;
		
		int size= puntuacion;
		
		if(size==0){
			avanze=0;
			
		}else if(size==1) {
			avanze=25;
			
		}else if(size==2) {
			avanze=50;
			
		}else if(size==3) {
			avanze=75;
			
		}else if(size==4) {
			avanze=100;
			
		}
		return avanze;
	
	}
	
}
