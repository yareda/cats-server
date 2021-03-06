package org.cats.giftcertificate.domain;

import org.cats.core.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FundSource extends BaseModel {
    @Column(unique = true)
    private String name;
    private String description;

    FundSource(){}

    public FundSource(String name, String description){
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
