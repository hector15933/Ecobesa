package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Actividad;

public interface IActividadDao extends PagingAndSortingRepository<Actividad, Long>{
	
public List<Actividad> findAll(Sort sort);
	
	public List<Actividad> findAllByUsersId(Long param);
	

	
}
