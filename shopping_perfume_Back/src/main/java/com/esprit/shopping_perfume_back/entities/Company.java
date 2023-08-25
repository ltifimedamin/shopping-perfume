package com.esprit.shopping_perfume_back.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Company {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private Integer id;

        @Column(name = "country")
        private String country;

        @OneToMany
        @Column(name = "perfumes ")
        private List<Perfume> perfumes;

}
