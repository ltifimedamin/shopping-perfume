package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Company;

import java.util.List;

public interface IServiceCompany {


    List<Company> retrieveAllCompanies();

    Company addCompany(Company b);

    Company updateCompany(Company b);

    Company retrieveCompany(Integer idOrder);

    void removeCompany(Integer idOrder);
}
