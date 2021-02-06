package com.example.ecobesa.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ListaVerificacion;



public interface IListaVerificacionService {
	
	
	public List<ListaVerificacion> findAll();
	
	public List<ListaVerificacion> findAll(Sort sort);
	
	public List<ListaVerificacion> findAllByLineaBaseId(Long id);
	
	public Page<ListaVerificacion> findAll(Pageable pageable);
	
	public ListaVerificacion findById(Long id);
	
	public void save(ListaVerificacion listaVerificacion);
	
	public void saveAll(List<ListaVerificacion> tempStudentList);
	
	public void delete(Long id);	
	
	
}
