package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActividadSemanas implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numeroSemana;
	@ManyToOne
	private Actividad actividad;
	private Boolean asignado;
	private Boolean realizado;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumeroSemana() {
		return numeroSemana;
	}
	public void setNumeroSemana(Integer numeroSemana) {
		this.numeroSemana = numeroSemana;
	}
	public Actividad getActividad() {
		return actividad;
	}
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	public Boolean getAsignado() {
		return asignado;
	}
	public void setAsignado(Boolean asignado) {
		this.asignado = asignado;
	}
	public Boolean getRealizado() {
		return realizado;
	}
	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
	
	
	
}
