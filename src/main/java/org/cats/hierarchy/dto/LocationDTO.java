package org.cats.hierarchy.dto;

import org.cats.hierarchy.domain.Location;

import java.util.List;

public class LocationDTO {
    private Long id;
    private Long locationType;
    private String locationTypeName;
    private String name;
    private String code;
    private String parentName;
    private Long parentId;
    private LocationDTO parent;
    private List<LocationDTO> children;

    LocationDTO(){}

    public LocationDTO(Location location){
        this.id = location.getId();
        this.name = location.getName();
        this.code = location.getCode();

        if(location.getLocationType() != null){
            this.locationType = location.getLocationType().getId();
            this.locationTypeName = location.getLocationType().getName();
        }

        if(location.getParent() != null){
            this.parentId = location.getParent().getId();
            this.parentName = location.getParent().getName();
            this.parent = new LocationDTO(); // How to limit to one level only.
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLocationType() {
        return locationType;
    }

    public void setLocationType(Long locationType) {
        this.locationType = locationType;
    }

    public String getLocationTypeName() {
        return locationTypeName;
    }

    public void setLocationTypeName(String locationTypeName) {
        this.locationTypeName = locationTypeName;
    }

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

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public LocationDTO getParent() {
        return parent;
    }

    public void setParent(LocationDTO parent) {
        this.parent = parent;
    }

    public List<LocationDTO> getChildren() {
        return children;
    }

    public void setChildren(List<LocationDTO> children) {
        this.children = children;
    }
}
