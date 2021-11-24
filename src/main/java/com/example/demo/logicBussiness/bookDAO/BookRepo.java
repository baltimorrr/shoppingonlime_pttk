package com.example.demo.logicBussiness.bookDAO;

import com.example.demo.model.book.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    
}

