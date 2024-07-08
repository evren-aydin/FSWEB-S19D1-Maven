package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableService {

    Vegetable save(Vegetable vegetable);

    List<Vegetable> findAll();

    Vegetable findById(long id);

    List<Vegetable> vegetableByPriceDesc();
    List<Vegetable> vegetableByPriceAsc();
    List<Vegetable> vegetableByName(String name);

    void deleteData(long id);
}
