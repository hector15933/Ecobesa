package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IActividadDao;
import com.example.ecobesa.entity.Actividad;

@Service
public class ActividadService implements IActividadService{

	@Autowired
	private IActividadDao actividadDao; 
	
	@Override
	public List<Actividad> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividad>) actividadDao.findAll();
	}

	@Override
	public Actividad findById(Long id) {
		// TODO Auto-generated method stub
		return actividadDao.findById(id).orElse(null);
	}

	@Override
	public void save(Actividad actividad) {
		// TODO Auto-generated method stub
		actividadDao.save(actividad);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actividadDao.deleteById(id);
	}

}
