package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="linea_bases")
public class LineaBase  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String aprobado;
	private String revisado;
	private String elaborado;
	
	
	@OneToMany(mappedBy = "lineaBase")
	private List<ListaVerificacion> listaVerificacion;
	
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
	public String getAprobado() {
		return aprobado;
	}
	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}
	public String getRevisado() {
		return revisado;
	}
	public void setRevisado(String revisado) {
		this.revisado = revisado;
	}
	public String getElaborado() {
		return elaborado;
	}
	public void setElaborado(String elaborado) {
		this.elaborado = elaborado;
	}
	public List<ListaVerificacion> getListaVerificacion() {
		return listaVerificacion;
	}
	public void setListaVerificacion(List<ListaVerificacion> listaVerificacion) {
		this.listaVerificacion = listaVerificacion;
	}
	
	
	public int PuntajeTotal() {

		int size = listaVerificacion.size();

		int aux = 0;
		
		
		for (int i = 0; i < size; i++) {
			
			aux=aux+listaVerificacion.get(i).PuntajeParcial();
			
			
		}
		if(size!=0) {
			return aux/size;
		}
		else{
			return 0;
		}
	}
}
