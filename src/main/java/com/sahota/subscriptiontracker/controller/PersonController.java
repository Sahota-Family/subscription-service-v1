package com.sahota.subscriptiontracker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahota.subscriptiontracker.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    PersonMapper personMapper;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public PersonController(PersonMapper personMapper) {

        this.personMapper = personMapper;
    }

    @GetMapping("/test")
    public String test() throws JsonProcessingException {

        return objectMapper.writeValueAsString(personMapper.getUserById(1L));
    }
}
