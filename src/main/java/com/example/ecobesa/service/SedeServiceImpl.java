package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ISedeDao;
import com.example.ecobesa.entity.Sede;

@Service
public class SedeServiceImpl implements ISedeService{

	@Autowired
	ISedeDao sedeDao;
	
	@Override
	public List<Sede> findAll() {
		// TODO Auto-generated method stub
		return (List<Sede>) sedeDao.findAll();
	}

	@Override
	public List<Sede> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Sede>) sedeDao.findAll(sort);
	}

	@Override
	public Page<Sede> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sede findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Sede sede) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
