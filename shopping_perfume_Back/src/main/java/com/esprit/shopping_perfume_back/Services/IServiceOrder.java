package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.OrderEntity;

import java.util.List;

public interface IServiceOrder {
    List<OrderEntity> retrieveAllOrders();

    OrderEntity addOrder(OrderEntity b);

    OrderEntity updateOrder(OrderEntity b);

    OrderEntity retrieveOrder(Integer idOrder);

    void removeOrder(Integer idOrder);
}
