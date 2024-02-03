package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.OrderEntity;
import com.esprit.shopping_perfume_back.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrder implements IServiceOrder{
    OrderRepository orderRepository;

    @Override
    public List<OrderEntity> retrieveAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity addOrder(OrderEntity b) {
        return orderRepository.save(b);
    }

    @Override
    public OrderEntity updateOrder(OrderEntity b) {
        return orderRepository.save(b);
    }

    @Override
    public OrderEntity retrieveOrder(Integer idOrder) {
        return orderRepository.findById(idOrder).get();
    }

    @Override
    public void removeOrder(Integer idOrder) {
        orderRepository.deleteById(idOrder);
    }
}
