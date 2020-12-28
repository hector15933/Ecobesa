package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ProgramaActividad;





public interface IProgramaActividadService {
	
public Page<ProgramaActividad> findAll(Pageable pageable);
	
	public List<ProgramaActividad> findAll(Sort Sort);
	
	public ProgramaActividad findById(Long id);
	
	public void save(ProgramaActividad programaActividad);
	
	public void delete(Long id);
}
