package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import com.example.ecommerce_backend_miage_final.repository.PcPortableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PcPortableService {
    private PcPortableRepository repository;
    private List<PcPortable> articles;

    @Autowired
    public PcPortableService(PcPortableRepository repository) {
        this.repository = repository;
    }

    public void saveArticle(PcPortable article){
         repository.save(article);
    }

    public List<PcPortable> getAllArticle(){ return repository.findAll();}

    public Optional<PcPortable> findById(Long id){
        return repository.findById(id);
    }

    public PcPortable findByArticle(String libelle){
        return repository.findByArticle(libelle);
    }

    public List<PcPortable> getArticleByLibellev2(String libelle){
        return articles.stream().filter(t -> t.getArticle().equals(libelle)).collect(Collectors.toList());
    }

    /*public void deleteByIdArticle(Long id){
        repository.deletePcPortableById(id);
    }*/

    public PcPortable getArticle(Long id){
        for (int i=0; i< articles.size();i++ ){
            PcPortable t = articles.get(i);
            if (t.getId() == id){
                return articles.get(i);
            }
        }
        return null;
    }

    public void deleteArticleById(Long id) {
        PcPortable existArticle = repository.findById(id).orElse(null);
        if(existArticle != null){
            repository.deleteById(existArticle.getId());
        }
    }

    public void updatePcPortable(PcPortable pc,Long id) {
        PcPortable existArticle = repository.findById(id).orElse(null);
        if(existArticle != null){
            existArticle.setPrix(pc.getPrix());
            existArticle.setArticle(pc.getArticle());
            existArticle.setImage(pc.getImage());
            existArticle.setCaracteristique(pc.getCaracteristique());
            repository.save(existArticle);
        }
    }
}
