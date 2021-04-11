package com.example.ecobesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnfermedadOcupacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String tipoAgente;
	
	private String parteCuerpo;
	
	private Integer trabajadoresAfectados;
	
	private String areas;
	
	private String cambiosPuestos;
	
	private String archivo;
	
	private String relacionSustanciasCancerigenas;
	
	private Boolean monitoreoAgentes;
	
	private String medidaCorrectiva;

	private String responsable;
	
	private String fecha;
}
