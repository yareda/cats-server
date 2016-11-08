package org.cats.giftcertificate.repository;

import org.cats.giftcertificate.domain.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonorRepository extends JpaRepository<Donor,Long> {

    List<Donor> findAllByStatus(Integer status);

    @Modifying
    @Query("update Donor d set d.status = ?1 where d.id = ?2")
    int updateStatus(Integer status, Long donorId);
}
