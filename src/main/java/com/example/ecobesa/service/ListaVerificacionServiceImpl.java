package com.example.ecobesa.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IListaVerificacionDao;
import com.example.ecobesa.entity.ListaVerificacion;


@Service
public class ListaVerificacionServiceImpl implements IListaVerificacionService{
	
	@Autowired
	private IListaVerificacionDao listaVerificacionDao;
	
	
	@Override
	public List<ListaVerificacion> findAll() {
		// TODO Auto-generated method stub
		return (List<ListaVerificacion>) listaVerificacionDao.findAll();
	}

	@Override
	public List<ListaVerificacion> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return listaVerificacionDao.findAll(sort);
	}

	@Override
	public ListaVerificacion findById(Long id) {
		// TODO Auto-generated method stub
		return listaVerificacionDao.findById(id).orElse(null);
	}

	@Override
	public void save(ListaVerificacion listaVerificacion) {
		// TODO Auto-generated method stub
		listaVerificacionDao.save(listaVerificacion);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		listaVerificacionDao.deleteById(id);
	}

	@Override
	public List<ListaVerificacion> findAllByLineaBaseId(Long id) {
		// TODO Auto-generated method stub
		return listaVerificacionDao.findAllByLineaBaseId(id);
	}

	@Override
	public void saveAll(List<ListaVerificacion> listListVerificacion) {
		// TODO Auto-generated method stub
		listaVerificacionDao.saveAll(listListVerificacion);
	}

	@Override
	public Page<ListaVerificacion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return listaVerificacionDao.findAll(pageable);
	}
	

}
