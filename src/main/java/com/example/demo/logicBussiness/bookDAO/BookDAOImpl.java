package com.example.demo.logicBussiness.bookDAO;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.book.Book;
import com.example.demo.model.book.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDAOImpl implements BookDAO {
    @Autowired
    BookRepo repo;

    @Override
    public List<Book> getAllBook() {
        return repo.findAll();
    }

    @Override
    public Book addBook(Book book) {
        return repo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return repo.save(book);
    }

    @Override
    public void removeBook(int id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Book> getBookByID(int id) {
        return repo.findById(id);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}
