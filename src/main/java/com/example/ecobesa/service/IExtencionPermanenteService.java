package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ExtencionPermanente;

public interface IExtencionPermanenteService {
	
	
	public List<ExtencionPermanente> findAll();
	
	public List<ExtencionPermanente> findAll(Sort sort);
	
	public ExtencionPermanente findById(Long id);
	
	public List<ExtencionPermanente> saveAll(List<ExtencionPermanente> listExtencionPermanente);
	
	public ExtencionPermanente save(ExtencionPermanente extencionPermanente);
	
	public void delete(Long id);
}
