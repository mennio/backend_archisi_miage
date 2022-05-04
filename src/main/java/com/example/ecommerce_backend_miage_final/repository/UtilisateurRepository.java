package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateurs,Long> {
    void deleteUsersById(Long id);

    Optional<Utilisateurs> findUsersById(Long id);

    Optional<Utilisateurs> findUsersByEmail(String email);
}
