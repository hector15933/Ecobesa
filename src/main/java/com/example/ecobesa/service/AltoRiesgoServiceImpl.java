package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IAltoRiesgoDao;
import com.example.ecobesa.entity.AltoRiesgo;

@Service
public class AltoRiesgoServiceImpl implements IAltoRiesgoService{
	
	@Autowired
	private IAltoRiesgoDao altoRiesgoDao;
	
	@Override
	public List<AltoRiesgo> findAll() {
		// TODO Auto-generated method stub
		return (List<AltoRiesgo>) altoRiesgoDao.findAll();
	}

	@Override
	public AltoRiesgo findById(Long id) {
		// TODO Auto-generated method stub
		return altoRiesgoDao.findById(id).orElse(null);
	}

	@Override
	public List<AltoRiesgo> saveAll(List<AltoRiesgo> listAltoRiesgo) {
		// TODO Auto-generated method stub
		return (List<AltoRiesgo>) altoRiesgoDao.saveAll(listAltoRiesgo);
	}

	@Override
	public AltoRiesgo save(AltoRiesgo extencionPermanente) {
		// TODO Auto-generated method stub
		return altoRiesgoDao.save(extencionPermanente);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		altoRiesgoDao.deleteById(id);
	}

}
