package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoActividadDao;
import com.example.ecobesa.entity.TipoActividad;



@Service
public class TipoActividadServiceImp implements ITipoActividadService{

	
	@Autowired
	private ITipoActividadDao tipoActividadDao;
	
	@Override
	public List<TipoActividad> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoActividad>) tipoActividadDao.findAll();
	}

	@Override
	public TipoActividad findById(Long id) {
		// TODO Auto-generated method stub
		return tipoActividadDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoActividad tipoActividad) {
		// TODO Auto-generated method stub
		tipoActividadDao.save(tipoActividad);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoActividadDao.deleteById(id);
	}

}
