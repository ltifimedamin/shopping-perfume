package com.esprit.shopping_perfume_back.entities;
import jakarta.persistence.*;
import jakarta.persistence.OneToMany;
import lombok.*;

import javax.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Company {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "image")
        private String image;

        @Column(name = "country")
        private String country;

        @OneToMany
        @Column(name = "perfumes ")
        private List<Perfume> perfumes;

}
