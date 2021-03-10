package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IRangoLeyDao;
import com.example.ecobesa.entity.RangoLey;

@Service
public class RangoLeyServiceImpl implements IRangoLeyService{

	@Autowired
	private IRangoLeyDao rangoLeyDao;
	
	@Override
	public List<RangoLey> findAll() {
		// TODO Auto-generated method stub
		return (List<RangoLey>) rangoLeyDao.findAll();
	}

	@Override
	public List<RangoLey> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<RangoLey>) rangoLeyDao.findAll(sort);
	}

	@Override
	public Page<RangoLey> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return rangoLeyDao.findAll(pageable);
	}

	@Override
	public RangoLey findById(Long id) {
		// TODO Auto-generated method stub
		return rangoLeyDao.findById(id).orElse(null);
	}

	@Override
	public void save(RangoLey rangoLey) {
		// TODO Auto-generated method stub
		rangoLeyDao.save(rangoLey);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rangoLeyDao.deleteById(id);
	}

}
