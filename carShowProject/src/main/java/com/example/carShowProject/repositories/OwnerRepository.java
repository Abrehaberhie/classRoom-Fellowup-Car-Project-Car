package com.example.carShowProject.repositories;

import com.example.carShowProject.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}