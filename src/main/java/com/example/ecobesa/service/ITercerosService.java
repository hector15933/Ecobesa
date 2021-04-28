package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.ecobesa.entity.Terceros;



public interface ITercerosService {
	
	public Page<Terceros> findAll(Pageable pageable);
	
	public List<Terceros> findAll();
	
	public Terceros findById(Long id);
	
	public Terceros save(Terceros terceros);
	
	public void delete(Long id);
	
	
}
