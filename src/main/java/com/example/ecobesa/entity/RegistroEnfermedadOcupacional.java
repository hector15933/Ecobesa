package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class RegistroEnfermedadOcupacional implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern="yyyy")
	private Date anio;
	
	@ManyToOne
	@JoinColumn(name = "FK_EMPRESA", updatable = false, nullable = false)
	private Empresa empresa;
	
	@OneToMany(mappedBy = "registroEnfermedadOcupacional")
	private List<EnfermedadOcupacional> enfermedadOcupacional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Date getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
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
