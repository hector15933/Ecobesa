package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="objetivo_generales")
public class ObjetivoGeneral implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String meta;
	
	private String recursos;
	
	private Integer presupuestoGeneral;
	
	@ManyToOne
    @JoinColumn(name="programaAnual_id", nullable=false)
	private ProgramaAnual programaAnual;
	
	@OneToMany(mappedBy="objetivoGeneral")
	private Set<ObjetivoEspecifico> objetivoEspecifico;
	
	
	@OneToMany(mappedBy="objetivoGeneral")
	private Set<Actividad> actividad;
	
	
	

}
