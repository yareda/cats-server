package org.cats.hrd.repository;

import org.cats.hrd.domain.Ration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RationRepository extends JpaRepository<Ration,Long> {}
