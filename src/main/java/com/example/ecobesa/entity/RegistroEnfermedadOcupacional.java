package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RegistroEnfermedadOcupacional implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String año;
	
	@ManyToOne
	@JoinColumn(name = "FK_REGISTRO_ENFERMEDAD_OCUPACIONAL", updatable = false, nullable = false)
	private Empresa empresa;
	
	@OneToMany(mappedBy = "registroEnfermedadOcupacional")
	private List<EnfermedadOcupacional> enfermedadOcupacional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<EnfermedadOcupacional> getEnfermedadOcupacional() {
		return enfermedadOcupacional;
	}

	public void setEnfermedadOcupacional(List<EnfermedadOcupacional> enfermedadOcupacional) {
		this.enfermedadOcupacional = enfermedadOcupacional;
	}
	
	
	
	
}
