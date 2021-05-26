package com.demo.aptem334.controller;

import com.demo.aptem334.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.aptem334.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@RestController
public class HelloController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(path="/all")
    public Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }
}