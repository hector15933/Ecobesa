package com.example.ecobesa.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

@Entity(name = "riesgos")
public class Riesgos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name="cargo_id", nullable=false)
	private Long cargo;
	
	@ManyToOne 
	private TipoTareas tipoTareas;
	
	private String actividad;
	
	
	@ManyToOne()
    @JoinColumn(name = "tipoRiesgo_id")
	private TipoRiesgo tipo_riesgos;
	
	private String peligro;
	
	@Column(name="evento_peligroso")
	private String enventoPeligroso;
	
	private String consecuencias;
	
	private String vinculoLegal;
	
	private String simbologia;
	
	@OneToMany(mappedBy="riesgos")
	private List<ControlesRiesgo> controlRiesgo;
	
	//=====NOMBRE Y CODIGO DE RIESGO===========
	private String nombre2;
	private String codigo2;
	
	private Integer probabilidad;
	private Integer severidad;
	private String nivelRiesgo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoRiesgo getTipo_riesgos() {
		return tipo_riesgos;
	}

	public void setTipo_riesgos(TipoRiesgo tipo_riesgos) {
		this.tipo_riesgos = tipo_riesgos;
	}

	public String getPeligro() {
		return peligro;
	}

	public void setPeligro(String peligro) {
		this.peligro = peligro;
	}

	public String getEnventoPeligroso() {
		return enventoPeligroso;
	}

	public void setEnventoPeligroso(String enventoPeligroso) {
		this.enventoPeligroso = enventoPeligroso;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	public String getVinculoLegal() {
		return vinculoLegal;
	}

	public void setVinculoLegal(String vinculoLegal) {
		this.vinculoLegal = vinculoLegal;
	}

	public String getSimbologia() {
		return simbologia;
	}

	public void setSimbologia(String simbologia) {
		this.simbologia = simbologia;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}

	public Integer getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(Integer probabilidad) {
		this.probabilidad = probabilidad;
	}

	public Integer getSeveridad() {
		return severidad;
	}

	public void setSeveridad(Integer severidad) {
		this.severidad = severidad;
	}

	public String getNivelRiesgo() {
		return nivelRiesgo;
	}

	public void setNivelRiesgo(String nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}

	public List<ControlesRiesgo> getControlRiesgo() {
		return controlRiesgo;
	}

	public void setControlRiesgo(List<ControlesRiesgo> controlRiesgo) {
		this.controlRiesgo = controlRiesgo;
	}



	public Long getCargo() {
		return cargo;
	}

	public void setCargo(Long cargo) {
		this.cargo = cargo;
	}

	public TipoTareas getTipoTareas() {
		return tipoTareas;
	}

	public void setTipoTareas(TipoTareas tipoTareas) {
		this.tipoTareas = tipoTareas;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	


}
