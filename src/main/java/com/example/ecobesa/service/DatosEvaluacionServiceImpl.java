package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IDatosEvaluacionDao;
import com.example.ecobesa.entity.DatosEvaluacion;

@Service
public class DatosEvaluacionServiceImpl implements IDatosEvaluacionService{

	@Autowired
	private IDatosEvaluacionDao datosEvaluacionDao;
	
	
	@Override
	public List<DatosEvaluacion> findAll() {
		// TODO Auto-generated method stub
		return (List<DatosEvaluacion>) datosEvaluacionDao.findAll();
	}

	@Override
	public List<DatosEvaluacion> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<DatosEvaluacion>) datosEvaluacionDao.findAll(sort);
	}

	@Override
	public Page<DatosEvaluacion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return datosEvaluacionDao.findAll(pageable);
	}

	@Override
	public DatosEvaluacion findById(Long id) {
		// TODO Auto-generated method stub
		return datosEvaluacionDao.findById(id).orElse(null);
	}

	@Override
	public void save(DatosEvaluacion datosEvaluacion) {
		// TODO Auto-generated method stub
		datosEvaluacionDao.save(datosEvaluacion);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		datosEvaluacionDao.deleteById(id);
	}

	@Override
	public List<DatosEvaluacion> findAllByRequisitosLegalesId(Long id) {
		// TODO Auto-generated method stub
		return datosEvaluacionDao.findAllByRequisitosLegalesId(id);
	}


}
