package com.example.ecobesa.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PlannerSafety implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	@DateTimeFormat(pattern = "HH:mm")
	@Column(columnDefinition = "time with time zone not null")
	@Temporal(TemporalType.TIME)
	private Date hora;
	private String titulo;
	private String descripccion;
	private Boolean estado;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripccion() {
		return descripccion;
	}
	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}
	
	
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	public String obtenerDias() {
		
		int dias = 0;		
		Date fechaHoy= new Date();
		dias=(int) ((fecha.getTime()-fechaHoy.getTime())/86400000);
		String retrasoDias;
		if(dias>0) {
			retrasoDias="Quedan "+ dias +" días";
			return retrasoDias;
		}else {
			retrasoDias="Retraso "+ dias+" días";
			return retrasoDias;
		}
	}
	

	
	public String getDayOfTheWeek(){
		
		String dia="";
		
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(fecha);
		
		
		if(cal.get(Calendar.DAY_OF_WEEK)==1) {
			dia="Domingo";
		}else if(cal.get(Calendar.DAY_OF_WEEK)==2) {
			dia="Lunes";
		}else if(cal.get(Calendar.DAY_OF_WEEK)==3) {
			dia="Martes";
		}else if(cal.get(Calendar.DAY_OF_WEEK)==4) {
			dia="Miercoles";
		}else if(cal.get(Calendar.DAY_OF_WEEK)==5) {
			dia="Jueves";
		}else if(cal.get(Calendar.DAY_OF_WEEK)==6) {
			dia="Viernes";
		}else{
			dia="Sabado";
		}
		
		return dia;		
	}
	

	
	
	
	
}
