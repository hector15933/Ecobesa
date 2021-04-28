package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.ExtencionTemporal;

public interface IExtencionTemporalService {
	
	
	public List<ExtencionTemporal> findAll();
	
	public ExtencionTemporal findById(Long id);
	
	public List<ExtencionTemporal> saveAll(List<ExtencionTemporal> listExtencionTemporal);
	
	public ExtencionTemporal save(ExtencionTemporal extencionTemporal);
	
	public void delete(Long id);
	
}
