package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IFechaDao;
import com.example.ecobesa.entity.Fecha;


@Service
public class FechaServiceImpl implements IFechaService{
	
	@Autowired
	private IFechaDao fechaDao;
	
	@Override
	public List<Fecha> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Fecha>) fechaDao.findAll(sort);
	}

	@Override
	public Fecha findById(Long id) {
		// TODO Auto-generated method stub
		return fechaDao.findById(id).orElse(null);
	}

	@Override
	public void save(Fecha cargo) {
		// TODO Auto-generated method stub
		fechaDao.save(cargo);
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		fechaDao.deleteById(id);
	}

	@Override
	public void saveAll(List<Fecha> fecha) {
		// TODO Auto-generated method stub
		fechaDao.saveAll(fecha);
	}

}
