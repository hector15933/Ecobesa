package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IExtencionTemporalDao;
import com.example.ecobesa.entity.ExtencionTemporal;

@Service
public class ExtencionTemporalServiceImp implements IExtencionTemporalService{
	
	@Autowired
	private IExtencionTemporalDao extencionTemporalDao;

	@Override
	public List<ExtencionTemporal> findAll() {
		// TODO Auto-generated method stub
		return (List<ExtencionTemporal>) extencionTemporalDao.findAll();
	}

	@Override
	public ExtencionTemporal findById(Long id) {
		// TODO Auto-generated method stub
		return extencionTemporalDao.findById(id).orElse(null);
	}

	@Override
	public List<ExtencionTemporal> saveAll(List<ExtencionTemporal> listExtencionTemporal) {
		// TODO Auto-generated method stub
		return (List<ExtencionTemporal>) extencionTemporalDao.saveAll(listExtencionTemporal);
	}

	@Override
	public ExtencionTemporal save(ExtencionTemporal extencionTemporal) {
		// TODO Auto-generated method stub
		return extencionTemporalDao.save(extencionTemporal);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		extencionTemporalDao.deleteById(id);
	}
	
	
}
