package com.luv2code.springdemo.models;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class Customer {

    @NotNull(message="First Name is Required")
    @Size(min=1, message="First Name must be longer than 1 character")
    private String firstName;

    @NotNull(message="Last Name is Required")
    @Size(min=1, message="Last Name must be longer than 1 character")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}