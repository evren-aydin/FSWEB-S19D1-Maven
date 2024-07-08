package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService{

    private VegetableRepository vegetableRepository;

    @Autowired // vegetableRepository sınıfının instance 'ı yaratılır
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
      return  vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable findById(long id) {
       Optional<Vegetable> vegetableOptional= vegetableRepository.findById(id);
        if(vegetableOptional.isPresent()){//varsa ?
           return vegetableOptional.get();
        }
        //throw exception
    return null;
    }

    @Override
    public List<Vegetable> vegetableByPriceDesc() {
        return vegetableRepository.vegetableByPriceDesc();
    }

    @Override
    public List<Vegetable> vegetableByPriceAsc() {
        return vegetableRepository.vegetableByPriceAsc();
    }

    @Override
    public List<Vegetable> vegetableByName(String name) {
        return vegetableRepository.vegetableByName(name);
    }

    @Override
    public void deleteData(long id) {
        vegetableRepository.deleteById(id);
    }
}
