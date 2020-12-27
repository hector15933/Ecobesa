package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.User;

public interface IUserDao extends PagingAndSortingRepository<User, Long>{
	
	
	public User findByUsuario(String usuario);
	public List<User> findAll(Sort sort);

	 
	public List<User> findByNombresLikeIgnoreCase(String term);
	
	public Page<User> findByNombresStartsWith(String nombres, Pageable page);
	public Page<User> findByApellidosStartsWith(String apellidos, Pageable page);
	public Page<User> findByDniStartsWith(Integer dni, Pageable page);


	@Query("select p from User p where p.nombres like %?1%")
	public List<User> findByNombres(String term);
}
