package com.example.ecobesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class TipoRiesgoChild {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JoinColumn(name="tipo_riesgo_id", nullable=false)
	private Long tipoRiesgo;
	private String nombre;
	private String descripcion;
	private String simbologia;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTipoRiesgo() {
		return tipoRiesgo;
	}
	public void setTipoRiesgo(Long tipoRiesgo) {
		this.tipoRiesgo = tipoRiesgo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSimbologia() {
		return simbologia;
	}
	public void setSimbologia(String simbologia) {
		this.simbologia = simbologia;
	}
	
	
	
}
