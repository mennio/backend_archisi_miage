package com.example.ecommerce_backend_miage_final.model;

import javax.persistence.*;

@Entity
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private int id;
    private String article;
    private String caracteristique;
    private String prix;
    private String image;

    public Smartphone() {
    }

    public Smartphone(String article, String caracteristique, String image,  String prix) {
        this.article = article;
        this.caracteristique = caracteristique;
        this.image = image;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
