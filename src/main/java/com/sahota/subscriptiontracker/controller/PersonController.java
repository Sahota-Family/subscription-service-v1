package com.sahota.subscriptiontracker.controller;

import com.sahota.subscriptiontracker.mapper.PersonMapper;
import com.sahota.subscriptiontracker.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    PersonMapper personMapper;

    @Autowired
    public PersonController(PersonMapper personMapper) {

        this.personMapper = personMapper;
    }

    @GetMapping("/test")
    public String test() {

        StringBuilder sb = new StringBuilder();

        for (Person person : personMapper.getAllPeople()) {

            sb.append(person.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
