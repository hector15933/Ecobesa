package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="programa_anuales")
public class ProgramaAnual implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String nombre;
	
	@ManyToOne
	private User id_aprobado;
	
	@ManyToOne
	private User id_revisado;
	
	@ManyToOne
	private User id_elaborado;
	
	private Integer año;
	
	@OneToMany(mappedBy="programaAnual",cascade = {CascadeType.ALL})
	private Set<ObjetivoGeneral> objetivoGeneral;

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


	public User getId_revisado() {
		return id_revisado;
	}

	public void setId_revisado(User id_revisado) {
		this.id_revisado = id_revisado;
	}

	public User getId_elaborado() {
		return id_elaborado;
	}

	public void setId_elaborado(User id_elaborado) {
		this.id_elaborado = id_elaborado;
	}

	public Set<ObjetivoGeneral> getObjetivoGeneral() {
		return objetivoGeneral;
	}

	public void setObjetivoGeneral(Set<ObjetivoGeneral> objetivoGeneral) {
		this.objetivoGeneral = objetivoGeneral;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public User getId_aprobado() {
		return id_aprobado;
	}

	public void setId_aprobado(User id_aprobado) {
		this.id_aprobado = id_aprobado;
	}


}
