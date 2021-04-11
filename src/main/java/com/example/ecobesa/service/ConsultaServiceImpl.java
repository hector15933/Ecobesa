package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IConsultaDao;
import com.example.ecobesa.entity.Consulta;

@Service
public class ConsultaServiceImpl implements IConsultaService{

	@Autowired
	private IConsultaDao consultaDao;
	
	@Override
	public List<Consulta> findAll() {
		// TODO Auto-generated method stub
		return (List<Consulta>) consultaDao.findAll();
	}

	@Override
	public List<Consulta> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Consulta>) consultaDao.findAll(sort);
	}

	@Override
	public Consulta findById(Long id) {
		// TODO Auto-generated method stub
		return consultaDao.findById(id).orElse(null);
	}

	@Override
	public void save(Consulta consulta) {
		// TODO Auto-generated method stub
		consultaDao.save(consulta);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		consultaDao.deleteById(id);
	}

}
