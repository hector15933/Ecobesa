package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Consulta implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "TEXT")
	private String motivo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	@Column(columnDefinition = "TEXT")
	private String hallazgo;
	@Column(columnDefinition = "TEXT")
	private String diagnostico;
	@Column(columnDefinition = "TEXT")
	private String concluciones;
	@Column(columnDefinition = "TEXT")
	private String recomendaciones;
	private Integer descansoMedico;
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name="empleado_id", nullable=false)
	private Empleado empleados;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public Empleado getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHallazgo() {
		return hallazgo;
	}
	public void setHallazgo(String hallazgo) {
		this.hallazgo = hallazgo;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getConcluciones() {
		return concluciones;
	}
	public void setConcluciones(String concluciones) {
		this.concluciones = concluciones;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public Integer getDescansoMedico() {
		return descansoMedico;
	}
	public void setDescansoMedico(Integer descansoMedico) {
		this.descansoMedico = descansoMedico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String calcularTipo() {
		
		
		if(motivo.equals("Accidente")) {
			return "Agudo";
		}else if(motivo.equals("Incidente")) {
			return "Agudo";		
		}else{
			return "Cronico";
		}
		
	}
	
}
