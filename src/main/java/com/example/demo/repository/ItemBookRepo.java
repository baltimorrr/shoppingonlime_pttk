package com.example.demo.repository;

import com.example.demo.model.itemBook.ItemBook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemBookRepo extends JpaRepository<ItemBook, Integer> {
    
}
