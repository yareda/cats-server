package org.cats.hierarchy.repository;

import org.cats.hierarchy.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location,Long> {
    Location findByCode(String code);
    List<Location> findByLocationType(Long locationTypeId);
}
