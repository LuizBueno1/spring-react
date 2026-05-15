package br.com.api.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.person.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
    
}
