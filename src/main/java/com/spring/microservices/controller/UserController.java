package com.spring.microservices.controller;

import java.util.UUID;

import com.spring.microservices.client.Profile;
import com.spring.microservices.client.ProfileClient;
import com.spring.microservices.model.User;
import com.spring.microservices.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository repo;

    @Autowired
    private ProfileClient client;

    @PostMapping("/user")
    public User newUser(@RequestBody User body) {
        User user = new User(body.getUsername(), UUID.randomUUID().toString());
        return repo.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") UUID id) {
        User user = repo.findById(id)
        .get();
        return user;
    }

    @GetMapping("/user/profile/{id}")
    public Profile getProfile(@PathVariable("id") UUID id) {
        Profile profile = client.getProfile(id);
        return profile;
    }
}