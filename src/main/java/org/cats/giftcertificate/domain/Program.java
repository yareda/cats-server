package org.cats.giftcertificate.domain;

import org.cats.core.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Program extends BaseModel {
    @Column(unique = true)
    private String name;
    private String shortName;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
