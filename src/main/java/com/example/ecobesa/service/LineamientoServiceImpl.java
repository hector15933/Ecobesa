package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ILineamientoDao;
import com.example.ecobesa.entity.Lineamiento;

@Service
public class LineamientoServiceImpl implements ILineamientoService{

	
	@Autowired
	private ILineamientoDao lineamientoDao;
	
	@Override
	public List<Lineamiento> findAll() {
		// TODO Auto-generated method stub
		return (List<Lineamiento>) lineamientoDao.findAll();
	}

	@Override
	public List<Lineamiento> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return lineamientoDao.findAll(sort);
	}

	@Override
	public Lineamiento findById(Long id) {
		// TODO Auto-generated method stub
		return lineamientoDao.findById(id).orElse(null);
	}

	@Override
	public void save(Lineamiento lineamiento) {
		// TODO Auto-generated method stub
		lineamientoDao.save(lineamiento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		lineamientoDao.deleteById(id);
		
	}

}
