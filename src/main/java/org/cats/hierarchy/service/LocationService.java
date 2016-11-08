package org.cats.hierarchy.service;

import org.cats.hierarchy.domain.Location;
import org.cats.hierarchy.dto.LocationDTO;
import org.cats.hierarchy.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location getLocation(Long id){
        return locationRepository.findOne(id);
    }

    public Location getLocation(String code){
        return locationRepository.findByCode(code);
    }

    public List<LocationDTO> getLocationNodes(Long nodeType){
        List<Location> locationNodes = locationRepository.findByLocationType(nodeType);

        List<LocationDTO> nodes = locationNodes.stream().map(LocationDTO::new).collect(Collectors.toList());

        return nodes;
    }
}
