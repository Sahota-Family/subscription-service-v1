package com.sahota.subscriptiontracker.model;

import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class Person {

    Long personID;
    String firstName;
    String lastName;
    Instant dateCreated;
}
