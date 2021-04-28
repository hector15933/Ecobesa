package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITercerosDao;
import com.example.ecobesa.entity.Terceros;

@Service
public class TercerosServiceImpl implements ITercerosService{

	@Autowired
	private ITercerosDao tercerosDao;
	
	@Override
	public List<Terceros> findAll() {
		// TODO Auto-generated method stub
		return (List<Terceros>) tercerosDao.findAll();
	}

	@Override
	public Terceros findById(Long id) {
		// TODO Auto-generated method stub
		return tercerosDao.findById(id).orElse(null);
	}

	@Override
	public Terceros save(Terceros terceros) {
		// TODO Auto-generated method stub
		return tercerosDao.save(terceros);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tercerosDao.deleteById(id);
	}

	@Override
	public Page<Terceros> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return tercerosDao.findAll(pageable);
	}

}
