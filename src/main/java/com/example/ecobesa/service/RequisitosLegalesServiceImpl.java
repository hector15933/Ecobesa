package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IRequisitosLegalesDao;
import com.example.ecobesa.entity.RequisitosLegales;


@Service
public class RequisitosLegalesServiceImpl implements IRequisitosLegalesService{
	
	
	@Autowired
	private IRequisitosLegalesDao requisitosLegalesDao;
	
	@Override
	public List<RequisitosLegales> findAll() {
		// TODO Auto-generated method stub
		return (List<RequisitosLegales>) requisitosLegalesDao.findAll();
	}

	@Override
	public List<RequisitosLegales> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<RequisitosLegales>) requisitosLegalesDao.findAll(sort);
	}

	@Override
	public RequisitosLegales findById(Long id) {
		// TODO Auto-generated method stub
		return requisitosLegalesDao.findById(id).orElse(null);
	}

	@Override
	public void save(RequisitosLegales lineaBase) {
		// TODO Auto-generated method stub
		requisitosLegalesDao.save(lineaBase);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		requisitosLegalesDao.deleteById(id);
	}

	@Override
	public Page<RequisitosLegales> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return requisitosLegalesDao.findAll(pageable);
	}

	@Override
	public Page<RequisitosLegales> findByNombreNorma(String param, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return requisitosLegalesDao.findByNombreNorma(param,pageRequest);
	}
}
