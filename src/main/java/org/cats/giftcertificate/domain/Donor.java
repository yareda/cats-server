package org.cats.giftcertificate.domain;

import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Donor extends BaseModel {
    public static final Integer DONOR_ACTIVE = 1;
    public static final Integer DONOR_INACTIVE = 0;

    @NotNull
    private String name;
    private String shortName;
    private String code;
    private Boolean sourceDonor;
    private Boolean responsibleDonor;
    private Integer status = DONOR_ACTIVE;

    Donor(){}

    public Donor(String name, String shortName, String code, boolean sourceDonor, boolean responsibleDonor){
        this.name = name;
        this.shortName = shortName;
        this.code = code;
        this.sourceDonor = sourceDonor;
        this.responsibleDonor = responsibleDonor;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getSourceDonor() {
        return sourceDonor;
    }

    public Boolean getResponsibleDonor() {
        return responsibleDonor;
    }

    public void setSourceDonor(Boolean sourceDonor) {
        this.sourceDonor = sourceDonor;
    }

    public void setResponsibleDonor(Boolean responsibleDonor) {
        this.responsibleDonor = responsibleDonor;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
