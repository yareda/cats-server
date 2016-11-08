package org.cats.giftcertificate.service;

import org.cats.giftcertificate.domain.BudgetType;
import org.cats.giftcertificate.domain.Donor;
import org.cats.giftcertificate.domain.FundSource;
import org.cats.giftcertificate.domain.GiftCertificate;
import org.cats.giftcertificate.repository.BudgetTypeRepository;
import org.cats.giftcertificate.repository.DonorRepository;
import org.cats.giftcertificate.repository.FundSourceRepository;
import org.cats.giftcertificate.repository.GiftCertificateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.List;

@Service
public class GiftCertificateService {

    private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private GiftCertificateRepository giftCertificateRepository;

    @Autowired
    private FundSourceRepository fundSourceRepository;

    @Autowired
    private BudgetTypeRepository budgetTypeRepository;

    /**
     * GiftCertificate service methods
     * */

    public List<GiftCertificate> getGiftCertificatesByStatus(String status){
        return giftCertificateRepository.findByStatus(status);
    }

    public GiftCertificate getGiftCertificate(Long id){
        return giftCertificateRepository.findOne(id);
    }

    public List<GiftCertificate> getGiftCertificates(){
        return giftCertificateRepository.findAll();
    }

    public GiftCertificate save(GiftCertificate giftCertificate){
        return giftCertificateRepository.save(giftCertificate);
    }


    public GiftCertificate create(GiftCertificate resource) {
        // THIS IS A PLACEHOLDER - IMPLEMENT CREATE METHOD!!!!
        return null;
    }

    public Long approve(Long id) {
        return id;
    }


    /**
     * FundSource service methods
     */
    public List<FundSource> getFundSources(){return fundSourceRepository.findAll();}


    /**
     * BudgetType service methods
     */

    public List<BudgetType> getBudgetTypes(){return budgetTypeRepository.findAll();}

}
