package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.Services.IServiceCompany;
import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.entities.Company;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@CrossOrigin("http://localhost:4200")
public class CompanyController {

    IServiceCompany iServiceCompany;
    @GetMapping("/allCompany")
    public List<Company> getCompany() {
        List<Company> listBlocs = iServiceCompany.retrieveAllCompanies();
        return listBlocs;
    }

    @GetMapping("/retrieveCompany/{id}")
    public Company retrieveCompany(@PathVariable("id") Integer id) {
        return iServiceCompany.retrieveCompany(id);
    }

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company b) {
        Company bloc = iServiceCompany.addCompany(b);
        return bloc;
    }

    @DeleteMapping("/updateCompany/{id}")
    public void updateCompany(@PathVariable("id") Integer id) {
        iServiceCompany.removeCompany(id);
    }

    @PutMapping("/updateCompany")
    public Company updateCompany(@RequestBody Company e) {
        Company bloc= iServiceCompany.updateCompany(e);
        return bloc;
    }
}
