package com.example.ecobesa.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IObjetivoGeneralDao;
import com.example.ecobesa.entity.ObjetivoGeneral;

@Service
public class ObjetivoGeneralService implements IObjetivoGeneralService {
	
	@Autowired
	private IObjetivoGeneralDao objetivoGeneralDao; 

	@Override
	public List<ObjetivoGeneral> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<ObjetivoGeneral>) objetivoGeneralDao.findAll(sort);
	}

	@Override
	public ObjetivoGeneral findById(Long id) {
		// TODO Auto-generated method stub
		return objetivoGeneralDao.findById(id).orElse(null);
	}
	
	@Override
	public void save(ObjetivoGeneral objetivoGeneral) {
		// TODO Auto-generated method stub
		objetivoGeneralDao.save(objetivoGeneral);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		objetivoGeneralDao.deleteById(id);
	}
}
