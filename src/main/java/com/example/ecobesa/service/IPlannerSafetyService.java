package com.example.ecobesa.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.ecobesa.entity.PlannerSafety;


public interface IPlannerSafetyService {
	
	
	public List<PlannerSafety> findAll();
	
	public List<PlannerSafety> findAllByMonth(Integer term);
	
	public List<PlannerSafety> findAllByMonthAnteriores(Integer term);
	
	public List<PlannerSafety> findAllByMonthPosteriores(Integer term);
	
	public List<PlannerSafety> findAll(Sort sort);
	
	public PlannerSafety findById(Long id);
	
	public void save(PlannerSafety plannerSafety);
	
	public void delete(Long id);	
}
