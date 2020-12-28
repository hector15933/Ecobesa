package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.Actividad;

public interface IActividadService {
	
	public List<Actividad> findAll();
	
	public Actividad findById(Long id);
	
	public void save(Actividad actividad);
	
	public void delete(Long id);
}
