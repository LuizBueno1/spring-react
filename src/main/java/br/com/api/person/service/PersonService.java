package br.com.api.person.service;

import org.springframework.stereotype.Service;

import br.com.api.person.models.Person;
import br.com.api.person.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    public Person registerPerson(Person person){
        return repository.save(person);
    }
}
