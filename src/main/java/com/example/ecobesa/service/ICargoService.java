package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.Cargo;

public interface ICargoService {
	
	public List<Cargo> findAll();
	
	public Cargo findById(Long id);
	
	public void save(Cargo cargo);
	
	public void delete(Long id);	
}
