package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IEnfermedadOcupacionalDao;
import com.example.ecobesa.entity.EnfermedadOcupacional;

@Service
public class EnfermedadOcupacionalServiceImpl implements IEnfermedadOcupacionalService{
	
	@Autowired
	private IEnfermedadOcupacionalDao enfermedadOcupacionalDao;
	
	@Override
	public List<EnfermedadOcupacional> findAll() {
		// TODO Auto-generated method stub
		return (List<EnfermedadOcupacional>) enfermedadOcupacionalDao.findAll();
	}

	@Override
	public List<EnfermedadOcupacional> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<EnfermedadOcupacional>) enfermedadOcupacionalDao.findAll(sort);
	}

	@Override
	public EnfermedadOcupacional findById(Long id) {
		// TODO Auto-generated method stub
		return enfermedadOcupacionalDao.findById(id).orElse(null);
	}

	@Override
	public void save(EnfermedadOcupacional enfermedadOcupacional) {
		// TODO Auto-generated method stub
		enfermedadOcupacionalDao.save(enfermedadOcupacional);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		enfermedadOcupacionalDao.deleteById(id);
	}

}
