package com.example.ecommerce_backend_miage_final.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PcPortable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    private String article;
    private String caracteristique;
    private String prix;
    private String image;

    public PcPortable(){}

    public PcPortable(String article, String caracteristique, String image,  String prix) {
        this.article = article;
        this.caracteristique = caracteristique;
        this.image = image;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(String caracteristique) {
        this.caracteristique = caracteristique;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
