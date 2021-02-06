package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.ObjetivoEspecifico;

public interface IObjetivoEspecificoDao extends PagingAndSortingRepository<ObjetivoEspecifico, Long>{
	public List<ObjetivoEspecifico> findAll(Sort sort);
}
