package com.example.demo.repository;

import com.example.demo.model.cart.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Integer> {
    
}
