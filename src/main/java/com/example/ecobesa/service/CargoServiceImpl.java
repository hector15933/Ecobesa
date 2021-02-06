package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ICargoDao;
import com.example.ecobesa.entity.Cargo;

@Service
public class CargoServiceImpl implements ICargoService{

	@Autowired
	private ICargoDao cargoDao; 
	
	@Override
	public List<Cargo> findAll() {
		// TODO Auto-generated method stub
		return (List<Cargo>) cargoDao.findAll();
	}

	@Override
	public Cargo findById(Long id) {
		// TODO Auto-generated method stub
		return cargoDao.findById(id).orElse(null);
	}

	@Override
	public void save(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoDao.save(cargo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cargoDao.deleteById(id);
	}

	@Override
	public List<Cargo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Cargo>) cargoDao.findAll(sort);
	}
}
