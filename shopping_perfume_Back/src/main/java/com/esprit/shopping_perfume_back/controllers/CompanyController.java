package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Company;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@CrossOrigin("http://localhost:4200")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;



    @GetMapping
    public List<Company> getCompanies(){return this.companyRepository.findAll();};


    @PostMapping("/create")
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        company= this.companyRepository .saveAndFlush(company);
        return ResponseEntity.ok(company);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable  Integer id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return ResponseEntity.ok("company deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
