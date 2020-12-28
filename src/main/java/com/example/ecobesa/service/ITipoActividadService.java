package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.TipoActividad;





public interface ITipoActividadService {
	
	public List<TipoActividad> findAll();
	
	public TipoActividad findById(Long id);
	
	public void save(TipoActividad tipoActividad);
	
	public void delete(Long id);
}
