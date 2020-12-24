package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="actividades")
public class Actividad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	@ManyToMany
	@JoinTable(name = "actividades_responsables")
	private Set<User> responsablesUsers;
	
	@ManyToOne
	@JoinColumn(name="objetivoGeneral_id", nullable=false)
	private ObjetivoGeneral objetivoGeneral;
	
	
	
}
