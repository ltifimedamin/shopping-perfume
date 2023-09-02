package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Order;
import com.esprit.shopping_perfume_back.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/ord")
    @GetMapping(name = "orde")
    public List<Order> getOrders() { return this.orderRepository.findAll();};
}
