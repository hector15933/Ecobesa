package com.example.ecobesa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IObjetivoEspecificoDao;
import com.example.ecobesa.entity.ObjetivoEspecifico;

@Service
public class ObjetivoEspecificoService implements IObjetivoEspecificoService{
	@Autowired
	private IObjetivoEspecificoDao objetivoEspecificoDao; 

	@Override
	public List<ObjetivoEspecifico> findAll() {
		// TODO Auto-generated method stub
		return (List<ObjetivoEspecifico>) objetivoEspecificoDao.findAll();
	}

	@Override
	public ObjetivoEspecifico findById(Long id) {
		// TODO Auto-generated method stub
		return objetivoEspecificoDao.findById(id).orElse(null);
	}
	
	@Override
	public void save(ObjetivoEspecifico objetivoEspecifico) {
		// TODO Auto-generated method stub
		objetivoEspecificoDao.save(objetivoEspecifico);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		objetivoEspecificoDao.deleteById(id);
	}
}
