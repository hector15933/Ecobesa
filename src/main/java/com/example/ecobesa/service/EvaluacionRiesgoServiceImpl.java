package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IEvaluacionRiesgoDao;
import com.example.ecobesa.entity.EvaluacionRiesgo;

@Service
public class EvaluacionRiesgoServiceImpl implements IEvaluacionRiesgoService{

	@Autowired
	private IEvaluacionRiesgoDao evaluacionRiesgoDao;
	
	@Override
	public List<EvaluacionRiesgo> findAll() {
		// TODO Auto-generated method stub
		return (List<EvaluacionRiesgo>) evaluacionRiesgoDao.findAll();
	}

	@Override
	public EvaluacionRiesgo findById(Long id) {
		// TODO Auto-generated method stub
		return evaluacionRiesgoDao.findById(id).orElse(null);
	}

	@Override
	public void save(EvaluacionRiesgo evaluacionRiesgo) {
		// TODO Auto-generated method stub
		evaluacionRiesgoDao.save(evaluacionRiesgo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionRiesgoDao.deleteById(id);
	}

}
