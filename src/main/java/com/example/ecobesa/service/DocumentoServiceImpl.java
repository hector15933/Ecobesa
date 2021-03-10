package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IDocumentoDao;
import com.example.ecobesa.entity.Documento;

@Service
public class DocumentoServiceImpl implements IDocumentoService{
	
	
	@Autowired
	private IDocumentoDao documentoDao;
	
	@Override
	public List<Documento> findAll() {
		// TODO Auto-generated method stub
		return (List<Documento>) documentoDao.findAll();
	}

	@Override
	public Documento findById(Long id) {
		// TODO Auto-generated method stub
		return documentoDao.findById(id).orElse(null);
	}

	@Override
	public void save(Documento documento) {
		// TODO Auto-generated method stub
		documentoDao.save(documento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		documentoDao.deleteById(id);
	}

	@Override
	public List<Documento> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Documento>) documentoDao.findAll(sort);
	}

	@Override
	public Page<Documento> findByCodigoContaining(String codigo, Pageable page) {
		// TODO Auto-generated method stub
		return documentoDao.findByCodigoContaining(codigo, page);
	}

	@Override
	public Page<Documento> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return documentoDao.findAll(pageable);
	}
}
