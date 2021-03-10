package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.PlannerSafety;
import com.example.ecobesa.entity.User;

public interface IPlannerSafetyDao extends PagingAndSortingRepository<PlannerSafety, Long>{
	
	
	
	@Query("select p from PlannerSafety p where EXTRACT(MONTH FROM fecha) = ?1 order by fecha ASC")
	public List<PlannerSafety> findByMonth(Integer term);
	
	@Query("select p from PlannerSafety p where EXTRACT(MONTH FROM fecha) < ?1 order by fecha ASC")
	public List<PlannerSafety> findByMonthAnteriores(Integer term);
	
	
	@Query("select p from PlannerSafety p where EXTRACT(MONTH FROM fecha) > ?1 order by fecha ASC")
	public List<PlannerSafety> findByMonthPosteriores(Integer term);
}
