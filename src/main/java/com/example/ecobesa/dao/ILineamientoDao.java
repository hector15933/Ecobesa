package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Lineamiento;

public interface ILineamientoDao extends PagingAndSortingRepository<Lineamiento, Long>{
	
	public List<Lineamiento> findAll(Sort sort);
	
	
}
