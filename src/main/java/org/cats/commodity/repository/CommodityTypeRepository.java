package org.cats.commodity.repository;

import ch.qos.logback.classic.util.LoggerNameUtil;
import org.cats.commodity.domain.CommodityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommodityTypeRepository extends JpaRepository<CommodityType, Long> {}
