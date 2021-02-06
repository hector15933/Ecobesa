package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.LineaBase;



public interface ILineaBaseService {
	
public List<LineaBase> findAll();
	
	public List<LineaBase> findAll(Sort sort);
	
	public Page<LineaBase> findAll(Pageable pageable);
	
	public LineaBase findById(Long id);
	
	public void save(LineaBase lineaBase);
	
	public void delete(Long id);

	public Page<LineaBase> findByNombre(String param, Pageable pageRequest);
}
