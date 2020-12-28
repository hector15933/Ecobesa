package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Actividad;
import com.example.ecobesa.entity.User;





public interface IActividadService {
	
	public List<Actividad> findAll(Sort Sort);
	
	public Actividad findById(Long id);
	
	public void save(Actividad actividad);
	
	public void delete(Long id);
	
	public List<Actividad> findAllByUsersId(Long param);
	
	public List<User> findByNombres(String term);
	
}
