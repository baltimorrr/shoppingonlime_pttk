package com.example.demo.repository;

import com.example.demo.model.order.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    
}
