package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.EvaluacionRiesgo;

public interface IEvaluacionRiesgoService {
	
	public List<EvaluacionRiesgo> findAll();
	
	public EvaluacionRiesgo findById(Long id);
	
	public void save(EvaluacionRiesgo evaluacionRiesgo);
	
	public void delete(Long id);	
}
