package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisqueDurRepository extends JpaRepository<DisqueDur,Long> {
    void deleteDisquesDurById(Long id);

    Optional<DisqueDur> findDisquesDurById(Long id);
}
