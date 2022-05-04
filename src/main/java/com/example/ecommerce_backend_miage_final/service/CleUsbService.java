package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.repository.CleUsbRepository;
import com.example.ecommerce_backend_miage_final.repository.CleUsbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CleUsbService {
    private CleUsbRepository repository;
    private List<CleUsb> articles;

    @Autowired
    public CleUsbService(CleUsbRepository repository) {
        this.repository = repository;
    }

    public CleUsb saveArticle(CleUsb article){
        return repository.save(article);
    }

    public List<CleUsb> getAllArticle(){ return repository.findAll();}

    public CleUsb getArticleByIdArticle(int id){
        return repository.findById(id);
    }

    public CleUsb findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<CleUsb> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    public void deleteByIdArticle(int id){
        repository.deleteCleUsbById(id);
    }

    public CleUsb getArticle(int id){
        for (int i=0; i< articles.size();i++ ){
            CleUsb t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void updateArticlev2(int id, CleUsb article){
        for (int i=0; i< articles.size();i++ ){
            CleUsb t = articles.get(i);
            if (t.getId() == id){
                articles.set(i,article);
            }
        }
    }

}
