package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IAreaDocumentoDao;
import com.example.ecobesa.entity.AreaDocumento;

@Service
public class AreaDocumentoServiceImpl implements IAreaDocumentoService{

	@Autowired
	private IAreaDocumentoDao areaDocumentoDao;
	
	
	
	@Override
	public List<AreaDocumento> findAll() {
		// TODO Auto-generated method stub
		return (List<AreaDocumento>) areaDocumentoDao.findAll();
	}

	@Override
	public List<AreaDocumento> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<AreaDocumento>) areaDocumentoDao.findAll(sort);
	}

	@Override
	public AreaDocumento findById(Long id) {
		// TODO Auto-generated method stub
		return areaDocumentoDao.findById(id).orElse(null);
	}

	@Override
	public void save(AreaDocumento areaDocumento) {
		// TODO Auto-generated method stub
		areaDocumentoDao.save(areaDocumento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		areaDocumentoDao.deleteById(id);
	}
	
}
