package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Documento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codigo;
	private String titulo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaElaboracion;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaRevision;
	private String version;
	

	private String documento;

	@ManyToOne
	private AreaDocumento area;
	@ManyToOne
	private AlcanceDocumento alcance;
	@ManyToOne
	private TipoDocumento tipo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(Date fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	
	public Date getFechaRevision() {
		return fechaRevision;
	}
	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	public AreaDocumento getArea() {
		return area;
	}
	public void setArea(AreaDocumento area) {
		this.area = area;
	}
	public AlcanceDocumento getAlcance() {
		return alcance;
	}
	public void setAlcance(AlcanceDocumento alcance) {
		this.alcance = alcance;
	}
	public TipoDocumento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}
	
	
	
}
