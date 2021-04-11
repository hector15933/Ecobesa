package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Consulta;


public interface IConsultaService {
	
	public List<Consulta> findAll();
	
	public List<Consulta> findAll(Sort sort);
	
	public Consulta findById(Long id);
	
	public void save(Consulta consulta);
	
	public void delete(Long id);
	
}
