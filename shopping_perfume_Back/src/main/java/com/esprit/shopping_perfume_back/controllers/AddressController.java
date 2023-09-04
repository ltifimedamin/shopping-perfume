package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;


    @GetMapping
    public List<Address> getAddresses() { return this.addressRepository.findAll();};

    @PostMapping("/create")
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        address= this.addressRepository .saveAndFlush(address);
        return ResponseEntity.ok(address);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressById(@PathVariable  Integer id) {
        if (addressRepository.existsById(id)) {
            addressRepository.deleteById(id);
            return ResponseEntity.ok("address deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
