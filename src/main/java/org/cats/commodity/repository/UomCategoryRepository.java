package org.cats.commodity.repository;

import org.cats.commodity.domain.UomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UomCategoryRepository extends JpaRepository<UomCategory, Long> {
}
