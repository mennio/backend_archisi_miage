package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import com.example.ecommerce_backend_miage_final.service.PcPortableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PcPortableController {

    @Autowired
    private PcPortableService service;


    public PcPortableController(PcPortableService service) {
        this.service = service;
    }

    @PostMapping("/PcPortable")
    public void addArticle(@RequestBody PcPortable a) {
        service.saveArticle(a);
        //return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/PcPortable")
    public List<PcPortable> listArticle() {
        return service.getAllArticle();
    }

    @GetMapping("/PcPortable/{id}")
    public Optional<PcPortable> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    /*@GetMapping("/PcPortable/{article}")
    public PcPortable findByArticle(@PathVariable String article) {
        return service.findByArticle(article);
    } //voir avec guillaume la v2*/

    @DeleteMapping("/PcPortable")
    public void deleteArticle(@RequestBody PcPortable article) {
        service.deleteArticleById(article);
    }

    @PutMapping("/PcPortable")
    public void updatePcPortable(@RequestBody PcPortable article) {
        service.updatePcPortable(article);
    }
}
