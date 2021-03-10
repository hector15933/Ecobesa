package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class RequisitosLegales implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date aplicableDesde;
	
	
	private String nombreNorma;
	
	private String archivoNorma;
	
	@ManyToOne
	private RangoLey rangoLey;
	
	@OneToMany(mappedBy = "requisitosLegales")
	private List<DatosEvaluacion> datosEvaluacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAplicableDesde() {
		return aplicableDesde;
	}

	public void setAplicableDesde(Date aplicableDesde) {
		this.aplicableDesde = aplicableDesde;
	}


	public String getNombreNorma() {
		return nombreNorma;
	}

	public void setNombreNorma(String nombreNorma) {
		this.nombreNorma = nombreNorma;
	}

	public String getArchivoNorma() {
		return archivoNorma;
	}

	public void setArchivoNorma(String archivoNorma) {
		this.archivoNorma = archivoNorma;
	}

	public RangoLey getRangoLey() {
		return rangoLey;
	}

	public void setRangoLey(RangoLey rangoLey) {
		this.rangoLey = rangoLey;
	}

	public List<DatosEvaluacion> getDatosEvaluacion() {
		return datosEvaluacion;
	}

	public void setDatosEvaluacion(List<DatosEvaluacion> datosEvaluacion) {
		this.datosEvaluacion = datosEvaluacion;
	}
	
	
}
