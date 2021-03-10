package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.DatosEvaluacion;



public interface IDatosEvaluacionService {
	
	
	public List<DatosEvaluacion> findAll();
	
	public List<DatosEvaluacion> findAllByRequisitosLegalesId(Long id);
	
	public List<DatosEvaluacion> findAll(Sort sort);
	
	public Page<DatosEvaluacion> findAll(Pageable pageable);
	
	public DatosEvaluacion findById(Long id);
	
	public void save(DatosEvaluacion datosEvaluacion);
	
	public void delete(Long id);


}
