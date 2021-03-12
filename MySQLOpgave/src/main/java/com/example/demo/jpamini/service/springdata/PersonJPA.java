package com.example.demo.jpamini.service.springdata;

import com.example.demo.jpamini.model.Person;
import com.example.demo.jpamini.service.PersonService;
import com.example.demo.jpamini.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonJPA implements PersonService {

    private final PersonRepository personRepository;

    public PersonJPA(PersonRepository p) {
        personRepository = p;
    }

    @Override
    public Set<Person> findAll() {
        Set<Person> set = new HashSet<>();
        personRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Person save(Person object) {
        return personRepository.save(object);
    }

    @Override
    public void delete(Person object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Person> findById(Long aLong) {
        return Optional.empty();
    }
}