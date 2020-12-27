package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecobesa.dao.IEmpresaDao;
import com.example.ecobesa.entity.Empresa;





@Service
public class EmpresaServiceImpl implements IEmpresaService{
	
	 	@Autowired
		private IEmpresaDao empresaDao;
		
		@Override
		@Transactional(readOnly = true)
		public List<Empresa> findAll() {
			// TODO Auto-generated method stub
			return (List<Empresa>)empresaDao.findAll();
		}

		
		@Override
		@Transactional(readOnly = true)
		public Empresa findById(Long id) {
			// TODO Auto-generated method stub
			return empresaDao.findById(id).orElse(null);
		}
		
		@Override
		@Transactional()
		public Empresa save(Empresa empresa) {
			// TODO Auto-generated method stub
			return empresaDao.save(empresa);
		}
		
		@Override
		@Transactional
		public void delete(Long id) {
			// TODO Auto-generated method stub
			empresaDao.deleteById(id);
		} 
}
