package org.cats.giftcertificate.controller;

import org.cats.giftcertificate.domain.Donor;
import org.cats.giftcertificate.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "api/donor")
public class DonorController {

    @Autowired
    DonorService donorService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> listDonors(){
        return new ResponseEntity<>(donorService.getDonors(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Donor> getDonor(@PathVariable("id") Long id){
        return new ResponseEntity<>(donorService.getDonor(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> add(@RequestBody Donor donor){
        donorService.save(new Donor(
                donor.getName(),
                donor.getShortName(),
                donor.getCode(),
                donor.getSourceDonor(),
                donor.getResponsibleDonor()
                )
        );

        return new ResponseEntity<>(null,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Donor> update(@PathVariable("id") Long id, @RequestBody Donor donor){
        Donor d = donorService.getDonor(id);

        if(d == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        d.setName(donor.getName());
        d.setCode(donor.getCode());
        d.setShortName(donor.getShortName());
        d.setSourceDonor(donor.getSourceDonor());
        d.setResponsibleDonor(donor.getResponsibleDonor());
        d.setStatus(donor.getStatus());

        donorService.save(d);
        return new ResponseEntity<>(d, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Donor> deleteDonor(@PathVariable("id") Long id){
        Donor d = donorService.getDonor(id);

        if(d == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        donorService.remove(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(path = "/{id}/activate", method = RequestMethod.POST)
    public ResponseEntity<String> activateDonor(@PathVariable("id") Long id){
        donorService.activateDonor(id);
        return new ResponseEntity<>("Donor " + id + " activated", HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}/deactivate", method = RequestMethod.POST)
    public ResponseEntity<String> deactivateDonor(@PathVariable("id")Long id){
        donorService.deactivateDonor(id);
        return new ResponseEntity<>("Donor " + id + "deactivated", HttpStatus.OK);
    }

    @RequestMapping(
            value = "/status/active", method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> getActiveDonors(){
        return new ResponseEntity<>(donorService.getDonorsByStatus(Donor.DONOR_ACTIVE), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/status/inactive", method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> getInactiveDonors(){
        return new ResponseEntity<>(donorService.getDonorsByStatus(Donor.DONOR_INACTIVE), HttpStatus.OK);
    }

}
