package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Riesgos;
import com.example.ecobesa.entity.TipoRiesgoChild;

public interface IRiesgos extends CrudRepository<Riesgos, Long>{
	
	public List<Riesgos> findByCargo(Long id);
	
}
