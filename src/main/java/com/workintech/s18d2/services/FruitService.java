package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitService {

    Fruit save(Fruit fruit);
    List<Fruit> findAll();

    Fruit findById(long id);
    List<Fruit> fruitByPriceDesc();
    List<Fruit> fruitByPriceAsc();
    List<Fruit> fruitByName(String name);

    void deleteData(long id);
}
