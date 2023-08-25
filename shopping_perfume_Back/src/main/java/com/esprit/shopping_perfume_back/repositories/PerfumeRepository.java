package com.esprit.shopping_perfume_back.repositories;

import com.esprit.shopping_perfume_back.entities.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume,Integer> {
}
