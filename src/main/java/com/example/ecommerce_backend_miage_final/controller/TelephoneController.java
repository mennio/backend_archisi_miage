package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.service.TelephoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/telephoneFixe")
public class TelephoneController {
    private final TelephoneService telephoneService;

    public TelephoneController(TelephoneService telephoneService) {
        this.telephoneService = telephoneService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Telephone>> getAllTelephoneFixes() {
        List<Telephone> telephoneFixes = telephoneService.getAllTelephoneFixe();
        return new ResponseEntity<>(telephoneFixes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Telephone> getTelephoneFixeById(@PathVariable("id") Long id){
        Telephone telephoneFixes = telephoneService.findTelephoneFixeById(id);
        return new ResponseEntity<>(telephoneFixes, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Telephone> addTelephoneFixe(@RequestBody Telephone telephoneFixes){
        Telephone newTelephone = telephoneService.addTelephoneFixe(telephoneFixes);
        return new ResponseEntity<>(newTelephone, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Telephone> updateTelephoneFixe(@RequestBody Telephone Telephone){
        Telephone updateTelephone = telephoneService.updateTelephoneFixe(Telephone);
        return new ResponseEntity<>(updateTelephone, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Telephone> deleteTelephoneFixe(@PathVariable("id") Long id){
        telephoneService.deleteTelephoneFixe(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
