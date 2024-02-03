package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.Services.IServiceAddress;
import com.esprit.shopping_perfume_back.Services.IServiceOrder;
import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.entities.OrderEntity;
import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/orders")
public class OrderController {
    IServiceOrder iServiceOrder;

    @GetMapping("/getOrders")
    public List<OrderEntity> getOrders() {
        List<OrderEntity> listBlocs = iServiceOrder.retrieveAllOrders();
        return listBlocs;
    }

    @GetMapping("/retrieveOrder/{id}")
    public OrderEntity retrieveOrder(@PathVariable("id") Integer id) {
        return iServiceOrder.retrieveOrder(id);
    }

    @PostMapping("/addOrder")
    public OrderEntity addOrder(@RequestBody OrderEntity b) {
        OrderEntity bloc = iServiceOrder.addOrder(b);
        return bloc;
    }

    @DeleteMapping("/removeOrder/{id}")
    public void removeOrder(@PathVariable("id") Integer id) {
        iServiceOrder.removeOrder(id);
    }

    @PutMapping("/updateOrder")
    public OrderEntity updateOrder(@RequestBody OrderEntity e) {
        OrderEntity bloc= iServiceOrder.updateOrder(e);
        return bloc;
    }
}
