package com.example.ecobesa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tipo;
	
	private String ruc;

	private String razon_social;
	
	private String foto;

	private String pantalla_inicio;
	
	private String domicilio;
	
	private Integer año_inicio_actividad;
	
	@Column(name = "actividadEconomica")
	private String actividad_economica;
	
	private String ciiu;
	
	private Integer numero_trabajadores;

	private String presenta_actividades_alto_riesgo;
	
	private Integer numero_trabajadores_afiliados_sctr;
	
	private Integer numero_trabajadores_no_afiliados_sctr;
	
	private String nombre_aseguradora;
	
	private String representante_legal;
	
	private String telefono;
	
	private String email;
	





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRazonSocial() {
		return razon_social;
	}

	public void setRazonSocial(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getActividadEconomica() {
		return actividad_economica;
	}

	public void setActividadEconomica(String actividad_economica) {
		this.actividad_economica = actividad_economica;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getNumeroTrabajadores() {
		return numero_trabajadores;
	}
	public void setNumeroTrabajadores(Integer numero_trabajadores) {
		this.numero_trabajadores = numero_trabajadores;
	}

	public Integer getAñoInicioActividad() {
		return año_inicio_actividad;
	}
	public void setAñoInicioActividad(Integer año_inicio_actividad) {
		this.año_inicio_actividad = año_inicio_actividad;
	}

	public String getPantallaInicio() {
		return pantalla_inicio;
	}
	public void setPantallaInicio(String pantalla_inicio) {
		this.pantalla_inicio = pantalla_inicio;
	}

	public String getCiiu() {
		return ciiu;
	}
	public void setCiiu(String ciiu) {
		this.ciiu = ciiu;
	}

	public String getPresentaActividadesAlgoRiesgo() {
		return presenta_actividades_alto_riesgo;
	}
	public void setPresentaActividadesAlgoRiesgo(String presenta_actividades_alto_riesgo) {
		this.presenta_actividades_alto_riesgo = presenta_actividades_alto_riesgo;
	}

	public Integer getNumeroTrabajadoresAfiliadosSctr() {
		return numero_trabajadores_afiliados_sctr;
	}
	public void setNumeroTrabajadoresAfiliadosSctr(Integer numero_trabajadores_afiliados_sctr) {
		this.numero_trabajadores_afiliados_sctr = numero_trabajadores_afiliados_sctr;
	}

	public Integer getNumeroTrabajadoresNoAfiliadosSctr() {
		return numero_trabajadores_no_afiliados_sctr;
	}
	public void setNumeroTrabajadoresNoAfiliadosSctr(Integer numero_trabajadores_no_afiliados_sctr) {
		this.numero_trabajadores_no_afiliados_sctr = numero_trabajadores_no_afiliados_sctr;
	}
	
	public String getNombreAseguradora() {
		return nombre_aseguradora;
	}
	public void setNombreAseguradora(String nombre_aseguradora) {
		this.nombre_aseguradora = nombre_aseguradora;
	}
	
	public String getRepresentanteLegal() {
		return representante_legal;
	}
	public void setRepresentanteLegal(String representante_legal) {
		this.representante_legal = representante_legal;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
