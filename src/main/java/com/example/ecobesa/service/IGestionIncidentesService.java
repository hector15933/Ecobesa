package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.GestionIncidentes;

public interface IGestionIncidentesService {
	
	public List<GestionIncidentes> findAll();
	
	public List<GestionIncidentes> findAll(Sort sort);
	
	public GestionIncidentes findById(Long id);
	
	public void save(GestionIncidentes gestionIncidentes);
	
	public void delete(Long id);	
}
