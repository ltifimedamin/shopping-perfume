package com.esprit.shopping_perfume_back.entities;


import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.PackagePrivate;

import javax.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName")
    private String firstName ;

    @Column(name = "lastName")
    private String lastName;


    @Column(name = "email")
    private String email ;

    @Column(name = "password")
    private String password ;

    @Column(name = "phone")
    private Integer phone;

    @OneToOne
    private Address address;


}
