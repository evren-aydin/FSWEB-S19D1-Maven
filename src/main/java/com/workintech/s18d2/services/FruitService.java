package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitService {

    Fruit save(Fruit fruit);
    List<Fruit> findAll();

    Fruit getById(long id);
    List<Fruit> getByPriceDesc();
    List<Fruit> getByPriceAsc();
    List<Fruit> searchByName(String name);

    void delete(long id);
}
