package com.example.demo.repository;

import com.example.demo.model.order.Shipment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepo extends JpaRepository<Shipment, Integer> {
    
}
