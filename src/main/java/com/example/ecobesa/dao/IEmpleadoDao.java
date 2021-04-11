package com.example.ecobesa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Empleado;

public interface IEmpleadoDao extends PagingAndSortingRepository<Empleado, Long>{
	
	
	public Page<Empleado> findByNombresStartsWith(String nombres, Pageable page);
	public Page<Empleado> findByApellidosStartsWith(String nombres, Pageable page);
	public Page<Empleado> findByDniStartsWith(Integer dni, Pageable page);
	
	
}
