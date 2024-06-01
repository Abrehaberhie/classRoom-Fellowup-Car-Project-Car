package com.example.carShowProject.controllers;

import com.example.carShowProject.entities.Owner;
import com.example.carShowProject.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/owner")
public class OwnerController {
    @Autowired
    OwnerRepository ownerRepository;


    @GetMapping("/list")
    public ResponseEntity<List<Owner>> getAllOwners(){
        return new ResponseEntity<>((List<Owner>)ownerRepository.findAll(), HttpStatus.OK);
    }
}
