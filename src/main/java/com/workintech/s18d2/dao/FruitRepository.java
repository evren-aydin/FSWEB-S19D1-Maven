package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//CRUD
//normalde buraya @Repository yazardık ama JpaRepository bize bunu saglıyor
public interface FruitRepository extends JpaRepository<Fruit,Long> {
//yukarıda tanımladığımız JpaRepository bize tüm CRUD fonksiyonlarını verir.


    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Fruit> fruitByPriceDesc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Fruit> fruitByPriceAsc();

    @Query("SELECT f FROM Fruit f WHERE f.name like %:name%")
    List<Fruit> fruitByName(String name);
}
