package com.example.ecobesa.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecobesa.dao.IAreaDao;
import com.example.ecobesa.entity.Area;



@Service
public class AreaServiceImpl implements IAreaService{
	 	
		@Autowired
		private IAreaDao areaDao;
		
		@Override
		@Transactional(readOnly = true)
		public List<Area> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return (List<Area>)areaDao.findAll(sort);
		}

		
		@Override
		@Transactional(readOnly = true)
		public Area findById(Long id) {
			// TODO Auto-generated method stub
			return areaDao.findById(id).orElse(null);
		}
		
		@Override
		@Transactional()
		public void save(Area area) {
			// TODO Auto-generated method stub
			 areaDao.save(area);
		}
		
		@Override
		@Transactional
		public void delete(Long id) {
			// TODO Auto-generated method stub
			areaDao.deleteById(id);
		} 
}
