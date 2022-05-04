package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import com.example.ecommerce_backend_miage_final.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
    void deleteSmartphoneById(int id);
    Smartphone findByArticle(String article);
    Smartphone findById(int id);
}
