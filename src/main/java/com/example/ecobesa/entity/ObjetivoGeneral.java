package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@OneToMany
	private Set<ObjetivoEspecifico> objetivoEspecificoLista;
	
	
	@OneToMany
	private Set<Actividad> actividadesLista;
	
	
	

}
