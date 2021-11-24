package com.example.demo.logicBussiness.bookDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.book.Book;

public interface BookDAO {
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public void removeBook(int id);
    public Optional<Book>  getBookByID(int id);
    public List<Book> getAllBook();
    public void deleteAll();
}
