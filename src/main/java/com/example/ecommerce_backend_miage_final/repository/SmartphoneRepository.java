package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
    void deleteSmartphoneById(Long id);

    Optional<Smartphone> findSmartphoneById(Long id);
}
