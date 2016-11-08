package org.cats.giftcertificate.repository;

import org.cats.giftcertificate.domain.GiftCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftCertificateRepository extends JpaRepository<GiftCertificate,Long> {
    public List<GiftCertificate> findByStatus(String status);
}
