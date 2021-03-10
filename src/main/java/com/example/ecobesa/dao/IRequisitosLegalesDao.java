package com.example.ecobesa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.LineaBase;
import com.example.ecobesa.entity.RequisitosLegales;

public interface IRequisitosLegalesDao extends PagingAndSortingRepository<RequisitosLegales, Long>{
	
	
	public Page<RequisitosLegales> findByNombreNorma(String param,Pageable pageRequest);
}
