package com.example.ecobesa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ecobesa.entity.User;

public interface IUserDao extends CrudRepository<User, Long>{

}
