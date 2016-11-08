package org.cats.hierarchy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class FDP  extends BaseModel{
    private String name;
    private String description;
    private BigDecimal latitude;
    private BigDecimal longitude;

    @ManyToOne
    @JsonIgnore
    private Location location;

    @OneToMany(mappedBy = "fdp")
    private List<FDPContact> contactList;

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

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<FDPContact> getContactList() {
        return contactList;
    }

    public void setContactList(List<FDPContact> contactList) {
        this.contactList = contactList;
    }
}
