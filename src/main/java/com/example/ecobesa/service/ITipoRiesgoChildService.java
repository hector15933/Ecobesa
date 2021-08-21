package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.TipoRiesgoChild;

public interface ITipoRiesgoChildService {
	
	public List<TipoRiesgoChild> findAll();
	
	public TipoRiesgoChild findById(Long id);
	
	public void save(TipoRiesgoChild tipoRiesgoChild);
	
	public void delete(Long id);	
	
	public List<TipoRiesgoChild> findByTipoRiesgo(Long id);
}
