package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.PcBureau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PcBureauRepository extends JpaRepository<PcBureau,Long> {
    void deletePcBureauById(Long id);

    Optional<PcBureau> findPcBureauById(Long id);
}
