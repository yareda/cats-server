package org.cats.giftcertificate.domain;

import org.cats.core.BaseModel;

import javax.persistence.*;

@Entity
public class BudgetType extends BaseModel {
    @Column(unique = true, nullable = false)
    private String name;
    private String description;

    BudgetType(){}

    public BudgetType(String name, String description){
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
