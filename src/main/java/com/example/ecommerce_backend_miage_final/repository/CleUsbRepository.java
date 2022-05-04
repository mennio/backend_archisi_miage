package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.model.CleUsb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CleUsbRepository extends JpaRepository<CleUsb,Integer> {
    void deleteCleUsbById(int id);
    CleUsb findByArticle(String article);
    CleUsb findById(int id);
}
