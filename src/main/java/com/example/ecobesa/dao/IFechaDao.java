package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Fecha;

public interface IFechaDao extends PagingAndSortingRepository<Fecha, Long>{
	
	public List<Fecha> findAll(Sort sort);
	
	
}
