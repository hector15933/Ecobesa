package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Emo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	private String tipo;
	private String aptitud;
	private String diagnostico;
	private String restriccion;
	private String prueba;
	private Integer intervalo;
	
	@OneToOne
	@JoinColumn(name = "FK_EMO", updatable = false, nullable = false)
	private Empleado empleados;
	
	
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
	public Empleado getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getAptitud() {
		return aptitud;
	}
	public void setAptitud(String aptitud) {
		this.aptitud = aptitud;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(String restriccion) {
		this.restriccion = restriccion;
	}
	public String getPrueba() {
		return prueba;
	}
	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	public Integer getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}
	
	
	
}
