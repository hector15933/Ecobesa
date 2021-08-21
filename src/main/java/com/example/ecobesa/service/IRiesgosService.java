package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Riesgos;

public interface IRiesgosService {
	
	
	public List<Riesgos> findAll();
	
	public List<Riesgos> findByCargo(Long id);
	
	public Riesgos findById(Long id);
	
	public void save(Riesgos riesgo);
	
	public void delete(Long id);	
	
}
