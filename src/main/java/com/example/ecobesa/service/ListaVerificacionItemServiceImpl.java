package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IListaVerificacionItemDao;
import com.example.ecobesa.entity.ListaVerificacionItems;

@Service
public class ListaVerificacionItemServiceImpl implements IListaVerificacionItemService{
	
	
	@Autowired
	private IListaVerificacionItemDao listaVerificacionItemDao;
	
	@Override
	public List<ListaVerificacionItems> findAll() {
		// TODO Auto-generated method stub
		return (List<ListaVerificacionItems>) listaVerificacionItemDao.findAll();
	}

	@Override
	public List<ListaVerificacionItems> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return listaVerificacionItemDao.findAll(sort);
	}

	@Override
	public ListaVerificacionItems findById(Long id) {
		// TODO Auto-generated method stub
		return listaVerificacionItemDao.findById(id).orElse(null);
	}

	@Override
	public void save(ListaVerificacionItems listaVerificacionItems) {
		// TODO Auto-generated method stub
		listaVerificacionItemDao.save(listaVerificacionItems);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		listaVerificacionItemDao.deleteById(id);
	}

	@Override
	public List<ListaVerificacionItems> findAllByListaVerificacionId(Long id) {
		// TODO Auto-generated method stub
		return listaVerificacionItemDao.findAllByListaVerificacionId(id);
	}

	@Override
	public void saveAll(List<ListaVerificacionItems> listListItems) {
		// TODO Auto-generated method stub
		listaVerificacionItemDao.saveAll(listListItems);
	}


}
