package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.entities.UserEntity;
import com.esprit.shopping_perfume_back.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

   @GetMapping
    public List<UserEntity> getUsers(){ return this.userRepository.findAll();};

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUserEntity(@RequestBody UserEntity userEntity ) {
        userEntity= this.userRepository.saveAndFlush(userEntity);
        return ResponseEntity.ok(userEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserId(@PathVariable  Integer id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.ok("user deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

