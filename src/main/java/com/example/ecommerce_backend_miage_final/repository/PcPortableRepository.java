package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.PcPortable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PcPortableRepository extends JpaRepository<PcPortable,Long> {

    void deletePcPortableById(Long id);
    PcPortable findByArticle(String article);
    Optional<PcPortable> findById(Long id);
}
