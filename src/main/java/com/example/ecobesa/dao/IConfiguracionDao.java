package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Configuracion;

public interface IConfiguracionDao extends PagingAndSortingRepository<Configuracion, Long>
{
	
	public List<Configuracion> findAll();
	
	public List<Configuracion> findAll(Sort sort);

	public Configuracion findByCodigo(String codigo);
	
}
