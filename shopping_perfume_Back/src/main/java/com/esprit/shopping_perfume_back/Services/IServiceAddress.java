package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Address;

import java.util.List;

public interface IServiceAddress {
    List<Address> retrieveAllOrders();

    Address addOrder(Address b);

    Address updateAddress(Address b);

    Address retrieveAddress(Integer idOrder);

    void removeAddress(Integer idOrder);
}
