package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Company;
import com.esprit.shopping_perfume_back.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/companies")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @RequestMapping("/comp")
    @GetMapping(name = "mohamed")
    public List<Company> getCompanies(){return this.companyRepository.findAll();}
}
