package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Sede;

public interface ISedeService {
	public List<Sede> findAll();
	public List<Sede> findAll(Sort sort);
	public Page<Sede> findAll(Pageable pageable);
	public Sede findById(Long id);
	public void save(Sede sede);
	public void delete(Long id);
}
