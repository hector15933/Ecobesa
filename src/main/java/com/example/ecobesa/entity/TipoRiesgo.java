package com.example.ecobesa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="tipo_riesgos")
public class TipoRiesgo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String codigo;
	private Integer empresa;
	
	@OneToMany(mappedBy="tipoRiesgo")
	private List<TipoRiesgoChild> tipoRiesgoChild;

	
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
	public Integer getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<TipoRiesgoChild> getTipoRiesgoChild() {
		return tipoRiesgoChild;
	}
	public void setTipoRiesgoChild(List<TipoRiesgoChild> tipoRiesgoChild) {
		this.tipoRiesgoChild = tipoRiesgoChild;
	}

	
	
}
