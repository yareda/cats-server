package org.cats.hrd.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cats.commodity.domain.UnitOfMeasure;
import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class RationItem extends BaseModel {

    @NotNull
    private BigDecimal amount;

    @ManyToOne
    @JsonIgnore
    private Ration ration;

    @ManyToOne
    private UnitOfMeasure unitOfMeasure;

    RationItem(){};

    public RationItem(BigDecimal amount, Ration ration, UnitOfMeasure uom){
        this.amount = amount;
        this.ration = ration;
        this.unitOfMeasure = uom;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Ration getRation() {
        return ration;
    }

    public void setRation(Ration ration) {
        this.ration = ration;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
