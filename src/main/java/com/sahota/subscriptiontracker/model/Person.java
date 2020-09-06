package com.sahota.subscriptiontracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class Person {

    @JsonProperty("personID")
    Long personID;

    @JsonProperty("firstName")
    String firstName;

    @JsonProperty("lastName")
    String lastName;

    @JsonProperty("dateCreated")
    Instant dateCreated;
}
