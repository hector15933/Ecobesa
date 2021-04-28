package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.TipoAgente;

public interface ITipoAgenteService {
	
	public List<TipoAgente> findAll();
	
	public List<TipoAgente> findAll(Sort sort);
	
	public TipoAgente findById(Long id);
	
	public void save(TipoAgente tipoAgente);
	
	public void delete(Long id);	
}
