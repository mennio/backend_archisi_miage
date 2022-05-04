package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.model.Smartphone;
import com.example.ecommerce_backend_miage_final.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneService {
    private final SmartphoneRepository smartphoneRepository;

    @Autowired
    public SmartphoneService(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    public Smartphone addSmartphone(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    public List<Smartphone> getAllSmartphones() {
        return smartphoneRepository.findAll();
    }

    public Smartphone updateSmartphone(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    public Smartphone findSmartphoneById(Long id) {
        return smartphoneRepository.findSmartphoneById(id)
                .orElseThrow(() -> new RuntimeException("Smartphone not found"));
    }

    public void deleteSmartphone(Long id) {
        smartphoneRepository.deleteSmartphoneById(id);
    }
}
