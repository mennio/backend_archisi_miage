package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.service.TelephoneService;
import com.example.ecommerce_backend_miage_final.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/telephoneFixe")
public class TelephoneController {
    @Autowired
    private TelephoneService service;


    public TelephoneController(TelephoneService service) {
        this.service = service;
    }

    @PostMapping("/article")
    public int addArticle(@RequestBody Telephone a) {
        service.saveArticle(a);
        return 200;
    }

    @GetMapping("/article")
    public List<Telephone> listArticle() {
        return service.getAllArticle();
    }

    @GetMapping("/article/{id}")
    public Telephone findArticleByIdArticle(@PathVariable int id) {
        return service.getArticle(id);
    }

    @GetMapping("/article/{article}")
    public Telephone findByArticle(@PathVariable String article) {
        return service.findByArticle(article);
    } //voir avec guillaume la v2

    @DeleteMapping("/article/{id}")
    public int deleteArticleByIdArticle(@PathVariable int id) {
        service.deleteByIdArticle(id);
        return 200;
    }

    @PutMapping("/article/{id}")
    public void updateArticle(@RequestBody Telephone article, @PathVariable int id) {
        service.updateArticlev2(id, article);
    }
}
