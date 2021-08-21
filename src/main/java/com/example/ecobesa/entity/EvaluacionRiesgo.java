package com.example.ecobesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EvaluacionRiesgo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String personasExpuestas;
	private String controlesExistentes;
	private String capacitacionCapacidadesHumanas;
	private String expocicionRiesgo;
	private String severidadConsecuencia;
	private String gradoRiesgo;
	private String nivelRiesgo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonasExpuestas() {
		return personasExpuestas;
	}
	public void setPesonasExpuestas(String personasExpuestas) {
		this.personasExpuestas = personasExpuestas;
	}
	public String getControlesExistentes() {
		return controlesExistentes;
	}
	public void setControlesExistentes(String controlesExistentes) {
		this.controlesExistentes = controlesExistentes;
	}
	public String getCapacitacionCapacidadesHumanas() {
		return capacitacionCapacidadesHumanas;
	}
	public void setCapacitacionCapacidadesHumanas(String capacitacionCapacidadesHumanas) {
		this.capacitacionCapacidadesHumanas = capacitacionCapacidadesHumanas;
	}
	public String getExpocicionRiesgo() {
		return expocicionRiesgo;
	}
	public void setExpocicionRiesgo(String expocicionRiesgo) {
		this.expocicionRiesgo = expocicionRiesgo;
	}
	public String getSeveridadConsecuencia() {
		return severidadConsecuencia;
	}
	public void setSeveridadConsecuencia(String severidadConsecuencia) {
		this.severidadConsecuencia = severidadConsecuencia;
	}
	public String getGradoRiesgo() {
		return gradoRiesgo;
	}
	public void setGradoRiesgo(String gradoRiesgo) {
		this.gradoRiesgo = gradoRiesgo;
	}
	public String getNivelRiesgo() {
		return nivelRiesgo;
	}
	public void setNivelRiesgo(String nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}
	
	
	
	
}
