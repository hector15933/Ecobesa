package com.example.ecobesa.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.RegistroEnfermedadOcupacional;



public interface IRegistroEnfermedadOcupacionalService {
	
	public List<RegistroEnfermedadOcupacional> findAll();
	
	public Page<RegistroEnfermedadOcupacional> findAll(Pageable pageable);
	
	public List<RegistroEnfermedadOcupacional> findAll(Sort sort);
	
	public RegistroEnfermedadOcupacional findById(Long id);
	
	public void save(RegistroEnfermedadOcupacional registroEnfermedadOcupacional);
	
	public void delete(Long id);	
}
