package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.example.ecobesa.entity.ListaVerificacionItems;

public interface IListaVerificacionItemDao extends PagingAndSortingRepository<ListaVerificacionItems, Long>{
	
	
	public List<ListaVerificacionItems> findAll(Sort sort);
	public List<ListaVerificacionItems> findAllByListaVerificacionId(Long id);
	
}
