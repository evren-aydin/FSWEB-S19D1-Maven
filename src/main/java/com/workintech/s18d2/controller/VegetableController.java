package com.workintech.s18d2.controller;


import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/vegetables")
@Validated
public class VegetableController {

     private VegetableService vegetableService;

     @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @PostMapping
    public Vegetable save(@Valid @RequestBody Vegetable vegetable){
         return vegetableService.save(vegetable);
    }

    @GetMapping
    public List<Vegetable> vegetableByPriceAsc(){
         return vegetableService.vegetableByPriceAsc();
    }
    @GetMapping("/{id}")
    public Vegetable findById(@PathVariable long id){
         return vegetableService.findById(id);
    }
    @GetMapping("/desc")
    public List<Vegetable> vegetableByPriceDesc(){
         return vegetableService.vegetableByPriceDesc();
    }
    @PostMapping("/{name}")
    public List<Vegetable> findName(@PathVariable String name){
         return vegetableService.vegetableByName(name);

    }

    @DeleteMapping("/{id}")
    public void deleteData(@Valid @PathVariable long id){
         vegetableService.deleteData(id);
    }

}
