package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.EquipoEvaluador;

public interface IEquipoEvaluadorService {
	
	public List<EquipoEvaluador> findAll();
	
	public EquipoEvaluador findById(Long id);
	
	public void save(EquipoEvaluador equipoEvaluador);
	
	public void delete(Long id);	
	
}
