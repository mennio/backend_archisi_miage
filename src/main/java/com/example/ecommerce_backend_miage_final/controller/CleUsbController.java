package com.example.ecommerce_backend_miage_final.controller;


import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.service.CleUsbService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cleUsb")
public class CleUsbController {
    private final CleUsbService cleUSBService;

    public CleUsbController(CleUsbService cleUSBService) {
        this.cleUSBService = cleUSBService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CleUsb>> getAllCleUSB(){
        List<CleUsb> cleUSB = cleUSBService.findAllCleUSB();
        return new ResponseEntity<>(cleUSB, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CleUsb> getCleUSBById(@PathVariable("id") Long id){
        CleUsb cleUSB = cleUSBService.findCleUSBById(id);
        return new ResponseEntity<>(cleUSB, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CleUsb> addCleUSB(@RequestBody CleUsb cleUSB){
        CleUsb newCleUsb = cleUSBService.addCleUSB(cleUSB);
        return new ResponseEntity<>(newCleUsb, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CleUsb> updateCleUSB(@RequestBody CleUsb cleUSB){
        CleUsb updateCleUsb = cleUSBService.updateCleUSB(cleUSB);
        return new ResponseEntity<>(updateCleUsb, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CleUsb> deleteCleUSB(@PathVariable("id") Long id){
        cleUSBService.deleteCleUSB(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
