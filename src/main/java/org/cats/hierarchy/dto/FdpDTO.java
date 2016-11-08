package org.cats.hierarchy.dto;

import java.math.BigDecimal;
import java.util.List;

public class FdpDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal latitude;
    private BigDecimal longitude;

    private LocationDTO location;
    private List<FdpContactDto> contacts;

    FdpDTO(){}

    public FdpDTO(
            Long id,
            String name,
            String description,
            BigDecimal lat,
            BigDecimal lon,
            LocationDTO location,
            List<FdpContactDto> contacts){
        this.id = id;
        this.name = name;
        this.description = description;
        this.latitude = lat;
        this.longitude = lon;
        this.location = location;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public List<FdpContactDto> getContacts() {
        return contacts;
    }

    public void setContacts(List<FdpContactDto> contacts) {
        this.contacts = contacts;
    }
}
