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
    List<Fruit> getByPriceDesc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Fruit> getByPriceAsc();

    @Query("SELECT f FROM Fruit f WHERE f.name like %:name%")
    List<Fruit> searchByName(String name);

    @Query("DELETE FROM Fruit f WHERE f.id = :id")
    Fruit delete(long id);
}
