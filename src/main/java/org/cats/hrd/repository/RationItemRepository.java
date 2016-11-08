package org.cats.hrd.repository;

import org.cats.hrd.domain.RationItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RationItemRepository extends JpaRepository<RationItem, Long> {}
