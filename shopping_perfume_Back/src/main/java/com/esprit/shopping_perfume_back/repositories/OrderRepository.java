package com.esprit.shopping_perfume_back.repositories;

import com.esprit.shopping_perfume_back.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
