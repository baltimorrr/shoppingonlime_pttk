package com.example.demo.repository;

import com.example.demo.model.customer.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
    
}
