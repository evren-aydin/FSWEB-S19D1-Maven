package com.workintech.s18d2.controller;


import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import com.workintech.s18d2.validations.Validation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/fruits")
@Validated
public class FruitController {

    private FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping
    public Fruit save(@Valid @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @GetMapping
    public List<Fruit> fruitsByPriceAsc(){
        return fruitService.fruitByPriceAsc();
    }
    @GetMapping("/{id}")
    public Fruit fruitById(@PathVariable long id){
        Validation.isIdNotValid(id);
        return fruitService.findById(id);

    }

    @GetMapping("/desc")
    public List<Fruit> fruitsByPriceDesc(){
        return fruitService.fruitByPriceDesc();
    }

    @PostMapping("/{name}")
    public List<Fruit> fruitsByName(@PathVariable String name){
        return fruitService.fruitByName(name);
    }
    @DeleteMapping("/{id}")
    public void deleteData(@Valid @PathVariable long id){
        fruitService.deleteData(id);
    }

}
