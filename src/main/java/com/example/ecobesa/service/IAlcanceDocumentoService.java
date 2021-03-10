package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.AlcanceDocumento;


public interface IAlcanceDocumentoService {
	
	
	public List<AlcanceDocumento> findAll();
	
	public List<AlcanceDocumento> findAll(Sort sort);
	
	public AlcanceDocumento findById(Long id);
	
	public void save(AlcanceDocumento cargo);
	
	public void delete(Long id);	
	
}
