package com.esprit.shopping_perfume_back.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "season")
    private String season;

    @Column(name = "title")
    private String title;

    @Column(name = "mark")
    private String mark;

    @Column(name = "Volume")
    private String Volume;
}
