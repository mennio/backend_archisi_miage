package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TelephoneRepository extends JpaRepository<Telephone, Integer> {
    void deleteTelephoneById(int id);
    Telephone findByArticle(String article);
    Telephone findById(int id);
}
