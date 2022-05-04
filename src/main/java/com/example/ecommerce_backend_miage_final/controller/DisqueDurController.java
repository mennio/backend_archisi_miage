package com.example.ecommerce_backend_miage_final.controller;


import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.service.DisqueDurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/disquesDur")
public class DisqueDurController {
    private final DisqueDurService disqueDurService;

    public DisqueDurController(DisqueDurService disqueDurService) {
        this.disqueDurService = disqueDurService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<DisqueDur>> getAllDisquesDur(){
        List<DisqueDur> disqueDur = disqueDurService.findAllDisquesDur();
        return new ResponseEntity<>(disqueDur, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<DisqueDur> getDisquesDurById(@PathVariable("id") Long id){
        DisqueDur disqueDur = disqueDurService.findDisquesDurById(id);
        return new ResponseEntity<>(disqueDur, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<DisqueDur> addDisquesDur(@RequestBody DisqueDur DisqueDur){
        DisqueDur newDisqueDur = disqueDurService.addDisquesDur(DisqueDur);
        return new ResponseEntity<>(newDisqueDur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<DisqueDur> updateDisquesDur(@RequestBody DisqueDur DisqueDur){
        DisqueDur updateDisqueDur = disqueDurService.updateDisquesDur(DisqueDur);
        return new ResponseEntity<>(updateDisqueDur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DisqueDur> deleteDisquesDur(@PathVariable("id") Long id){
        disqueDurService.deleteDisquesDur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
