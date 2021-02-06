package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.ListaVerificacion;

public interface IListaVerificacionDao extends PagingAndSortingRepository<ListaVerificacion, Long>{
	
	public List<ListaVerificacion> findAll(Sort sort);
	
	public List<ListaVerificacion> findAllByLineaBaseId(Long id);
	
	
}
