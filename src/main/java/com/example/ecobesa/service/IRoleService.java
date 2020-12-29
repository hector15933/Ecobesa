package com.example.ecobesa.service;

import java.util.List;

import com.example.ecobesa.entity.Role;

public interface IRoleService {

	public List<Role> findAll();
	
	public Role findById(Long id);
	
	public void save(Role role);
	
	public void delete(Long id);
}
