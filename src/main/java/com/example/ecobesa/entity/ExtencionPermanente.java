package com.example.ecobesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExtencionPermanente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String marca;
	private String evidencia;
	
	@ManyToOne
	@JoinColumn(name="tercero_id", nullable=false)
	private Terceros terceros;
	
	
	
	public ExtencionPermanente() {
		super();
	}

	public ExtencionPermanente(String nombre, Terceros terceros) {
		super();

		this.nombre = nombre;
		this.terceros = terceros;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}
	public Terceros getTerceros() {
		return terceros;
	}
	public void setTerceros(Terceros terceros) {
		this.terceros = terceros;
	}
	
	
}
