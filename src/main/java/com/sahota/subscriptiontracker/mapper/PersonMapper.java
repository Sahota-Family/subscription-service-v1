package com.sahota.subscriptiontracker.mapper;

import com.sahota.subscriptiontracker.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PersonMapper {

    @Select("SELECT PersonID, FirstName, LastName, DateCreated, LastUpdated, LastUpdatedBy, EmailAddress FROM subscription.person")
    Person[] getAllPeople();
}
