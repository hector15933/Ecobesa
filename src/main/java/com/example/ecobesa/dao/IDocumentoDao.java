package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Documento;

public interface IDocumentoDao extends PagingAndSortingRepository<Documento, Long>{
	
	public List<Documento> findAll(Sort sort);
	
	public Page<Documento> findByCodigoContaining(String codigo, Pageable page);
}
