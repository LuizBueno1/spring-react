package br.com.api.person.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PersonController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }
    
}
