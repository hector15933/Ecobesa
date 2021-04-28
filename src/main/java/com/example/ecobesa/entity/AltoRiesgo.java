package com.example.ecobesa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AltoRiesgo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Boolean marca;
	
	
	@ManyToOne
	@JoinColumn(name="extencion_temporal_id", nullable=false)
	private ExtencionTemporal extencionTemporal;
	
	
	
	public AltoRiesgo() {
		super();
	}
	
	public AltoRiesgo(String nombre, ExtencionTemporal extencionTemporal) {
		super();
		this.nombre = nombre;
		this.extencionTemporal = extencionTemporal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getMarca() {
		return marca;
	}
	public void setMarca(Boolean marca) {
		this.marca = marca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ExtencionTemporal getExtencionTemporal() {
		return extencionTemporal;
	}
	public void setExtencionTemporal(ExtencionTemporal extencionTemporal) {
		this.extencionTemporal = extencionTemporal;
	}

	
	
}
