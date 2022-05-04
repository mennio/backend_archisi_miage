package com.example.ecommerce_backend_miage_final.repository;

import com.example.ecommerce_backend_miage_final.model.CleUsb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CleUsbRepository extends JpaRepository<CleUsb,Long> {
    void deleteCleUSBById(Long id);

    Optional<CleUsb> findCleUSBById(Long id);
}
