package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.Smartphone;
import com.example.ecommerce_backend_miage_final.service.SmartphoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/smartphone")
public class SmartphoneController {
    private final SmartphoneService smartphoneService;

    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Smartphone>> getAllSmartphones() {
        List<Smartphone> smartphones = smartphoneService.getAllSmartphones();
        return new ResponseEntity<>(smartphones, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Smartphone> getSmartphoneById(@PathVariable("id") Long id){
        Smartphone smartphones = smartphoneService.findSmartphoneById(id);
        return new ResponseEntity<>(smartphones, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Smartphone> addSmartphone(@RequestBody Smartphone smartphones){
        Smartphone newSmartphone = smartphoneService.addSmartphone(smartphones);
        return new ResponseEntity<>(newSmartphone, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Smartphone> updateSmartphone(@RequestBody Smartphone smartphone){
        Smartphone updateSmartphone = smartphoneService.updateSmartphone(smartphone);
        return new ResponseEntity<>(updateSmartphone, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable("id") Long id){
        smartphoneService.deleteSmartphone(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
