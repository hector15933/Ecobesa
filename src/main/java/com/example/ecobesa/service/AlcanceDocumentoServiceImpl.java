package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IAlcanceDocumentoDao;
import com.example.ecobesa.entity.AlcanceDocumento;


@Service
public class AlcanceDocumentoServiceImpl implements IAlcanceDocumentoService{

	
	@Autowired
	private IAlcanceDocumentoDao alcanceDocumentoDao;
	
	
	@Override
	public List<AlcanceDocumento> findAll() {
		// TODO Auto-generated method stub
		return (List<AlcanceDocumento>) alcanceDocumentoDao.findAll();
	}

	@Override
	public List<AlcanceDocumento> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<AlcanceDocumento>) alcanceDocumentoDao.findAll(sort);
	}

	@Override
	public AlcanceDocumento findById(Long id) {
		// TODO Auto-generated method stub
		return alcanceDocumentoDao.findById(id).orElse(null);
	}

	@Override
	public void save(AlcanceDocumento alcanceDocumento) {
		// TODO Auto-generated method stub
		alcanceDocumentoDao.save(alcanceDocumento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alcanceDocumentoDao.deleteById(id);
	}

}
