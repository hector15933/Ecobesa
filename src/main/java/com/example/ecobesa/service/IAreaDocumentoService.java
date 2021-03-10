package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.AreaDocumento;



public interface IAreaDocumentoService {
	
	
	public List<AreaDocumento> findAll();
	
	public List<AreaDocumento> findAll(Sort sort);
	
	public AreaDocumento findById(Long id);
	
	public void save(AreaDocumento areaDocumento);
	
	public void delete(Long id);	
	
}
