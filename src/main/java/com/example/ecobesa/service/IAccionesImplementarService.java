package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.AccionesImplementar;

public interface IAccionesImplementarService {
	
	public List<AccionesImplementar> findAll();
	
	public List<AccionesImplementar> findAll(Sort sort);
	
	public AccionesImplementar findById(Long id);
	
	public void save(AccionesImplementar accionesImplementar);
	
	public void delete(Long id);	
}
