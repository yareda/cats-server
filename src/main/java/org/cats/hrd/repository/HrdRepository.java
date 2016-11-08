package org.cats.hrd.repository;

import org.cats.hrd.domain.Hrd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrdRepository extends JpaRepository<Hrd,Long> {
}
