package br.com.api.person.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.api.person.models.Person;
import br.com.api.person.service.PersonService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public ResponseEntity<Person> register(@RequestBody Person person) {

        Person newPerson = service.registerPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPerson);

    }
    
    
}
