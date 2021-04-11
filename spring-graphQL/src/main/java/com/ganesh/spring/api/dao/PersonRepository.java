package com.ganesh.spring.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.spring.api.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

	Person findByEmail(String email);

}
