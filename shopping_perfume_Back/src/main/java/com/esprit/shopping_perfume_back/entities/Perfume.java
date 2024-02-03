package com.esprit.shopping_perfume_back.entities;

import jakarta.persistence.*;
import lombok.*;

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
