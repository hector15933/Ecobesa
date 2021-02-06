package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Cargo;

public interface ICargoService {
	
	public List<Cargo> findAll();
	
	public List<Cargo> findAll(Sort sort);
	
	public Cargo findById(Long id);
	
	public void save(Cargo cargo);
	
	public void delete(Long id);	
}
