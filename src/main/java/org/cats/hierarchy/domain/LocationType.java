package org.cats.hierarchy.domain;

import org.cats.core.BaseModel;

import javax.persistence.Entity;

/**
 * Represents administrative hierarchy node types (Region, Zone, Subcity, Woreda, and Kebele)
 */
@Entity
public class LocationType extends BaseModel {

    private String name;
    private String description;

    LocationType(){}

    public LocationType(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
