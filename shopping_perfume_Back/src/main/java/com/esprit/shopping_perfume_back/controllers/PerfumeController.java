package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/perfumes")
public class PerfumeController {
   @Autowired
   private PerfumeRepository perfumeRepository;

   @RequestMapping("/ayoub")
   @GetMapping(name = "amin" )
    public List<Perfume> getPerfumes(){
       return this.perfumeRepository.findAll();
   } ;
}
