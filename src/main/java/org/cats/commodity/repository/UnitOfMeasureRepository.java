package org.cats.commodity.repository;

import org.cats.commodity.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {
    //List<UnitOfMeasure> findUnitsInCategory(Long categoryId);
}
