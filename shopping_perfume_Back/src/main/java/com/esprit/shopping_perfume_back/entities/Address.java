package com.esprit.shopping_perfume_back.entities;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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
