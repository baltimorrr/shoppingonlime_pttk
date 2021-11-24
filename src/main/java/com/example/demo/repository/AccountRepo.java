package com.example.demo.repository;

import com.example.demo.model.customer.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {
    
}
