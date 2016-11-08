package org.cats.hierarchy.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Location extends BaseModel {
    private String name;
    private String code;

    @ManyToOne
    private LocationType locationType;

    @ManyToOne
    @JoinColumn(name = "parent_location_id")
    @JsonBackReference
    private Location parent;

    @OneToMany
    @JoinColumn(name = "parent_location_id")
    @JsonManagedReference
    private List<Location> children;

    @OneToMany(mappedBy = "location")
    private List<FDP> fdpList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Location getParent() {
        return parent;
    }

    public void setParent(Location parent) {
        this.parent = parent;
    }

    public List<Location> getChildren() {
        return children;
    }

    public void setChildren(List<Location> children) {
        this.children = children;
    }

    public List<FDP> getFdpList() {
        return fdpList;
    }

    public void setFdpList(List<FDP> fdpList) {
        this.fdpList = fdpList;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }
}
