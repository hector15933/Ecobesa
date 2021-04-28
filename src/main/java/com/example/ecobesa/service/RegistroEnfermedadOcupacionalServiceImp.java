package com.example.ecobesa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IRegistroEnfermedadOcupacionalDao;
import com.example.ecobesa.entity.RegistroEnfermedadOcupacional;

@Service
public class RegistroEnfermedadOcupacionalServiceImp implements IRegistroEnfermedadOcupacionalService{

	@Autowired
	private IRegistroEnfermedadOcupacionalDao registroEnfermedadOcupacionalDao;
	
	
	
	@Override
	public List<RegistroEnfermedadOcupacional> findAll() {
		// TODO Auto-generated method stub
		return (List<RegistroEnfermedadOcupacional>) registroEnfermedadOcupacionalDao.findAll();
	}

	@Override
	public List<RegistroEnfermedadOcupacional> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<RegistroEnfermedadOcupacional>) registroEnfermedadOcupacionalDao.findAll(sort);
	}
	
	@Override
	public Page<RegistroEnfermedadOcupacional> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return registroEnfermedadOcupacionalDao.findAll(pageable);
	}
	

	@Override
	public RegistroEnfermedadOcupacional findById(Long id) {
		// TODO Auto-generated method stub
		return registroEnfermedadOcupacionalDao.findById(id).orElse(null);
	}

	@Override
	public void save(RegistroEnfermedadOcupacional registroEnfermedadOcupacional) {
		// TODO Auto-generated method stub
		registroEnfermedadOcupacionalDao.save(registroEnfermedadOcupacional);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		registroEnfermedadOcupacionalDao.deleteById(id);
	}



}
