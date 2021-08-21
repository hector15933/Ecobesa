package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoRiesgoChildDao;
import com.example.ecobesa.entity.TipoRiesgoChild;

@Service
public class TipoRiesgoChildService implements ITipoRiesgoChildService{
	
	@Autowired
	private ITipoRiesgoChildDao tipoRiesgoChildDao;
	
	@Override
	public List<TipoRiesgoChild> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoRiesgoChild>) tipoRiesgoChildDao.findAll();
	}

	@Override
	public TipoRiesgoChild findById(Long id) {
		// TODO Auto-generated method stub
		return tipoRiesgoChildDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoRiesgoChild tipoRiesgoChild) {
		// TODO Auto-generated method stub
		tipoRiesgoChildDao.save(tipoRiesgoChild);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoRiesgoChildDao.deleteById(id);
	}

	@Override
	public List<TipoRiesgoChild> findByTipoRiesgo(Long id) {
		// TODO Auto-generated method stub
		return tipoRiesgoChildDao.findByTipoRiesgo(id);
	}

}
