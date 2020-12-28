package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;






@Entity
@Table(name="actividades")
public class Actividad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private Integer repeticiones;
	
	
	@ManyToOne
	@JoinTable(name = "actividades_responsables")
	private User responsableUser;
	
	@ManyToOne
	@JoinColumn(name="objetivoGeneral_id", nullable=false)
	private ObjetivoGeneral objetivoGeneral;
	
	
	@ManyToOne
	private ProgramaActividad programaActividad;
	
	@ManyToOne
	private TipoActividad tipoActividad;
	
	@ManyToMany
	@JoinTable(
	  name = "actividad_users", 
	  joinColumns = @JoinColumn(name = "actividad_id"), 
	  inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;

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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public ObjetivoGeneral getObjetivoGeneral() {
		return objetivoGeneral;
	}

	public void setObjetivoGeneral(ObjetivoGeneral objetivoGeneral) {
		this.objetivoGeneral = objetivoGeneral;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public ProgramaActividad getProgramaActividad() {
		return programaActividad;
	}

	public void setProgramaActividad(ProgramaActividad programaActividad) {
		this.programaActividad = programaActividad;
	}

	public TipoActividad getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public User getResponsableUser() {
		return responsableUser;
	}

	public void setResponsableUser(User responsableUser) {
		this.responsableUser = responsableUser;
	}

	public Integer getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(Integer repeticiones) {
		this.repeticiones = repeticiones;
	}

	
	
	
	
}
