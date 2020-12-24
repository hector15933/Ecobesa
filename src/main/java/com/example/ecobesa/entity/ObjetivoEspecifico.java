package com.example.ecobesa.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="objetivo_especificos")
public class ObjetivoEspecifico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="objetivoGeneral_id", nullable=false)
	private ObjetivoGeneral objetivoGeneral;
	

}