package com.esprit.shopping_perfume_back.repositories;

import com.esprit.shopping_perfume_back.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
