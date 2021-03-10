package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="objetivo_generales")
public class ObjetivoGeneral implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String meta;
	
	private String recursos;
	
	private Integer presupuestoGeneral;
	
	@ManyToOne
    @JoinColumn(name="programaAnual_id", nullable=false)
	private ProgramaAnual programaAnual;
	
	@OneToMany(mappedBy="objetivoGeneral")
	private List<ObjetivoEspecifico> objetivoEspecifico;
	
	
	@OneToMany(mappedBy="objetivoGeneral")
	private List<Actividad> actividad;


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


	public String getMeta() {
		return meta;
	}


	public void setMeta(String meta) {
		this.meta = meta;
	}


	public String getRecursos() {
		return recursos;
	}


	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}


	public Integer getPresupuestoGeneral() {
		return presupuestoGeneral;
	}


	public void setPresupuestoGeneral(Integer presupuestoGeneral) {
		this.presupuestoGeneral = presupuestoGeneral;
	}


	public ProgramaAnual getProgramaAnual() {
		return programaAnual;
	}


	public void setProgramaAnual(ProgramaAnual programaAnual) {
		this.programaAnual = programaAnual;
	}


	public List<ObjetivoEspecifico> getObjetivoEspecifico() {
		return objetivoEspecifico;
	}


	public void setObjetivoEspecifico(List<ObjetivoEspecifico> objetivoEspecifico) {
		this.objetivoEspecifico = objetivoEspecifico;
	}


	public List<Actividad> getActividad() {
		return actividad;
	}


	public void setActividad(List<Actividad> actividad) {
		this.actividad = actividad;
	}



	
	
	

}
