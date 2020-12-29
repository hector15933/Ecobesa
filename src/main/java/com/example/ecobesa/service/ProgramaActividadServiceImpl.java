package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IProgramaActividadDao;
import com.example.ecobesa.entity.ProgramaActividad;



@Service
public class ProgramaActividadServiceImpl implements IProgramaActividadService{
	
	@Autowired
	private IProgramaActividadDao programaActividadDao;
	
	@Override
	public List<ProgramaActividad> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<ProgramaActividad>) programaActividadDao.findAll(sort);
	}

	@Override
	public void save(ProgramaActividad programaActividad) {
		programaActividadDao.save(programaActividad);
		
	}

	@Override
	public ProgramaActividad findById(Long id) {
		// TODO Auto-generated method stub
		return programaActividadDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		programaActividadDao.deleteById(id);
	}

	@Override
	public Page<ProgramaActividad> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return programaActividadDao.findAll(pageable);
	}
}
