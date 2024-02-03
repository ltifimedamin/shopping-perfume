package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Address;
import com.esprit.shopping_perfume_back.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ServiceAddress implements IServiceAddress{

    AddressRepository addressRepository;
    @Override
    public List<Address> retrieveAllOrders() {
        return addressRepository.findAll();
    }

    @Override
    public Address addOrder(Address b) {
        return addressRepository.save(b);
    }

    @Override
    public Address updateAddress(Address b) {
        return addressRepository.save(b);
    }

    @Override
    public Address retrieveAddress(Integer idOrder) {
        return addressRepository.findById(idOrder).get();
    }

    @Override
    public void removeAddress(Integer idOrder) {
        addressRepository.deleteById(idOrder);
    }
}
