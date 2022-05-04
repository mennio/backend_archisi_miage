package com.example.ecommerce_backend_miage_final.controller;


import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.service.CleUsbService;
import com.example.ecommerce_backend_miage_final.service.CleUsbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cleUsb")
public class CleUsbController {
    @Autowired
    private CleUsbService service;


    public CleUsbController(CleUsbService service) {
        this.service = service;
    }

    @PostMapping("/article")
    public int addArticle(@RequestBody CleUsb a) {
        service.saveArticle(a);
        return 200;
    }

    @GetMapping("/article")
    public List<CleUsb> listArticle() {
        return service.getAllArticle();
    }

    @GetMapping("/article/{id}")
    public CleUsb findArticleByIdArticle(@PathVariable int id) {
        return service.getArticle(id);
    }

    @GetMapping("/article/{article}")
    public CleUsb findByArticle(@PathVariable String article) {
        return service.findByArticle(article);
    } //voir avec guillaume la v2

    @DeleteMapping("/article/{id}")
    public int deleteArticleByIdArticle(@PathVariable int id) {
        service.deleteByIdArticle(id);
        return 200;
    }

    @PutMapping("/article/{id}")
    public void updateArticle(@RequestBody CleUsb article, @PathVariable int id) {
        service.updateArticlev2(id, article);
    }
}
