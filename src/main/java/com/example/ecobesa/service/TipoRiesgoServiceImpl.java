package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoRiesgoDao;
import com.example.ecobesa.entity.TipoRiesgo;

@Service
public class TipoRiesgoServiceImpl  implements ITipoRiesgoService{
	
	@Autowired
	private ITipoRiesgoDao tiporiesgoDao;

	@Override
	public List<TipoRiesgo> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoRiesgo>)tiporiesgoDao.findAll();
	}

	@Override
	public TipoRiesgo findById(Long id) {
		// TODO Auto-generated method stub
		return tiporiesgoDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoRiesgo tipoRiesgo) {
		// TODO Auto-generated method stub
		tiporiesgoDao.save(tipoRiesgo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tiporiesgoDao.deleteById(id);
	}

	

}
