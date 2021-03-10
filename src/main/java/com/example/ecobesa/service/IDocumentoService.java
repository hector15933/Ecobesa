package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Documento;



public interface IDocumentoService {
	
	public List<Documento> findAll();
	
	public List<Documento> findAll(Sort sort);
	
	public Page<Documento> findAll(Pageable pageable);
	
	public Documento findById(Long id);
	
	public void save(Documento documento);
	
	public void delete(Long id);	
	
	
	public Page<Documento> findByCodigoContaining(String codigo,Pageable page);
}
