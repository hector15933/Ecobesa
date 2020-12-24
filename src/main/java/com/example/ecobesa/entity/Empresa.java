package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="razon_social")
	private String razonSocial;
	
	@Column(name="actividadEconomica")
	private String actividadEconomica;
	
	private String ruc;
	
	private String domicilio;
	
	@Column(name="numero_trabajadores")
	private Integer numeroTrabajadores;
	
	
}
