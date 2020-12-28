package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.ObjetivoEspecifico;

public interface IObjetivoEspecificoService {
	public List<ObjetivoEspecifico> findAll();
	
	public ObjetivoEspecifico findById(Long id);
	
	public void save(ObjetivoEspecifico objetivoEspecifico);
	
	public void delete(Long id);
}
