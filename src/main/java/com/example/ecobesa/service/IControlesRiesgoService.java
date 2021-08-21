package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.ControlesRiesgo;

public interface IControlesRiesgoService {
	
	public List<ControlesRiesgo> findAll();
	
	public ControlesRiesgo findById(Long id);
	
	public void save(ControlesRiesgo controlesRiesgo);
	
	public void delete(Long id);	
}
