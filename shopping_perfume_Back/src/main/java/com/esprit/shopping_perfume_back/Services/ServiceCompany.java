package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Company;
import com.esprit.shopping_perfume_back.repositories.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ServiceCompany implements IServiceCompany {

    CompanyRepository companyRepository;

    @Override
    public List<Company> retrieveAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company addCompany(Company b) {
        return companyRepository.save(b);
    }

    @Override
    public Company updateCompany(Company b) {
        return companyRepository.save(b);
    }

    @Override
    public Company retrieveCompany(Integer idOrder) {
        return companyRepository.findById(idOrder).get();
    }

    @Override
    public void removeCompany(Integer idOrder) {
        companyRepository.deleteById(idOrder);
    }
}
