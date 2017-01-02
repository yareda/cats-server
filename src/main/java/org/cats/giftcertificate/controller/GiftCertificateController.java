package org.cats.giftcertificate.controller;

import org.cats.giftcertificate.domain.GiftCertificate;
import org.cats.giftcertificate.service.GiftCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/gift")
public class GiftCertificateController {

    @Autowired
    GiftCertificateService giftCertificateService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<GiftCertificate>> listGiftCertificates(){
        return new ResponseEntity<>(giftCertificateService.getGiftCertificates(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<GiftCertificate> getGiftCertificate(@PathVariable("id") Long id){
        return new ResponseEntity<>(giftCertificateService.getGiftCertificate(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GiftCertificate> create(@RequestBody GiftCertificate resource){
        return new ResponseEntity<>(giftCertificateService.create(resource), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GiftCertificate> save(@PathVariable("id")Long id, @RequestBody GiftCertificate gift){
        GiftCertificate g = giftCertificateService.getGiftCertificate(id);

        if(g ==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Map incoming values to the one retrieved from database

        giftCertificateService.save(g);

        return new ResponseEntity<>(g, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/approve", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Long approveGiftCertificate(@PathVariable("id") Long id){
        return giftCertificateService.approve(id);
    }


}

