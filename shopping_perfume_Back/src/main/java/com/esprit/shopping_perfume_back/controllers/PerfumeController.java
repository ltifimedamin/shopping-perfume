package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/perfumes")
@CrossOrigin("http://localhost:4200")
public class PerfumeController {
   @Autowired
   private PerfumeRepository perfumeRepository;


   @GetMapping
    public List<Perfume> getPerfumes(){
       return this.perfumeRepository.findAll();
   } ;


   @PostMapping ("/create")
   public ResponseEntity<Perfume> createPerfume(@RequestBody Perfume perfume) {
      perfume= this.perfumeRepository .saveAndFlush(perfume);
      return ResponseEntity.ok(perfume);
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePerfumeById(@PathVariable  Integer id) {
      if (perfumeRepository.existsById(id)) {
         perfumeRepository.deleteById(id);
         return ResponseEntity.ok("Perfume deleted successfully");
      } else {
         return ResponseEntity.notFound().build();
      }
   }
}
