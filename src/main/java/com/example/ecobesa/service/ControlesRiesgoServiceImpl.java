package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IControlesRiesgoDao;
import com.example.ecobesa.entity.ControlesRiesgo;

@Service
public class ControlesRiesgoServiceImpl implements IControlesRiesgoService{
	
	@Autowired
	private IControlesRiesgoDao controlesRiesgoDao;

	@Override
	public List<ControlesRiesgo> findAll() {
		// TODO Auto-generated method stub
		return (List<ControlesRiesgo>) controlesRiesgoDao.findAll();
	}

	@Override
	public ControlesRiesgo findById(Long id) {
		// TODO Auto-generated method stub
		return controlesRiesgoDao.findById(id).orElse(null);
	}

	@Override
	public void save(ControlesRiesgo controlesRiesgo) {
		// TODO Auto-generated method stub
		controlesRiesgoDao.save(controlesRiesgo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		controlesRiesgoDao.deleteById(id);
	}
	
	
}
