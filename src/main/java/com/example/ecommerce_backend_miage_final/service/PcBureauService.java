package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.PcBureau;
import com.example.ecommerce_backend_miage_final.model.PcBureau;
import com.example.ecommerce_backend_miage_final.repository.PcBureauRepository;
import com.example.ecommerce_backend_miage_final.repository.PcBureauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcBureauService {
    private PcBureauRepository repository;
    private List<PcBureau> articles;

    @Autowired
    public PcBureauService(PcBureauRepository repository) {
        this.repository = repository;
    }

    public PcBureau saveArticle(PcBureau article){
        return repository.save(article);
    }

    public List<PcBureau> getAllArticle(){ return repository.findAll();}

    public PcBureau getArticleByIdArticle(int id){
        return repository.findById(id);
    }

    public PcBureau findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<PcBureau> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    public void deleteByIdArticle(int id){
        repository.deletePcBureauById(id);
    }

    public PcBureau getArticle(int id){
        for (int i=0; i< articles.size();i++ ){
            PcBureau t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void updateArticlev2(int id, PcBureau article){
        for (int i=0; i< articles.size();i++ ){
            PcBureau t = articles.get(i);
            if (t.getId() == id){
                articles.set(i,article);
            }
        }
    }
}
