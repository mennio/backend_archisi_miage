package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.DisqueDur;
import com.example.ecommerce_backend_miage_final.repository.DisqueDurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisqueDurService {
    private final DisqueDurRepository disquesDurRepo;

    @Autowired
    public DisqueDurService(DisqueDurRepository disquesDurRepo) {
        this.disquesDurRepo = disquesDurRepo;
    }

    public DisqueDur addDisquesDur(DisqueDur users){
        return disquesDurRepo.save(users);
    }

    public List<DisqueDur> findAllDisquesDur(){
        return disquesDurRepo.findAll();
    }

    public DisqueDur updateDisquesDur(DisqueDur users){
        return disquesDurRepo.save(users);
    }

    public DisqueDur findDisquesDurById(Long id){
        return disquesDurRepo.findDisquesDurById(id)
                .orElseThrow(() -> new UserNotFoundException("Disque dur by id " + id + "was not found"));
    }

    public void deleteDisquesDur(Long id){
        disquesDurRepo.deleteDisquesDurById(id);
    }

}
