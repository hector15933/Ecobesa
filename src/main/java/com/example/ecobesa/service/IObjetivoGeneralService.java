package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ObjetivoGeneral;

public interface IObjetivoGeneralService {
	
	public List<ObjetivoGeneral> findAll(Sort sort);
	
	public ObjetivoGeneral findById(Long id);
	
	public void save(ObjetivoGeneral objetivoGeneral);
	
	public void delete(Long id);
}