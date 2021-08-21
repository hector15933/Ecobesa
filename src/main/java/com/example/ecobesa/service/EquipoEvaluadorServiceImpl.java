package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IEquipoEvaluadorDao;
import com.example.ecobesa.entity.EquipoEvaluador;

@Service
public class EquipoEvaluadorServiceImpl implements IEquipoEvaluadorService{
	
	@Autowired
	private IEquipoEvaluadorDao equipoEvaluadorDao;

	@Override
	public List<EquipoEvaluador> findAll() {
		// TODO Auto-generated method stub
		return (List<EquipoEvaluador>) equipoEvaluadorDao.findAll();
	}

	@Override
	public EquipoEvaluador findById(Long id) {
		// TODO Auto-generated method stub
		return equipoEvaluadorDao.findById(id).orElse(null);
	}

	@Override
	public void save(EquipoEvaluador equipoEvaluador) {
		// TODO Auto-generated method stub
		equipoEvaluadorDao.save(equipoEvaluador);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		equipoEvaluadorDao.deleteById(id);
	}
	
	
}
