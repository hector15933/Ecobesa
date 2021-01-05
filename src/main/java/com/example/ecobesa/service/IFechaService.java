package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.Fecha;



public interface IFechaService {
	public List<Fecha> findAll();
	
	public Fecha findById(Long id);
	
	public void save(Fecha cargo);
	
	public void delete(Long id);	
	
	
}
