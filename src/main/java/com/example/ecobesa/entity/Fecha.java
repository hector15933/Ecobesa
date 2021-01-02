package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name="fechas")
public class Fecha implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	public Fecha() {
		super();
	}
	
	
	
	
	public Fecha(Date fecha, Actividad actividad) {
		super();
		this.fecha = fecha;
		this.actividad = actividad;
	}




	public Fecha(Date fecha) {
		super();
		this.fecha = fecha;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date fecha;
	
	private Boolean estado;
	
	
	@ManyToOne
	@JoinColumn(name="actividad_id", nullable=false)
	private Actividad actividad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	@PrePersist
	public void asignarEstado() {
		this.estado=false;
	}
	
	
}
