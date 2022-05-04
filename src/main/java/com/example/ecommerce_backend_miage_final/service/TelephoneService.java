package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.model.Telephone;
import com.example.ecommerce_backend_miage_final.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephoneService {
    private final TelephoneRepository telephoneRepository;

    @Autowired
    public TelephoneService(TelephoneRepository telephoneRepository) {
        this.telephoneRepository = telephoneRepository;
    }

    public Telephone addTelephoneFixe(Telephone telephone) {
        return telephoneRepository.save(telephone);
    }

    public List<Telephone> getAllTelephoneFixe() {
        return telephoneRepository.findAll();
    }

    public Telephone updateTelephoneFixe(Telephone smartphone) {
        return telephoneRepository.save(smartphone);
    }

    public Telephone findTelephoneFixeById(Long id) {
        return telephoneRepository.findTelephoneFixeById(id)
                .orElseThrow(() -> new RuntimeException("Smartphone not found"));
    }

    public void deleteTelephoneFixe(Long id) {
        telephoneRepository.deleteTelephoneFixeById(id);
    }
}