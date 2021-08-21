package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IRiesgos;
import com.example.ecobesa.entity.Riesgos;

@Service
public class RiesgosServiceImpl implements IRiesgosService{
	
	@Autowired
	private IRiesgos riesgosDao;
	

	@Override
	public List<Riesgos> findAll() {
		// TODO Auto-generated method stub
		return (List<Riesgos>) riesgosDao.findAll();
		
	}
	@Override
	public Riesgos findById(Long id) {
		// TODO Auto-generated method stub
		return riesgosDao.findById(id).orElse(null);
	}

	@Override
	public void save(Riesgos riesgo) {
		// TODO Auto-generated method stub
		riesgosDao.save(riesgo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		riesgosDao.deleteById(id);
	}
	@Override
	public List<Riesgos> findByCargo(Long id) {
		// TODO Auto-generated method stub
		return riesgosDao.findByCargo(id);
	}

}
