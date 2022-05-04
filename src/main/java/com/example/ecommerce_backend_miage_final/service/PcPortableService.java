package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.PcPortable;
import com.example.ecommerce_backend_miage_final.repository.PcPortableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcPortableService {
    private final PcPortableRepository pcPortableRepo;

    @Autowired
    public PcPortableService(PcPortableRepository pcPortableRepo) {
        this.pcPortableRepo = pcPortableRepo;
    }

    public PcPortable addPcPortable(PcPortable pcPortable) {
        return pcPortableRepo.save(pcPortable);
    }

    public List<PcPortable> findAllPcPortable(){
        return pcPortableRepo.findAll();
    }

    public PcPortable updatePcPortable(PcPortable pcPortable){
        return pcPortableRepo.save(pcPortable);
    }

    public PcPortable findPcPortableById(Long id){
        return pcPortableRepo.findPcPortableById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deletePcPortable(Long id){
        pcPortableRepo.deletePcPortableById(id);
    }

}
