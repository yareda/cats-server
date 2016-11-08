package org.cats.hrd.domain;

import org.cats.core.BaseModel;

import javax.persistence.Entity;

@Entity
public class Season extends BaseModel {
    private String name;
    private String description;

    Season(){}

    public Season(String name, String description){
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
