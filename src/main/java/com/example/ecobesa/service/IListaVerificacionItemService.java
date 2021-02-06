package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.ListaVerificacionItems;



public interface IListaVerificacionItemService {
	
	public List<ListaVerificacionItems> findAll();
	
	public List<ListaVerificacionItems> findAll(Sort sort);
	
	public List<ListaVerificacionItems> findAllByListaVerificacionId(Long id);
	
	public ListaVerificacionItems findById(Long id);
	
	public void saveAll(List<ListaVerificacionItems> listListItems);
	
	
	public void save(ListaVerificacionItems listaVerificacionItems);
	
	public void delete(Long id);	
}
