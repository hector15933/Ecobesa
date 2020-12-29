package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IRoleDao;
import com.example.ecobesa.entity.ProgramaAnual;
import com.example.ecobesa.entity.Role;

@Service
public class RoleServiceImpl implements IRoleService{
	@Autowired
	private IRoleDao roleDao; 
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return (List<Role>) roleDao.findAll();
	}

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return roleDao.findById(id).orElse(null);
	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		roleDao.save(role);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		roleDao.deleteById(id);
	}
}
