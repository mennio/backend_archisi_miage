package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.repository.TelephoneRepository;
import com.example.ecommerce_backend_miage_final.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TelephoneService {
    private TelephoneRepository repository;
    private List<Telephone> articles;

    @Autowired
    public TelephoneService(TelephoneRepository repository) {
        this.repository = repository;
    }

    public Telephone saveArticle(Telephone article){
        return repository.save(article);
    }

    public List<Telephone> getAllArticle(){ return repository.findAll();}

    public Telephone getArticleByIdArticle(int id){
        return repository.findById(id);
    }

    public Telephone findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<Telephone> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    public void deleteByIdArticle(int id){
        repository.deleteTelephoneById(id);
    }

    public Telephone getArticle(int id){
        for (int i=0; i< articles.size();i++ ){
            Telephone t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void updateArticlev2(int id, Telephone article){
        for (int i=0; i< articles.size();i++ ){
            Telephone t = articles.get(i);
            if (t.getId() == id){
                articles.set(i,article);
            }
        }
    }
}