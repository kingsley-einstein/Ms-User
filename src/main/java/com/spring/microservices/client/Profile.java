package com.spring.microservices.client;

import java.util.Date;
import java.util.UUID;

@SuppressWarnings("serial")
public class Profile implements java.io.Serializable {
    private UUID userId;
    private String name;
    private Date dob;

    public Profile() {}

    public Profile(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public UUID getUserId() {
        return userId;
    }
}