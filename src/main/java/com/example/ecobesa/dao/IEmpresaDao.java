package com.example.ecobesa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ecobesa.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long>{

}
