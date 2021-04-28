package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EnfermedadOcupacional implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="tipo_agente_id", nullable=false)
	private TipoAgente tipoAgente;
	
	@ManyToOne
	@JoinColumn(name="registroEnfermedadOcupacional_id", nullable=false)
	private RegistroEnfermedadOcupacional registroEnfermedadOcupacional;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoAgente getTipoAgente() {
		return tipoAgente;
	}

	public void setTipoAgente(TipoAgente tipoAgente) {
		this.tipoAgente = tipoAgente;
	}

	public RegistroEnfermedadOcupacional getRegistroEnfermedadOcupacional() {
		return registroEnfermedadOcupacional;
	}

	public void setRegistroEnfermedadOcupacional(RegistroEnfermedadOcupacional registroEnfermedadOcupacional) {
		this.registroEnfermedadOcupacional = registroEnfermedadOcupacional;
	}

	public String getParteCuerpo() {
		return parteCuerpo;
	}

	public void setParteCuerpo(String parteCuerpo) {
		this.parteCuerpo = parteCuerpo;
	}

	public Integer getTrabajadoresAfectados() {
		return trabajadoresAfectados;
	}

	public void setTrabajadoresAfectados(Integer trabajadoresAfectados) {
		this.trabajadoresAfectados = trabajadoresAfectados;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

	public String getCambiosPuestos() {
		return cambiosPuestos;
	}

	public void setCambiosPuestos(String cambiosPuestos) {
		this.cambiosPuestos = cambiosPuestos;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getRelacionSustanciasCancerigenas() {
		return relacionSustanciasCancerigenas;
	}

	public void setRelacionSustanciasCancerigenas(String relacionSustanciasCancerigenas) {
		this.relacionSustanciasCancerigenas = relacionSustanciasCancerigenas;
	}

	public Boolean getMonitoreoAgentes() {
		return monitoreoAgentes;
	}

	public void setMonitoreoAgentes(Boolean monitoreoAgentes) {
		this.monitoreoAgentes = monitoreoAgentes;
	}

	public String getMedidaCorrectiva() {
		return medidaCorrectiva;
	}

	public void setMedidaCorrectiva(String medidaCorrectiva) {
		this.medidaCorrectiva = medidaCorrectiva;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
