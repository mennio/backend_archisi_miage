package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.model.Smartphone;
import com.example.ecommerce_backend_miage_final.model.Smartphone;
import com.example.ecommerce_backend_miage_final.repository.SmartphoneRepository;
import com.example.ecommerce_backend_miage_final.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SmartphoneService {
    private SmartphoneRepository repository;
    private List<Smartphone> articles;

    @Autowired
    public SmartphoneService(SmartphoneRepository repository) {
        this.repository = repository;
    }

    public Smartphone saveArticle(Smartphone article){
        return repository.save(article);
    }

    public List<Smartphone> getAllArticle(){ return repository.findAll();}

    public Smartphone getArticleByIdArticle(int id){
        return repository.findById(id);
    }

    public Smartphone findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<Smartphone> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    public void deleteByIdArticle(int id){
        repository.deleteSmartphoneById(id);
    }

    public Smartphone getArticle(int id){
        for (int i=0; i< articles.size();i++ ){
            Smartphone t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void updateArticlev2(int id, Smartphone article){
        for (int i=0; i< articles.size();i++ ){
            Smartphone t = articles.get(i);
            if (t.getId() == id){
                articles.set(i,article);
            }
        }
    }
}
