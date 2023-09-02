package com.esprit.shopping_perfume_back.entities;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class User {
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


}
