package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecobesa.dao.IConfiguracionDao;
import com.example.ecobesa.entity.Configuracion;

@Service
public class ConfiguracionImpl implements IConfiguracionService
{
	@Autowired
	private IConfiguracionDao configuracion_dao;
	

	@Override
	@Transactional(readOnly = true)
	public List<Configuracion> findAll()
	{
		return (List<Configuracion>) configuracion_dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Configuracion findById(Long id)
	{
		return configuracion_dao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Configuracion findByCodigo(String codigo)
	{
		return configuracion_dao.findByCodigo(codigo);
	}
	
	@Override
	@Transactional()
	public void save(Configuracion configuracion)
	{
		configuracion_dao.save(configuracion);
	}
	
	@Override
	@Transactional()
	public void delete(Long id)
	{
		configuracion_dao.deleteById(id);
	}
}
