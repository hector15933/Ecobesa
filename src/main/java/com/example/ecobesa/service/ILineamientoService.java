package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Lineamiento;



public interface ILineamientoService {
	
	
	public List<Lineamiento> findAll();
	
	public List<Lineamiento> findAll(Sort sort);
	
	public Lineamiento findById(Long id);
	
	public void save(Lineamiento lineamiento);
	
	public void delete(Long id);	
}
