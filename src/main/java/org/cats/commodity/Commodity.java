package org.cats.commodity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commodity {
    @Id
    @GeneratedValue()
    private Long commodity_id;
    private String name;
    private String longName;
    private String description;
    private boolean hazardous;
    private boolean coldStorageRequired;
    private Double minTemperature;
    private Double maxTemperature;

    //Category
    //Unit of measure
    //Commodity type

}
