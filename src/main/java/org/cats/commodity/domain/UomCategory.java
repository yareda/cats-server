package org.cats.commodity.domain;

import org.cats.core.BaseModel;
import javax.persistence.Entity;


@Entity
public class UomCategory extends BaseModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
