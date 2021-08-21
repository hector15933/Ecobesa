package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> findAll();
	public Iterable<Empleado> findAll(Sort sort);
	public Page<Empleado> findAll(Pageable pageable);
	public Page<Empleado> findByNombresStartsWith(String nombres, Pageable page);
	public Page<Empleado> findByApellidosStartsWith(String nombres, Pageable page);
	public Page<Empleado> findByDniStartsWith(Integer dni, Pageable page);
	public Empleado findById(Long id);
	public Empleado save(Empleado empleado);
	public void delete(Long id);
}
