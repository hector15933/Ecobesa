package com.example.ecobesa.service;

import java.util.List;
import com.example.ecobesa.entity.Configuracion;

public interface IConfiguracionService
{
	
	public List<Configuracion> findAll();
	
	public Configuracion findById(Long id);
	
	public Configuracion findByCodigo(String codigo);
	
	public void save(Configuracion configuracion);
	
	public void delete(Long id);

}
