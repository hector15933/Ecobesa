package com.example.ecobesa.service;

import java.util.List;
import com.example.ecobesa.entity.Configuracion;

public interface IConfiguracionService
{
	
	public List<Configuracion> get();
	
	public Configuracion find(Long id);
	
	public Configuracion findByCode(String code);
	
	public void save(Configuracion configuracion);
	
	public void delete(Long id);

}
