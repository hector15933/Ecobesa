package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.AltoRiesgo;



public interface IAltoRiesgoService {
	
	public List<AltoRiesgo> findAll();
	
	public AltoRiesgo findById(Long id);
	
	public List<AltoRiesgo> saveAll(List<AltoRiesgo> listAltoRiesgo);
	
	public AltoRiesgo save(AltoRiesgo extencionPermanente);
	
	public void delete(Long id);
}
