package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ObjetivoEspecifico;

public interface IObjetivoEspecificoService {
	
	
	
	public List<ObjetivoEspecifico> findAll(Sort sort);
	
	public ObjetivoEspecifico findById(Long id);
	
	public void save(ObjetivoEspecifico objetivoEspecifico);
	
	public void delete(Long id);
}
