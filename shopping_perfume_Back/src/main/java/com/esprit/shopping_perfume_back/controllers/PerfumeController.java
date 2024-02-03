package com.esprit.shopping_perfume_back.controllers;

import com.esprit.shopping_perfume_back.Services.IServicePerfume;
import com.esprit.shopping_perfume_back.entities.OrderEntity;
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

  IServicePerfume iServicePerfume;
   @GetMapping("/getPerfumes")
   public List<Perfume> getPerfumes() {
      List<Perfume> listBlocs = iServicePerfume.retrieveAllPerfumes();
      return listBlocs;
   }

   @GetMapping("/retrievePerfume/{id}")
   public Perfume retrievePerfume(@PathVariable("id") Integer id) {
      return iServicePerfume.retrieveBloc(id);
   }

   @PostMapping("/addPerfume")
   public Perfume addPerfume(@RequestBody Perfume b) {
      Perfume bloc = iServicePerfume.addBloc(b);
      return bloc;
   }

   @DeleteMapping("/removePerfume/{id}")
   public void removePerfume(@PathVariable("id") Integer id) {
      iServicePerfume.removePerfume(id);
   }

   @PutMapping("/updatePerfume")
   public Perfume updatePerfume(@RequestBody Perfume e) {
      Perfume bloc= iServicePerfume.updateBloc(e);
      return bloc;
   }
}
