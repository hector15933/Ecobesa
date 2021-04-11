package com.example.ecobesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecobesa.dao.IEmoDao;
import com.example.ecobesa.entity.Emo;

@Service
public class EmoServiceImpl implements IEmoService{

	@Autowired
	private IEmoDao emoDao;
	
	@Override
	public List<Emo> findAll() {
		// TODO Auto-generated method stub
		return (List<Emo>) emoDao.findAll();
	}

	@Override
	public List<Emo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return (List<Emo>) emoDao.findAll(sort);
	}

	@Override
	public Emo findById(Long id) {
		// TODO Auto-generated method stub
		return emoDao.findById(id).orElse(null);
	}

	@Override
	public void save(Emo emo) {
		// TODO Auto-generated method stub
		emoDao.save(emo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		emoDao.deleteById(id);
	}

}
