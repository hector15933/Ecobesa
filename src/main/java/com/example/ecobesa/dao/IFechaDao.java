package com.example.ecobesa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.ecobesa.entity.Fecha;
import com.example.ecobesa.entity.User;

public interface IFechaDao extends CrudRepository<Fecha, Long>{
	
	
	
	
}
