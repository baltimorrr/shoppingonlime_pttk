package com.example.demo.repository;

import com.example.demo.model.order.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    
}
