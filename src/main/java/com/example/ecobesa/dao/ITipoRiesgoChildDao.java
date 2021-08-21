package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ecobesa.entity.TipoRiesgoChild;
import com.example.ecobesa.entity.User;

public interface ITipoRiesgoChildDao extends CrudRepository<TipoRiesgoChild, Long>{
	
	public List<TipoRiesgoChild> findByTipoRiesgo(Long id);
}
