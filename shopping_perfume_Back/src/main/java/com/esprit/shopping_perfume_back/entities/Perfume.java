package com.esprit.shopping_perfume_back.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Perfume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "image")
    private String image;

    @Column(name = "season")
    private String season;

    @Column(name = "title")
    private String title;

    @Column(name = "brand")
    private String brand;

    @Column(name = "Volume")
    private Integer Volume;

    @Column(name = "category")
    private String category ;

    @Column(name="price")
    private String price;

}
