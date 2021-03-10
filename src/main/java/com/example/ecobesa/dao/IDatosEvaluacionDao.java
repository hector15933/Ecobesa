package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.DatosEvaluacion;

public interface IDatosEvaluacionDao extends PagingAndSortingRepository<DatosEvaluacion, Long>{
	
	
	public List<DatosEvaluacion> findAllByRequisitosLegalesId(Long id);
	
	
}
