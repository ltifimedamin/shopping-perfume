package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/addresses")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @RequestMapping("/add")
    @GetMapping(name = "adres")
    public List<Address> getAddresses() { return this.addressRepository.findAll();};

}
