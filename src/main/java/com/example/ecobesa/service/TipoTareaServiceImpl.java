package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoTareasDao;
import com.example.ecobesa.entity.TipoTareas;

@Service
public class TipoTareaServiceImpl implements ITipoTareaService{
	
	@Autowired
	private ITipoTareasDao tipoTareaDao;

	@Override
	public List<TipoTareas> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoTareas>) tipoTareaDao.findAll();
	}

	@Override
	public TipoTareas findById(Long id) {
		// TODO Auto-generated method stub
		return tipoTareaDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoTareas tipoTareas) {
		// TODO Auto-generated method stub
		tipoTareaDao.save(tipoTareas);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoTareaDao.deleteById(id);
	}
	
	
}
