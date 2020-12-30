package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.User;



public interface IUserService {
	
	public List<User> findAll();
	public Iterable<User> findAll(Sort sort);
	public Page<User> findAll(Pageable pageable);
	public User findById(Long id);
	public void save(User user);
	public void delete(Long id);
	
	public List<User> findByNombres(String term);
	public User findByUsuario(String usuario);
	public Page<User> findByNombresStartsWith(String nombres, Pageable page);
	public Page<User> findByApellidosStartsWith(String apellidos, Pageable page);
	public Page<User> findByDniStartsWith(Integer dni, Pageable page);
}
