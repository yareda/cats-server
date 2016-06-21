package org.cats.commodity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    @JsonIgnore
    @ManyToOne
    private UnitOfMeasureCategory category;

    UnitOfMeasure(){}

    public UnitOfMeasure(String type, UnitOfMeasureCategory category){
        this.type = type;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UnitOfMeasureCategory getCategory() {
        return category;
    }

    public void setCategory(UnitOfMeasureCategory category) {
        this.category = category;
    }
}
