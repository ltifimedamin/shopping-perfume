package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.User;
import com.esprit.shopping_perfume_back.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user")
    @GetMapping(name = "hamma")
    public List<User> getUsers(){ return this.userRepository.findAll();};
}
