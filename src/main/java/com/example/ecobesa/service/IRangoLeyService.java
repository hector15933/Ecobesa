package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.RangoLey;



public interface IRangoLeyService {
	
	public List<RangoLey> findAll();
	
	public List<RangoLey> findAll(Sort sort);
	
	public Page<RangoLey> findAll(Pageable pageable);
	
	public RangoLey findById(Long id);
	
	public void save(RangoLey rangoLey);
	
	public void delete(Long id);


}
