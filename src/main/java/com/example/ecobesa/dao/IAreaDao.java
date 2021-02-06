package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Area;



public interface IAreaDao extends PagingAndSortingRepository<Area, Long>{
	
	public List<Area> findAll(Sort sort);
}
