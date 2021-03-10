package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IPlannerSafetyDao;
import com.example.ecobesa.entity.PlannerSafety;



@Service
public class PlannerSafetyServiceImpl implements IPlannerSafetyService{
	
	@Autowired
	private IPlannerSafetyDao plannerSafetyDao;
	
	@Override
	public List<PlannerSafety> findAll() {
		// TODO Auto-generated method stub
		return (List<PlannerSafety>) plannerSafetyDao.findAll();
	}

	@Override
	public List<PlannerSafety> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<PlannerSafety>) plannerSafetyDao.findAll(sort);
	}

	@Override
	public PlannerSafety findById(Long id) {
		// TODO Auto-generated method stub
		return plannerSafetyDao.findById(id).orElse(null);
	}

	@Override
	public void save(PlannerSafety plannerSafety) {
		// TODO Auto-generated method stub
		plannerSafetyDao.save(plannerSafety);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plannerSafetyDao.deleteById(id);
	}

	@Override
	public List<PlannerSafety> findAllByMonth(Integer term) {
		// TODO Auto-generated method stub
		return plannerSafetyDao.findByMonth(term);
	}

	@Override
	public List<PlannerSafety> findAllByMonthAnteriores(Integer term) {
		// TODO Auto-generated method stub
		return plannerSafetyDao.findByMonthAnteriores(term);
	}

	@Override
	public List<PlannerSafety> findAllByMonthPosteriores(Integer term) {
		// TODO Auto-generated method stub
		return plannerSafetyDao.findByMonthPosteriores(term);
	}

}
