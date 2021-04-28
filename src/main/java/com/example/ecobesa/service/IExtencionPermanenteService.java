package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.ExtencionPermanente;

public interface IExtencionPermanenteService {
	
	
	public List<ExtencionPermanente> findAll();
	
	public ExtencionPermanente findById(Long id);
	
	public List<ExtencionPermanente> saveAll(List<ExtencionPermanente> listExtencionPermanente);
	
	public ExtencionPermanente save(ExtencionPermanente extencionPermanente);
	
	public void delete(Long id);
}
