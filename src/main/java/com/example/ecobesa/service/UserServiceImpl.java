package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecobesa.dao.IUserDao;
import com.example.ecobesa.entity.User;



@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<User>)userDao.findAll();
	}

	
	@Override
	@Transactional(readOnly = true)
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional()
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}


	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return userDao.findAll(pageable);
	}


	@Override
	public List<User> findByNombres(String term) {
		// TODO Auto-generated method stub
		return userDao.findByNombres("%"+term+"%");
	}


	@Override
	public User findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return userDao.findByUsuario(usuario);
	} 
	
	@Override
	public Page<User> findByNombresStartsWith(String nombres, Pageable page) {
		// TODO Auto-generated method stub
		return userDao.findByNombresStartsWith(nombres, page);
	}
	@Override
	public Page<User> findByApellidosStartsWith(String apellidos, Pageable page) {
		// TODO Auto-generated method stub
		return userDao.findByApellidosStartsWith(apellidos, page);
	}
	@Override
	public Page<User> findByDniStartsWith(Integer dni, Pageable page) {
		// TODO Auto-generated method stub
		return userDao.findByDniStartsWith(dni, page);
	}
}
