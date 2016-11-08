package org.cats.commodity.domain;

import org.cats.core.BaseModel;

import javax.persistence.*;

@Entity
public class UnitOfMeasure extends BaseModel {

    public static final String UOM_REF = "ref";
    public static final String UOM_BIG = "big";
    public static final String UOM_SMALL = "small";

    private String uomType;
    private String name;
    private double ratio;

    @ManyToOne
    private UomCategory uomCategory;

    UnitOfMeasure(){}

    public UnitOfMeasure(String name, String type, double ratio, UomCategory category){
        this.name = name;
        this.uomType = type;
        this.uomCategory = category;
        this.ratio = ratio;
    }

    public String getUomType() {
        return uomType;
    }

    public void setUomType(String uomType) {
        this.uomType = uomType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatio() { return ratio;}

    public void setRatio(double ratio) { this.ratio = ratio;}

    public UomCategory getUomCategory() {
        return uomCategory;
    }

    public void setUomCategory(UomCategory uomCategory) {
        this.uomCategory = uomCategory;
    }

    public double convertToRef(double value){
        double result = 0;
        switch (this.uomType){
            case UOM_REF:
                result = value;
                break;
            case UOM_BIG:
                result = value * this.ratio;
                break;
            case UOM_SMALL:
                result = value / this.ratio;
                break;
        }
        return result;
    }
}
