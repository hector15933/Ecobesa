package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IActividadDao;
import com.example.ecobesa.dao.IUserDao;
import com.example.ecobesa.entity.Actividad;
import com.example.ecobesa.entity.User;




@Service
public class ActividadServiceImpl implements IActividadService{
	
	@Autowired
	private IActividadDao actividadDao;
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public List<Actividad> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Actividad>) actividadDao.findAll(sort);
	}

	@Override
	public void save(Actividad actividad) {
		actividadDao.save(actividad);
		
	}

	@Override
	public Actividad findById(Long id) {
		// TODO Auto-generated method stub
		return actividadDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actividadDao.deleteById(id);
	}

	@Override
	public List<User> findByNombres(String term) {
		// TODO Auto-generated method stub
		return userDao.findByNombres(term);
	}

	@Override
	public List<Actividad> findAllByUsersId(Long param) {
		// TODO Auto-generated method stub
		return (List<Actividad>)actividadDao.findAllByUsersId(param);
	}
}
