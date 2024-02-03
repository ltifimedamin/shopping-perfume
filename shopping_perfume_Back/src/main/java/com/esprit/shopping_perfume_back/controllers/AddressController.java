package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.Services.IServiceAddress;
import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/addresses")
public class AddressController {
    IServiceAddress iServiceAddress;

    @GetMapping("/allAddress")
    public List<Address> getAddress() {
        List<Address> listBlocs = iServiceAddress.retrieveAllOrders();
        return listBlocs;
    }

    @GetMapping("/Address/{id}")
    public Address retrieveAddress(@PathVariable("id") Integer id) {
        return iServiceAddress.retrieveAddress(id);
    }

    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address b) {
        Address bloc = iServiceAddress.addOrder(b);
        return bloc;
    }

    @DeleteMapping("/removeAddress/{id}")
    public void removeAddress(@PathVariable("id") Integer id) {
        iServiceAddress.removeAddress(id);
    }

    @PutMapping("/updateAddress")
    public Address updateAddress(@RequestBody Address e) {
        Address bloc= iServiceAddress.updateAddress(e);
        return bloc;
    }
}
