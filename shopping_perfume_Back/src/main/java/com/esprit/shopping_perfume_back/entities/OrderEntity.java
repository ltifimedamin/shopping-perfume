package com.esprit.shopping_perfume_back.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "quantity")
    private Integer quantity;

}
