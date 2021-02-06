package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Fecha;



public interface IFechaService {
	public List<Fecha> findAll(Sort sort);
	
	public Fecha findById(Long id);
	
	public void save(Fecha fecha);
	
	public void saveAll(List<Fecha> fecha);
	
	public void delete(Long id);	
	
	
}
