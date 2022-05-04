package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.Utilisateurs;
import com.example.ecommerce_backend_miage_final.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateurs addUsers(Utilisateurs utilisateurs){
        return utilisateurRepository.save(utilisateurs);
    }

    public List<Utilisateurs> findAllUsers(){
        return utilisateurRepository.findAll();
    }

    public Utilisateurs updateUsers(Utilisateurs utilisateurs){
        return utilisateurRepository.save(utilisateurs);
    }

    public Utilisateurs findUsersById(Long id){
        return utilisateurRepository.findUsersById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public Utilisateurs findUsersByEmail(String email){
        return utilisateurRepository.findUsersByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deleteUsers(Long id){
        utilisateurRepository.deleteUsersById(id);
    }

}
