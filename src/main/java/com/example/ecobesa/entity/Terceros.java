package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Terceros implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String razonSocial;
	private String actividadEconomica;
	private String ruc;
	

	@ManyToOne
	@JoinColumn(name="encargado_id", nullable=false)
	private User encargado;
	
	private String cargo;
	private String celular;
	private String correo;
	private String tipoServicio;
	private String listaColaboradores;
	private Boolean altoRiesgo;
	private Boolean altoRiesgo1;
	private Boolean altoRiesgo2;
	private Boolean altoRiesgo3;
	private Boolean altoRiesgo4;
	private Boolean altoRiesgo5;
	private Boolean altoRiesgo6;
	private Boolean altoRiesgo7;
	private Boolean altoRiesgo8;
	
	@OneToMany(mappedBy = "terceros",cascade = {CascadeType.ALL})
	private List<ExtencionPermanente> extencionPermanente;
	
	@OneToMany(mappedBy = "terceros",cascade = {CascadeType.ALL})
	private List<ExtencionTemporal> extencionTemporal;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getActividadEconomica() {
		return actividadEconomica;
	}
	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	
	
	
	public User getEncargado() {
		return encargado;
	}
	public void setEncargado(User encargado) {
		this.encargado = encargado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getListaColaboradores() {
		return listaColaboradores;
	}
	public void setListaColaboradores(String listaColaboradores) {
		this.listaColaboradores = listaColaboradores;
	}
	public Boolean getAltoRiesgo() {
		return altoRiesgo;
	}
	public void setAltoRiesgo(Boolean altoRiesgo) {
		this.altoRiesgo = altoRiesgo;
	}
	public List<ExtencionPermanente> getExtencionPermanente() {
		return extencionPermanente;
	}
	public void setExtencionPermanente(List<ExtencionPermanente> extencionPermanente) {
		this.extencionPermanente = extencionPermanente;
	}
	public List<ExtencionTemporal> getExtencionTemporal() {
		return extencionTemporal;
	}
	public void setExtencionTemporal(List<ExtencionTemporal> extencionTemporal) {
		this.extencionTemporal = extencionTemporal;
	}
	public Boolean getAltoRiesgo1() {
		return altoRiesgo1;
	}
	public void setAltoRiesgo1(Boolean altoRiesgo1) {
		this.altoRiesgo1 = altoRiesgo1;
	}
	public Boolean getAltoRiesgo2() {
		return altoRiesgo2;
	}
	public void setAltoRiesgo2(Boolean altoRiesgo2) {
		this.altoRiesgo2 = altoRiesgo2;
	}
	public Boolean getAltoRiesgo3() {
		return altoRiesgo3;
	}
	public void setAltoRiesgo3(Boolean altoRiesgo3) {
		this.altoRiesgo3 = altoRiesgo3;
	}
	public Boolean getAltoRiesgo4() {
		return altoRiesgo4;
	}
	public void setAltoRiesgo4(Boolean altoRiesgo4) {
		this.altoRiesgo4 = altoRiesgo4;
	}
	public Boolean getAltoRiesgo5() {
		return altoRiesgo5;
	}
	public void setAltoRiesgo5(Boolean altoRiesgo5) {
		this.altoRiesgo5 = altoRiesgo5;
	}
	public Boolean getAltoRiesgo6() {
		return altoRiesgo6;
	}
	public void setAltoRiesgo6(Boolean altoRiesgo6) {
		this.altoRiesgo6 = altoRiesgo6;
	}
	public Boolean getAltoRiesgo7() {
		return altoRiesgo7;
	}
	public void setAltoRiesgo7(Boolean altoRiesgo7) {
		this.altoRiesgo7 = altoRiesgo7;
	}
	public Boolean getAltoRiesgo8() {
		return altoRiesgo8;
	}
	public void setAltoRiesgo8(Boolean altoRiesgo8) {
		this.altoRiesgo8 = altoRiesgo8;
	}
	
	
	
}
