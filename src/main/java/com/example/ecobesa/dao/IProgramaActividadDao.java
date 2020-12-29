package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.ProgramaActividad;



public interface IProgramaActividadDao extends PagingAndSortingRepository<ProgramaActividad, Long>{

	public List<ProgramaActividad> findByNombre(String nombre);
	
	public List<ProgramaActividad> findAll(Sort sort);
	
}
