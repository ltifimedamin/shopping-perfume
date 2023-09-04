package com.esprit.shopping_perfume_back.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id ;

    @Column(name = "town")
    private String town;

    @Column(name = "city")
    private String city;

    @Column(name = "addressLine")
    private String addressLine;

    @Column(name = "postalCode")
    private Integer postalCode;

}
