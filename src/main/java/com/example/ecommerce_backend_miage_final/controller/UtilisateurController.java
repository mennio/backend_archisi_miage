package com.example.ecommerce_backend_miage_final.controller;

import com.example.ecommerce_backend_miage_final.model.Utilisateurs;
import com.example.ecommerce_backend_miage_final.service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Utilisateurs>> getAllUsers(){
        List<Utilisateurs> users = utilisateurService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Utilisateurs> getUsersById(@PathVariable("id") Long id){
        Utilisateurs utilisateurs = utilisateurService.findUsersById(id);
        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Utilisateurs> login(@RequestBody Utilisateurs utilisateurs){
        Utilisateurs user = utilisateurService.findUsersByEmail(utilisateurs.getEmail());
        if(user.getPassword().equals(utilisateurs.getPassword())){
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return (ResponseEntity<Utilisateurs>) ResponseEntity.internalServerError();
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Utilisateurs> addUsers(@RequestBody Utilisateurs utilisateurs){
        Utilisateurs newUtilisateurs = utilisateurService.addUsers(utilisateurs);
        return new ResponseEntity<>(newUtilisateurs, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Utilisateurs> updateUsers(@RequestBody Utilisateurs utilisateurs){
        Utilisateurs updateUtilisateurs = utilisateurService.updateUsers(utilisateurs);
        return new ResponseEntity<>(updateUtilisateurs, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Utilisateurs> deleteUsers(@PathVariable("id") Long id){
        utilisateurService.deleteUsers(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
