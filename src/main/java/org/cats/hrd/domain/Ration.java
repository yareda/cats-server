package org.cats.hrd.domain;

import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ration extends BaseModel {
    private String referenceNo;
    private Boolean currentRation;
    private String description;

    @OneToMany(mappedBy = "ration")
    private List<RationItem> rationItemList = new ArrayList<RationItem>();

    Ration(){};

    public Ration(String referenceNo, Boolean currentRation, String description){
        this.referenceNo = referenceNo;
        this.currentRation = currentRation;
        this.description = description;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Boolean getCurrentRation() {
        return currentRation;
    }

    public void setCurrentRation(Boolean currentRation) {
        this.currentRation = currentRation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
