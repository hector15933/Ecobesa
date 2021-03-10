package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ActividadSemanas;


public interface IActividadSemanasService {
	public List<ActividadSemanas> findAll();
	
	public List<ActividadSemanas> findAll(Sort sort);
	
	public ActividadSemanas findById(Long id);
	
	public void save(ActividadSemanas actividadSemanas);
	
	public void delete(Long id);	
}
