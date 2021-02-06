package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lista_verificaciones")
public class ListaVerificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@ManyToOne()
	@JoinColumn(name = "lineaBase_id", nullable = false)
	private LineaBase lineaBase;

	@OneToMany(mappedBy = "listaVerificacion")
	private List<ListaVerificacionItems> listaVerificacionItems;

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

	public LineaBase getLineaBase() {
		return lineaBase;
	}

	public void setLineaBase(LineaBase lineaBase) {
		this.lineaBase = lineaBase;
	}

	public List<ListaVerificacionItems> getListaVerificacionItems() {
		return listaVerificacionItems;
	}

	public void setListaVerificacionItems(List<ListaVerificacionItems> listaVerificacionItems) {
		this.listaVerificacionItems = listaVerificacionItems;
	}

	
	
	public int PuntajeParcial() {

		int size = listaVerificacionItems.size();

		int aux = 0;
		
		
		for (int i = 0; i < size; i++) {
			
			aux=aux+listaVerificacionItems.get(i).CalcularAvanze();
			
			
		}
		if(size!=0) {
			return aux/size;
		}
		else{
			return 0;
		}
	}

}
