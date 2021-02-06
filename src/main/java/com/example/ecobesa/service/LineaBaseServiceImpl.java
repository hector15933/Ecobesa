package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ILineaBaseDao;
import com.example.ecobesa.entity.LineaBase;

@Service
public class LineaBaseServiceImpl implements ILineaBaseService{
	
	
	@Autowired
	private ILineaBaseDao lineaBaseDao;
	
	@Override
	public List<LineaBase> findAll() {
		// TODO Auto-generated method stub
		return (List<LineaBase>) lineaBaseDao.findAll();
	}

	@Override
	public List<LineaBase> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return lineaBaseDao.findAll(sort);
	}

	@Override
	public LineaBase findById(Long id) {
		// TODO Auto-generated method stub
		return lineaBaseDao.findById(id).orElse(null);
	}

	@Override
	public void save(LineaBase lineaBase) {
		// TODO Auto-generated method stub
		lineaBaseDao.save(lineaBase);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		lineaBaseDao.deleteById(id);
	}

	@Override
	public Page<LineaBase> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return lineaBaseDao.findAll(pageable);
	}

	@Override
	public Page<LineaBase> findByNombre(String param, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return lineaBaseDao.findByNombre(param,pageRequest);
	}

}
