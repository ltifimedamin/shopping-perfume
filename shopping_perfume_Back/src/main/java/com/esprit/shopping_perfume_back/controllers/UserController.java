package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.Services.IServicePerfume;
import com.esprit.shopping_perfume_back.Services.IServiceUser;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.entities.UserEntity;
import com.esprit.shopping_perfume_back.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:4200")
public class UserController {
    IServiceUser iServicePerfume;
    @GetMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> listBlocs = iServicePerfume.retrieveAllUsers();
        return listBlocs;
    }

    @GetMapping("/retrieveUser/{id}")
    public UserEntity retrieveUser(@PathVariable("id") Integer id) {
        return iServicePerfume.retrieveUser(id);
    }

    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity b) {
        UserEntity bloc = iServicePerfume.addUser(b);
        return bloc;
    }

    @DeleteMapping("/removeUser/{id}")
    public void removeUser(@PathVariable("id") Integer id) {
        iServicePerfume.removeUser(id);
    }

    @PutMapping("/updateUser")
    public UserEntity updateUser(@RequestBody UserEntity e) {
        UserEntity bloc= iServicePerfume.updateUser(e);
        return bloc;
    }
}

