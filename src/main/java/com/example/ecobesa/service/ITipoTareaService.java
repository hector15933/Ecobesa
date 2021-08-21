package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.TipoTareas;

public interface ITipoTareaService {
	
	public List<TipoTareas> findAll();
	
	public TipoTareas findById(Long id);
	
	public void save(TipoTareas tipoTareas);
	
	public void delete(Long id);	
	
	
}
