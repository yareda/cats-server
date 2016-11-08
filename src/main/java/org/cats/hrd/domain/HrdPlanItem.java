package org.cats.hrd.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cats.core.BaseModel;
import org.cats.hierarchy.domain.Location;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class HrdPlanItem extends BaseModel{

    private Integer startingMonth;
    private Integer duration;
    private Integer beneficiary;

    @ManyToOne
    @JsonIgnore
    private Hrd hrd;

    @ManyToOne
    private Location location;

    public HrdPlanItem() {}

    public HrdPlanItem(Integer startingMonth, Integer duration, Integer beneficiary, Hrd hrd, Location location) {
        this.startingMonth = startingMonth;
        this.duration = duration;
        this.beneficiary = beneficiary;
        this.hrd = hrd;
        this.location = location;
    }

    public Integer getStartingMonth() {
        return startingMonth;
    }

    public void setStartingMonth(Integer startingMonth) {
        this.startingMonth = startingMonth;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Integer beneficiary) {
        this.beneficiary = beneficiary;
    }

    public Hrd getHrd() {
        return hrd;
    }

    public void setHrd(Hrd hrd) {
        this.hrd = hrd;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
