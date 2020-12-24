package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IProgramaAnualDao;
import com.example.ecobesa.entity.ProgramaAnual;

@Service
public class ProgramaAnualServiceImpl implements IProgramaAnualService{
	
	@Autowired
	private IProgramaAnualDao programaAnualDao; 
	
	@Override
	public List<ProgramaAnual> findAll() {
		// TODO Auto-generated method stub
		return (List<ProgramaAnual>) programaAnualDao.findAll();
	}

	@Override
	public ProgramaAnual findById(Long id) {
		// TODO Auto-generated method stub
		return programaAnualDao.findById(id).orElse(null);
	}

	@Override
	public void save(ProgramaAnual programaAnual) {
		// TODO Auto-generated method stub
		programaAnualDao.save(programaAnual);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		programaAnualDao.deleteById(id);
	}

}
