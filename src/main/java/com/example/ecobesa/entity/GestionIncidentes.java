package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class GestionIncidentes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String evento;
	
	private String empleador;
	
	private String accidente;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	
	@DateTimeFormat(pattern = "HH:mm")
	@Column(columnDefinition = "time with time zone not null")
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@ManyToOne
	@JoinColumn(name="area_id", nullable=false)
	private Area area;
	
	
	@OneToMany(mappedBy="gesionIncidentes",cascade = CascadeType.ALL)
	private List<AccionesImplementar> accionesImplementar;
	
	@Column(columnDefinition = "TEXT")
	private String lugar;
	@Column(columnDefinition = "TEXT")
	private String descripcion;
	@Column(columnDefinition = "TEXT")
	private String causas;
	
	private String coordenadax;
	
	private String coordenaday;
	
	private String gravedad;
	
	private String grado;
	
	private Integer numeroDescanso;
	
	private Integer numeroAfectados;
	
	
	@ManyToMany
	@JoinTable(name = "gestion_incidentes_empleado", joinColumns = @JoinColumn(name = "gestion_incidentes_id"), inverseJoinColumns = @JoinColumn(name = "empleado_id"))
	private List<Empleado> empleados= new ArrayList<Empleado>();
	
	
	private String razon;
	
	private String ruc;
	
	private String domicilio;
	
	private String tipoActividad;
	
	private String numeroTrabajadores;
	

	

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Integer getNumeroDescanso() {
		return numeroDescanso;
	}

	public void setNumeroDescanso(Integer numeroDescanso) {
		this.numeroDescanso = numeroDescanso;
	}

	public Integer getNumeroAfectados() {
		return numeroAfectados;
	}

	public void setNumeroAfectados(Integer numeroAfectados) {
		this.numeroAfectados = numeroAfectados;
	}

	public String getGravedad() {
		return gravedad;
	}

	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
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

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public String getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(String numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public String getEmpleador() {
		return empleador;
	}

	public void setEmpleador(String empleador) {
		this.empleador = empleador;
	}

	public String getAccidente() {
		return accidente;
	}

	public void setAccidente(String accidente) {
		this.accidente = accidente;
	}

	public String getCoordenadax() {
		return coordenadax;
	}

	public void setCoordenadax(String coordenadax) {
		this.coordenadax = coordenadax;
	}

	public String getCoordenaday() {
		return coordenaday;
	}

	public void setCoordenaday(String coordenaday) {
		this.coordenaday = coordenaday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCausas() {
		return causas;
	}

	public void setCausas(String causas) {
		this.causas = causas;
	}

	public List<AccionesImplementar> getAccionesImplementar() {
		return accionesImplementar;
	}

	public void setAccionesImplementar(List<AccionesImplementar> accionesImplementar) {
		this.accionesImplementar = accionesImplementar;
	}
	
	
	
	
}
