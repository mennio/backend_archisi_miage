package com.example.ecommerce_backend_miage_final.service;

import com.example.ecommerce_backend_miage_final.exception.UserNotFoundException;
import com.example.ecommerce_backend_miage_final.model.CleUsb;
import com.example.ecommerce_backend_miage_final.repository.CleUsbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CleUsbService {
    private final CleUsbRepository cleUSBRepository;

    @Autowired
    public CleUsbService(CleUsbRepository cleUSBRepository) {
        this.cleUSBRepository = cleUSBRepository;
    }

    public CleUsb addCleUSB(CleUsb users){
        return cleUSBRepository.save(users);
    }

    public List<CleUsb> findAllCleUSB(){
        return cleUSBRepository.findAll();
    }

    public CleUsb updateCleUSB(CleUsb users){
        return cleUSBRepository.save(users);
    }

    public CleUsb findCleUSBById(Long id){
        return cleUSBRepository.findCleUSBById(id)
                .orElseThrow(() -> new UserNotFoundException("Cle USB by id " + id + "was not found"));
    }

    public void deleteCleUSB(Long id){
        cleUSBRepository.deleteCleUSBById(id);
    }

}
