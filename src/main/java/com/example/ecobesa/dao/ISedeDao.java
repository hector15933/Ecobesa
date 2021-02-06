package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.example.ecobesa.entity.Sede;

public interface ISedeDao extends PagingAndSortingRepository<Sede, Long> {
	
	public List<Sede> findAll(Sort sort);
}
