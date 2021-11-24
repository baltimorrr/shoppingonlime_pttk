package com.example.demo.repository;

import com.example.demo.model.customer.Fullname;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FullnameRepo extends JpaRepository<Fullname, Integer> {
    
}
