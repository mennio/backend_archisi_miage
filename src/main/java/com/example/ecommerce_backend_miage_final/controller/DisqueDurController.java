package com.example.ecommerce_backend_miage_final.controller;


import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.service.DisqueDurService;
import com.example.ecommerce_backend_miage_final.service.DisqueDurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/disquesDur")
public class DisqueDurController {
    @Autowired
    private DisqueDurService service;


    public DisqueDurController(DisqueDurService service) {
        this.service = service;
    }

    @PostMapping("/article")
    public int addArticle(@RequestBody DisqueDur a) {
        service.saveArticle(a);
        return 200;
    }

    @GetMapping("/article")
    public List<DisqueDur> listArticle() {
        return service.getAllArticle();
    }

    @GetMapping("/article/{id}")
    public DisqueDur findArticleByIdArticle(@PathVariable int id) {
        return service.getArticle(id);
    }

    @GetMapping("/article/{article}")
    public DisqueDur findByArticle(@PathVariable String article) {
        return service.findByArticle(article);
    } //voir avec guillaume la v2

    @DeleteMapping("/article/{id}")
    public int deleteArticleByIdArticle(@PathVariable int id) {
        service.deleteByIdArticle(id);
        return 200;
    }

    @PutMapping("/article/{id}")
    public void updateArticle(@RequestBody DisqueDur article, @PathVariable int id) {
        service.updateArticlev2(id, article);
    }
}
