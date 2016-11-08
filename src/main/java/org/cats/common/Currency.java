package org.cats.common;

import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency extends BaseModel {
    private String name;
    private String symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
