package com.example.demo.jpamini.repository;

import com.example.demo.jpamini.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

}