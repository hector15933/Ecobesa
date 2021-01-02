package com.example.ecobesa.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "actividades")
public class Actividad implements Serializable {

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 1L;

	public Actividad() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaInicio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaFin;

	private Integer repeticiones;

	private String frecuencia;
	

	@ManyToOne
	private User responsableUser;

	@ManyToOne
	@JoinColumn(name = "objetivoGeneral_id", nullable = false)
	private ObjetivoGeneral objetivoGeneral;

	@ManyToOne
	private ProgramaActividad programaActividad;

	@ManyToOne
	private TipoActividad tipoActividad;

	@ManyToMany
	@JoinTable(name = "actividad_users", joinColumns = @JoinColumn(name = "actividad_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;
	
	
	@OneToMany(mappedBy="actividad",cascade = {CascadeType.ALL})
	
	private List<Fecha> fecha= new ArrayList<Fecha>();
	

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

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public List<Fecha> getFecha() {
		return fecha;
	}

	public void setFecha(List<Fecha> fecha) {
		this.fecha = fecha;
	}

	//================================================================================



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actividad other = (Actividad) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@PrePersist
	public void sumarDiasAFecha() {

		DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
		String fecha_ini = formatoFecha.format(this.fechaInicio);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");

		Integer dias;
		String frecuencia =  this.getFrecuencia();

		try {
			Date fecha_ini2 = format1.parse(fecha_ini);
			Calendar calendar = Calendar.getInstance();
			
			Fecha fechaObjeto01 = new Fecha(fecha_ini2,Actividad.this);
			fecha.add(fechaObjeto01);
			
			if (frecuencia.equals("MENSUAL")) {

				dias = 30;
				for (int i = 0; i < 11; i++) {
					calendar.setTime(fecha_ini2);
					calendar.add(Calendar.DAY_OF_YEAR, dias);
					Fecha fechaObjeto = new Fecha(calendar.getTime(),Actividad.this);
					fecha.add(fechaObjeto);
					fecha_ini2 = calendar.getTime();

				}

				
			} else if (frecuencia.equals("SEMANAL")) {

			

				
			} else if (frecuencia.equals("SEMESTRAL")) {

			

				
			} else if (frecuencia.equals("PERMANENTE")) {

			

				
			}

			else {
				dias = 12;
				

				
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
