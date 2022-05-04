package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import com.example.ecommerce_backend_miage_final.service.PcPortableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pcPortable")
public class PcPortableController {

    private final PcPortableService pcPortableService;

    public PcPortableController(PcPortableService pcPortableService) {
        this.pcPortableService = pcPortableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PcPortable>> getAllPcPortable(){
        List<PcPortable> pcPortables = pcPortableService.findAllPcPortable();
        return new ResponseEntity<>(pcPortables, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PcPortable> getPcPortableById(@PathVariable("id") Long id){
        PcPortable pcPortables = pcPortableService.findPcPortableById(id);
        return new ResponseEntity<>(pcPortables, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PcPortable> addPcPortable(@RequestBody PcPortable pcPortable){
        PcPortable newPcPortables = pcPortableService.addPcPortable(pcPortable);
        return new ResponseEntity<>(newPcPortables, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PcPortable> updatePcPortable(@RequestBody PcPortable pcPortable){
        PcPortable updatePcPortables = pcPortableService.updatePcPortable(pcPortable);
        return new ResponseEntity<>(updatePcPortables, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PcPortable> deletePcPortable(@PathVariable("id") Long id){
        pcPortableService.deletePcPortable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
