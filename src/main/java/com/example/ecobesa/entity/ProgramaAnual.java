package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	private String nombre;
	
	private Integer id_aprobado;
	
	private Integer id_revisado;
	
	private Integer id_elaborado;
	
	@OneToMany(mappedBy="programaAnual")
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

	public Integer getId_aprobado() {
		return id_aprobado;
	}

	public void setId_aprobado(Integer id_aprobado) {
		this.id_aprobado = id_aprobado;
	}

	public Integer getId_revisado() {
		return id_revisado;
	}

	public void setId_revisado(Integer id_revisado) {
		this.id_revisado = id_revisado;
	}

	public Integer getId_elaborado() {
		return id_elaborado;
	}

	public void setId_elaborado(Integer id_elaborado) {
		this.id_elaborado = id_elaborado;
	}



	
	
	
}
