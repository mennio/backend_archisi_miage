package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisqueDurRepository extends JpaRepository<DisqueDur,Integer> {
    void deleteDisqueDurById(int id);
    DisqueDur findByArticle(String article);
    DisqueDur findById(int id);
}
