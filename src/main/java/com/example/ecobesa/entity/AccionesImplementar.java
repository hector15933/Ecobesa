package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AccionesImplementar implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String que;
	
	private String como;
	
	private String cuando;
	
	private String quien;
	
	private String donde;
	
	private String porque;
	
	@ManyToOne
	private GestionIncidentes gesionIncidentes;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getComo() {
		return como;
	}

	public void setComo(String como) {
		this.como = como;
	}

	public String getCuando() {
		return cuando;
	}

	public void setCuando(String cuando) {
		this.cuando = cuando;
	}

	public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	public String getDonde() {
		return donde;
	}

	public void setDonde(String donde) {
		this.donde = donde;
	}

	public String getPorque() {
		return porque;
	}

	public void setPorque(String porque) {
		this.porque = porque;
	}

	public GestionIncidentes getGesionIncidentes() {
		return gesionIncidentes;
	}

	public void setGesionIncidentes(GestionIncidentes gesionIncidentes) {
		this.gesionIncidentes = gesionIncidentes;
	}
	
	
	
	
	

}
