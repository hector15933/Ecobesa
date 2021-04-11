package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IAccionesImplementarDao;
import com.example.ecobesa.entity.AccionesImplementar;

@Service
public class AccionesImplementarServiceImpl implements IAccionesImplementarService{
	
	@Autowired
	private IAccionesImplementarDao accionnesImplementarDao;
	
	@Override
	public List<AccionesImplementar> findAll() {
		// TODO Auto-generated method stub
		return (List<AccionesImplementar>) accionnesImplementarDao.findAll();
	}

	@Override
	public List<AccionesImplementar> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<AccionesImplementar>) accionnesImplementarDao.findAll(sort);
	}

	@Override
	public AccionesImplementar findById(Long id) {
		// TODO Auto-generated method stub
		return accionnesImplementarDao.findById(id).orElse(null);
	}

	@Override
	public void save(AccionesImplementar accionesImplementar) {
		// TODO Auto-generated method stub
		accionnesImplementarDao.save(accionesImplementar);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accionnesImplementarDao.deleteById(id);
		
	}

}
