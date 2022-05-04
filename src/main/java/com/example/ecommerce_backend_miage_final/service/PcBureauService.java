package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.PcBureau;
import com.example.ecommerce_backend_miage_final.repository.PcBureauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcBureauService {
    private PcBureauRepository pcBureauRepo;

    @Autowired
    public PcBureauService(PcBureauRepository pcBureauRepo) {
        this.pcBureauRepo = pcBureauRepo;
    }

    public PcBureau addPcBureau(PcBureau pcBureau) {
        return pcBureauRepo.save(pcBureau);
    }

    public List<PcBureau> findAllPcBureau(){
        return pcBureauRepo.findAll();
    }

    public PcBureau updatePcBureau(PcBureau pcBureau){
        return pcBureauRepo.save(pcBureau);
    }

    public PcBureau findPcBureauById(Long id){
        return pcBureauRepo.findPcBureauById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deletePcBureau(Long id){
        pcBureauRepo.deletePcBureauById(id);
    }
}
