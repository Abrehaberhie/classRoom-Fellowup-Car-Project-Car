package com.example.carShowProject.repositories;

import com.example.carShowProject.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    public Optional<Member> findByEmail(String Email);
}
