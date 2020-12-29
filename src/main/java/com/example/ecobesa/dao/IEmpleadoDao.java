package com.example.ecobesa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ecobesa.entity.Empleado;

public interface IEmpleadoDao extends PagingAndSortingRepository<Empleado, Long>{

}
