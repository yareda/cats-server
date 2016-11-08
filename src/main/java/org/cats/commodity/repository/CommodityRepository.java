package org.cats.commodity.repository;

import org.cats.commodity.domain.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommodityRepository extends JpaRepository<Commodity, Long> { }
