package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class DatosEvaluacion implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "TEXT")
	private String requisitoLegalAplicable;
	private String responsable;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaPlanificada;
	private String estado;
	
	@Column(columnDefinition = "TEXT")
	private String evidencia;
	
	@ManyToOne
	@JoinColumn(name = "requisitos_legales_id",nullable = false)
	private RequisitosLegales requisitosLegales;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequisitoLegalAplicable() {
		return requisitoLegalAplicable;
	}

	public void setRequisitoLegalAplicable(String requisitoLegalAplicable) {
		this.requisitoLegalAplicable = requisitoLegalAplicable;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Date getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Date fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}

	public RequisitosLegales getRequisitosLegales() {
		return requisitosLegales;
	}

	public void setRequisitosLegales(RequisitosLegales requisitosLegales) {
		this.requisitosLegales = requisitosLegales;
	}
	
	
	
	
	
}
