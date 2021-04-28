package com.example.ecobesa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ExtencionTemporal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Boolean marca;
	
	@ManyToOne
	@JoinColumn(name="tercero_id", nullable=false)
	private Terceros terceros;
	
	@OneToMany(mappedBy = "extencionTemporal",cascade = {CascadeType.ALL})
	private List<AltoRiesgo> altoRiesgo;
	
	
	
	
	
	public ExtencionTemporal() {
		super();
	}
	
	
	
	public ExtencionTemporal(String nombre,Terceros terceros) {
		super();
		this.nombre = nombre;
		this.terceros = terceros;
	}




	public ExtencionTemporal(String nombre, Terceros terceros, List<AltoRiesgo> altoRiesgo) {
		super();
		this.nombre = nombre;
		this.terceros = terceros;
		this.altoRiesgo = altoRiesgo;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Terceros getTerceros() {
		return terceros;
	}
	public void setTerceros(Terceros terceros) {
		this.terceros = terceros;
	}
	public List<AltoRiesgo> getAltoRiesgo() {
		return altoRiesgo;
	}
	public void setAltoRiesgo(List<AltoRiesgo> altoRiesgo) {
		this.altoRiesgo = altoRiesgo;
	}


	
	
}
