package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IGestionIncidentesDao;
import com.example.ecobesa.entity.GestionIncidentes;


@Service
public class GestionIncidentesServiceImpl implements IGestionIncidentesService{
	
	@Autowired
	private IGestionIncidentesDao gestionIncidentesDao;
	
	@Override
	public List<GestionIncidentes> findAll() {
		// TODO Auto-generated method stub
		return (List<GestionIncidentes>) gestionIncidentesDao.findAll();
	}

	@Override
	public List<GestionIncidentes> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<GestionIncidentes>) gestionIncidentesDao.findAll(sort);
	}

	@Override
	public GestionIncidentes findById(Long id) {
		// TODO Auto-generated method stub
		return gestionIncidentesDao.findById(id).orElse(null);
	}

	@Override
	public void save(GestionIncidentes gestionIncidentes) {
		// TODO Auto-generated method stub
		gestionIncidentesDao.save(gestionIncidentes);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gestionIncidentesDao.deleteById(id);
	}

}
