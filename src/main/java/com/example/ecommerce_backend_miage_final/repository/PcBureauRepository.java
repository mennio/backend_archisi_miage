package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.PcBureau;
import com.example.ecommerce_backend_miage_final.model.PcBureau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PcBureauRepository extends JpaRepository<PcBureau,Integer> {
    void deletePcBureauById(int id);
    PcBureau findByArticle(String article);
    PcBureau findById(int id);
}
