package com.example.demo.repository;

import com.example.demo.model.customer.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    
}
