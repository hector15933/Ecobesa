package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.ProgramaAnual;



public interface IProgramaAnualService {
	
	public List<ProgramaAnual> findAll();
	
	public ProgramaAnual findById(Long id);
	
	public void save(ProgramaAnual programaAnual);
	
	public void delete(Long id);
	
}
