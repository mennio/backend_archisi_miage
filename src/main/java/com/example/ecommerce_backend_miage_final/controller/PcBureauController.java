package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.PcBureau;
import com.example.ecommerce_backend_miage_final.service.PcBureauService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pcBureau")
public class PcBureauController {
    private final PcBureauService pcBureauService;

    public PcBureauController(PcBureauService pcBureauService) {
        this.pcBureauService = pcBureauService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PcBureau>> getAllPcBureau(){
        List<PcBureau> pcBureau = pcBureauService.findAllPcBureau();
        return new ResponseEntity<>(pcBureau, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PcBureau> getPcBureauById(@PathVariable("id") Long id){
        PcBureau pcBureau = pcBureauService.findPcBureauById(id);
        return new ResponseEntity<>(pcBureau, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PcBureau> addPcBureau(@RequestBody PcBureau pcBureau){
        PcBureau newPcBureau = pcBureauService.addPcBureau(pcBureau);
        return new ResponseEntity<>(newPcBureau, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PcBureau> updatePcBureau(@RequestBody PcBureau pcBureau){
        PcBureau updatePcBureau = pcBureauService.updatePcBureau(pcBureau);
        return new ResponseEntity<>(updatePcBureau, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PcBureau> deletePcBureau(@PathVariable("id") Long id){
        pcBureauService.deletePcBureau(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
