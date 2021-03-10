package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.RequisitosLegales;



public interface IRequisitosLegalesService {
	
	
	public List<RequisitosLegales> findAll();
	
	public List<RequisitosLegales> findAll(Sort sort);
	
	public Page<RequisitosLegales> findAll(Pageable pageable);
	
	public RequisitosLegales findById(Long id);
	
	public void save(RequisitosLegales requisitosLegales);
	
	public void delete(Long id);

	public Page<RequisitosLegales> findByNombreNorma(String param, Pageable pageRequest);
}
