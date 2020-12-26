package com.example.ecobesa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    private String apellidos;
	
    private Integer dni;

    private String usuario;
	
    private String password;
	
	private String foto;
	
	private String firma;
	
	
    private String email;

    private Integer telefono;
	
    private Boolean estado;
    
    @ManyToMany
    @JoinTable(name = "actividades_responsables")
    private Set<Actividad> actividad;
}
