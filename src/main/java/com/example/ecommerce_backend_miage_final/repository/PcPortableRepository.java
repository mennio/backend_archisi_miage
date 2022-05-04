package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PcPortableRepository extends JpaRepository<PcPortable,Long> {
    void deletePcPortableById(Long id);

    Optional<PcPortable> findPcPortableById(Long id);
}
