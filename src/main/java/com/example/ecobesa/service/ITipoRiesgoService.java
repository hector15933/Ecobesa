package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.TipoRiesgo;

public interface ITipoRiesgoService {
	
	public List<TipoRiesgo> findAll();
	
	public TipoRiesgo findById(Long id);
	
	public void save(TipoRiesgo tipoRiesgo);
	
	public void delete(Long id);	

}
