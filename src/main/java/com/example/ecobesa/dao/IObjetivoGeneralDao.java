package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.example.ecobesa.entity.ObjetivoGeneral;

public interface IObjetivoGeneralDao extends PagingAndSortingRepository<ObjetivoGeneral, Long>{
	
	
	public List<ObjetivoGeneral> findAll(Sort sort);
	
	
}
