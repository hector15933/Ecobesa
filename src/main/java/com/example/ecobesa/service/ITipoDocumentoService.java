package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.TipoDocumento;



public interface ITipoDocumentoService {
	
	
	public List<TipoDocumento> findAll();
	
	public List<TipoDocumento> findAll(Sort sort);
	
	public TipoDocumento findById(Long id);
	
	public void save(TipoDocumento cargo);
	
	public void delete(Long id);	
	
}
