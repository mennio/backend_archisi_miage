package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.repository.DisqueDurRepository;
import com.example.ecommerce_backend_miage_final.repository.DisqueDurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisqueDurService {
    private DisqueDurRepository repository;
    private List<DisqueDur> articles;

    @Autowired
    public DisqueDurService(DisqueDurRepository repository) {
        this.repository = repository;
    }

    public DisqueDur saveArticle(DisqueDur article){
        return repository.save(article);
    }

    public List<DisqueDur> getAllArticle(){ return repository.findAll();}

    public DisqueDur getArticleByIdArticle(int id){
        return repository.findById(id);
    }

    public DisqueDur findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<DisqueDur> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    public void deleteByIdArticle(int id){
        repository.deleteDisqueDurById(id);
    }

    public DisqueDur getArticle(int id){
        for (int i=0; i< articles.size();i++ ){
            DisqueDur t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void updateArticlev2(int id, DisqueDur article){
        for (int i=0; i< articles.size();i++ ){
            DisqueDur t = articles.get(i);
            if (t.getId() == id){
                articles.set(i,article);
            }
        }
    }

}
