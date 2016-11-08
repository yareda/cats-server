package org.cats.giftcertificate.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cats.giftcertificate.domain.Donor;
import org.cats.giftcertificate.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "donor", description = "Manage donor related activities - CRUD, activate, deactivate etc.")
@Controller
@RequestMapping(value = "api/donor")
public class DonorController {

    @Autowired
    DonorService donorService;

    @ApiOperation(value = "List all donors")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> listDonors(){
        return new ResponseEntity<>(donorService.getDonors(), HttpStatus.OK);
    }

    @ApiOperation(value = "Returns a single donor record identified by it's unique id filed")
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Donor> getDonor(@PathVariable("id") Long id){
        return new ResponseEntity<>(donorService.getDonor(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Creates a new donor record")
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

    @ApiOperation(value = "Update an existing donor record")
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

    @ApiOperation(value = "Removes donor record with specified id value")
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Donor> deleteDonor(@PathVariable("id") Long id){
        Donor d = donorService.getDonor(id);

        if(d == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        donorService.remove(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @ApiOperation(value = "Set status of donor record to active")
    @RequestMapping(path = "/{id}/activate", method = RequestMethod.POST)
    public ResponseEntity<String> activateDonor(@PathVariable("id") Long id){
        donorService.activateDonor(id);
        return new ResponseEntity<>("Donor " + id + " activated", HttpStatus.OK);
    }

    @ApiOperation(value = "Set status of donor record to inactive DONOR_INACTIVE")
    @RequestMapping(path = "/{id}/deactivate", method = RequestMethod.POST)
    public ResponseEntity<String> deactivateDonor(@PathVariable("id")Long id){
        donorService.deactivateDonor(id);
        return new ResponseEntity<>("Donor " + id + "deactivated", HttpStatus.OK);
    }

    @ApiOperation(value = "Returns list of donor records which with active status")
    @RequestMapping(
            value = "/status/active", method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> getActiveDonors(){
        return new ResponseEntity<>(donorService.getDonorsByStatus(Donor.DONOR_ACTIVE), HttpStatus.OK);
    }

    @ApiOperation(value = "Returns list of donor records which with inactive status")
    @RequestMapping(
            value = "/status/inactive", method = RequestMethod.GET)
    public ResponseEntity<List<Donor>> getInactiveDonors(){
        return new ResponseEntity<>(donorService.getDonorsByStatus(Donor.DONOR_INACTIVE), HttpStatus.OK);
    }

}
