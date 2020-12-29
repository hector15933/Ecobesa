package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IEmpleadoDao;
import com.example.ecobesa.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoDao empleadoDao;

	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>)empleadoDao.findAll();
	}

	@Override
	public Iterable<Empleado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return empleadoDao.findAll(sort);
	}

	@Override
	public Page<Empleado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return empleadoDao.findAll(pageable);
	}

	@Override
	public Empleado findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}