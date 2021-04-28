package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IExtencionPermanenteDao;
import com.example.ecobesa.entity.ExtencionPermanente;

@Service
public class ExtencionPermanenteSeriviceImpl implements IExtencionPermanenteService{
	
	@Autowired
	private IExtencionPermanenteDao extencionPermanenteDao;
	
	@Override
	public List<ExtencionPermanente> findAll() {
		// TODO Auto-generated method stub
		return (List<ExtencionPermanente>) extencionPermanenteDao.findAll();
	}

	@Override
	public ExtencionPermanente findById(Long id) {
		// TODO Auto-generated method stub
		return extencionPermanenteDao.findById(id).orElse(null);
	}

	@Override
	public ExtencionPermanente save(ExtencionPermanente extencionPermanente) {
		// TODO Auto-generated method stub
		return extencionPermanenteDao.save(extencionPermanente);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		extencionPermanenteDao.deleteById(id);
	}

	@Override
	public List<ExtencionPermanente> saveAll(List<ExtencionPermanente> listExtencionPermanente) {
		// TODO Auto-generated method stub
		return (List<ExtencionPermanente>) extencionPermanenteDao.saveAll(listExtencionPermanente);
	}

}
