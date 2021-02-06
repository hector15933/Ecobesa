package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Area;


public interface IAreaService {
	
	public List<Area> findAll(Sort sort);
	
	public Area findById(Long id);
	
	public void save(Area area);
	
	public void delete(Long id);
}
