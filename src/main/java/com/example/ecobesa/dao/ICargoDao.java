package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Cargo;

public interface ICargoDao extends PagingAndSortingRepository<Cargo, Long>{
	
	public List<Cargo> findAll(Sort sort);
}
