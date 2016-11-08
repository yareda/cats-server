package org.cats.commodity.service;

import org.cats.commodity.domain.Commodity;
import org.cats.commodity.domain.CommodityType;
import org.cats.commodity.repository.CommodityRepository;
import org.cats.commodity.repository.CommodityTypeRepository;
import org.cats.commodity.repository.UomCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommodityService {

    @Autowired
    CommodityRepository commodityRepository;

    @Autowired
    CommodityTypeRepository commodityTypeRepository;

    public List<Commodity> allCommodities(){
        return commodityRepository.findAll();
    }

    public Commodity findCommodity(Long id){
        return commodityRepository.findOne(id);
    }

    public void saveCommodity(Commodity commodity){
        commodityRepository.save(commodity);
    }

    public void deleteCommodity(Long id){
        commodityRepository.delete(id);
    }

    public List<CommodityType> allCommodityTypes(){return commodityTypeRepository.findAll();}

    public CommodityType findCommodityType(Long id){
        return commodityTypeRepository.findOne(id);
    }

    public void saveCommodityType(CommodityType commodityType){
        commodityTypeRepository.save(commodityType);
    }

    public void deleteCommodityType(Long id){
        commodityTypeRepository.delete(id);
    }


}
