package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.EnfermedadOcupacional;

public interface IEnfermedadOcupacionalService {

	public List<EnfermedadOcupacional> findAll();
	
	public List<EnfermedadOcupacional> findAll(Sort sort);
	
	public EnfermedadOcupacional findById(Long id);
	
	public void save(EnfermedadOcupacional enfermedadOcupacional);
	
	public void delete(Long id);	
}
