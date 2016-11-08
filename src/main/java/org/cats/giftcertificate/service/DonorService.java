package org.cats.giftcertificate.service;

import org.cats.giftcertificate.domain.Donor;
import org.cats.giftcertificate.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getDonors(){
        return donorRepository.findAll();
    }

    public List<Donor> getDonorsByStatus(Integer status){
        return donorRepository.findAllByStatus(status);
    }

    public Donor getDonor(Long donorID) {
        return donorRepository.findOne(donorID);
    }

    @Transactional
    public void save(Donor donor){
        donorRepository.save(donor);
    }

    public void remove(Long donorId){
        donorRepository.delete(donorId);
    }

    @Transactional
     public void activateDonor(Long donorId){
        donorRepository.updateStatus(Donor.DONOR_ACTIVE, donorId);
    }

    @Transactional
    public void deactivateDonor(Long donorId){
        donorRepository.updateStatus(Donor.DONOR_INACTIVE, donorId);
    }


}
