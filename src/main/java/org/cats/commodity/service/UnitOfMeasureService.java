package org.cats.commodity.service;

import org.cats.commodity.domain.UnitOfMeasure;
import org.cats.commodity.repository.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitOfMeasureService {

    @Autowired
    UnitOfMeasureRepository repository;

    public void save(UnitOfMeasure uom){
        repository.save(uom);
    }

    public void delete(Long id){
        repository.delete(id);
    }

    public List<UnitOfMeasure> all(){
        return repository.findAll();
    }

    public UnitOfMeasure find(Long id){
        return repository.findOne(id);
    }

    public List<UnitOfMeasure> unitsInCategory(Long category){
        return null;
    }
}
