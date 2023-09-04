package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.OrderEntity;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;


    @GetMapping
    public List<OrderEntity> getOrders() { return this.orderRepository.findAll();};

    @PostMapping("/create")
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity) {
        orderEntity= this.orderRepository .saveAndFlush(orderEntity);
        return ResponseEntity.ok(orderEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable  Integer id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return ResponseEntity.ok("order deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
