package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.ITipoDocumentoDao;
import com.example.ecobesa.entity.TipoDocumento;


@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService{

	@Autowired
	private ITipoDocumentoDao tipoDocumentoDao;
	
	@Override
	public List<TipoDocumento> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoDocumento>) tipoDocumentoDao.findAll();
	}

	@Override
	public List<TipoDocumento> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<TipoDocumento>) tipoDocumentoDao.findAll(sort);
	}

	@Override
	public TipoDocumento findById(Long id) {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.findById(id).orElse(null);
	}

	@Override
	public void save(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		tipoDocumentoDao.save(tipoDocumento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoDocumentoDao.deleteById(id);
	}

}
