package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoAgenteDao;
import com.example.ecobesa.entity.TipoAgente;

@Service
public class TipoAgenteServiceImpl  implements ITipoAgenteService{

	@Autowired
	private ITipoAgenteDao tipoAgenteDao;
	
	@Override
	public List<TipoAgente> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoAgente>) tipoAgenteDao.findAll();
	}

	@Override
	public List<TipoAgente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<TipoAgente>) tipoAgenteDao.findAll(sort);
	}

	@Override
	public TipoAgente findById(Long id) {
		// TODO Auto-generated method stub
		return tipoAgenteDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoAgente tipoAgente) {
		// TODO Auto-generated method stub
		tipoAgenteDao.save(tipoAgente);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoAgenteDao.deleteById(id);
	}

}
