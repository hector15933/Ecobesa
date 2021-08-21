package com.example.ecobesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ControlesRiesgo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Sede sede;

	@JoinColumn(name="riesgos_id", nullable=false)
	private Long riesgos;
	private String que;
	private String cuando;
	private String como;
	private String quien;
	private String porque;
	private String donde;
	private String significativo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Long getRiesgos() {
		return riesgos;
	}
	public void setRiesgos(Long riesgos) {
		this.riesgos = riesgos;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public String getCuando() {
		return cuando;
	}
	public void setCuando(String cuando) {
		this.cuando = cuando;
	}
	public String getComo() {
		return como;
	}
	public void setComo(String como) {
		this.como = como;
	}
	public String getQuien() {
		return quien;
	}
	public void setQuien(String quien) {
		this.quien = quien;
	}
	public String getPorque() {
		return porque;
	}
	public void setPorque(String porque) {
		this.porque = porque;
	}
	public String getDonde() {
		return donde;
	}
	public void setDonde(String donde) {
		this.donde = donde;
	}
	public String getSignificativo() {
		return significativo;
	}
	public void setSignificativo(String significativo) {
		this.significativo = significativo;
	}
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	
	
	
	
	
}
