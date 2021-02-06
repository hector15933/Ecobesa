package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.LineaBase;

public interface ILineaBaseDao extends PagingAndSortingRepository<LineaBase, Long>{
	
	public List<LineaBase> findAll(Sort sort);
	
	public Page<LineaBase> findByNombre(String param,Pageable pageRequest);
}
