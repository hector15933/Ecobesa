package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.Emo;


public interface IEmoService {
	
	public List<Emo> findAll();
	
	public List<Emo> findAll(Sort sort);
	
	public Emo findById(Long id);
	
	public void save(Emo emo);
	
	public void delete(Long id);	
}
