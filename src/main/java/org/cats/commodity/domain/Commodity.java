package org.cats.commodity.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.cats.core.BaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commodity extends BaseModel {

    private String name;
    private String longName;
    private String description;
    private Boolean hazardous;
    private Boolean coldStorage;
    private Double minTemperature;
    private Double maxTemperature;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "parent_commodity_id")
    private Commodity parent;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "parent_commodity_id")
    private List<Commodity> children;

    @ManyToOne
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private CommodityType commodityType;

    Commodity(){}

    public Commodity(String name,
                     String longName,
                     String description,
                     Boolean hazardous,
                     Boolean coldStorageRequired,
                     Double minTemperature,
                     Double maxTemperature,
                     UnitOfMeasure unitOfMeasure,
                     CommodityType commodityType,
                     Commodity parent){

        this.name = name;
        this.longName = longName;
        this.description = description;
        this.hazardous = hazardous;
        this.coldStorage = coldStorageRequired;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.unitOfMeasure = unitOfMeasure;
        this.commodityType = commodityType;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isHazardous() {
        return hazardous;
    }

    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    public Boolean isColdStorage() {
        return coldStorage;
    }

    public void setColdStorage(Boolean coldStorage) {
        this.coldStorage = coldStorage;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Commodity getParent() {
        return parent;
    }

    public void setParent(Commodity parent) {
        this.parent = parent;
    }

    public List<Commodity> getChildren() {
        return children;
    }

    public void setChildren(List<Commodity> children) {
        this.children = children;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public CommodityType getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(CommodityType commodityType) {
        this.commodityType = commodityType;
    }
}
