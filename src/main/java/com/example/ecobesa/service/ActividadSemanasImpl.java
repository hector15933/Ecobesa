package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IActividadSemanasDao;
import com.example.ecobesa.entity.ActividadSemanas;

@Service
public class ActividadSemanasImpl  implements IActividadSemanasService{
	
	
	@Autowired
	private IActividadSemanasDao actividadSemanasDao;
	
	@Override
	public List<ActividadSemanas> findAll() {
		// TODO Auto-generated method stub
		return (List<ActividadSemanas>) actividadSemanasDao.findAll();
	}

	@Override
	public List<ActividadSemanas> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<ActividadSemanas>) actividadSemanasDao.findAll(sort);
	}

	@Override
	public ActividadSemanas findById(Long id) {
		// TODO Auto-generated method stub
		return actividadSemanasDao.findById(id).orElse(null);
	}

	@Override
	public void save(ActividadSemanas actividadSemanas) {
		// TODO Auto-generated method stub
		actividadSemanasDao.save(actividadSemanas);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actividadSemanasDao.deleteById(id);
	}

}
