package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
    void deleteTelephoneFixeById(Long id);

    Optional<Telephone> findTelephoneFixeById(Long id);
}
