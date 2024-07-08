package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService{

    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit save(Fruit fruit) {
       return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit findById(long id) {
        Optional<Fruit> fruitOptional= fruitRepository.findById(id);

        if(fruitOptional.isPresent()){
            return fruitOptional.get();
        }
        //throw exception
        return null;
    }


    @Override
    public List<Fruit> fruitByPriceDesc() {
        return fruitRepository.fruitByPriceDesc();
    }

    @Override
    public List<Fruit> fruitByPriceAsc() {
        return fruitRepository.fruitByPriceAsc();
    }

    @Override
    public List<Fruit> fruitByName(String name) {
        return fruitRepository.fruitByName(name);

    }

    @Override
    public void deleteData(long id) {
        fruitRepository.deleteById(id);
    }
}
