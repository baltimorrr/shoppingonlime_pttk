package com.example.demo.controller;

import com.example.demo.logicBussiness.bookDAO.BookDAO;
import com.example.demo.logicBussiness.itemBookDAO.ItemBookDAO;
import com.example.demo.model.book.Book;
import com.example.demo.model.itemBook.ItemBook;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itembook")
@CrossOrigin
public class ItemBookController {
    @Autowired
    private ItemBookDAO repo;

    @Autowired
    private BookDAO bookRepo;

    @GetMapping("/getAll")
    public List<ItemBook> getAllItemBooks() {
        return repo.getAllItemBook();
    }

    @GetMapping("/getBook/{id}")
    public Optional<Book> getBook(@PathVariable(value = "id") Integer id) {
        return bookRepo.getBookByID(id);
    }

    @PostMapping("/addItemBook")
    public String addItemBook(@RequestBody ItemBook item) {
        // Book b = bookRepo.getBookByID(item.getBookID());
        // item.setBook(book);
        repo.addItemBook(item);
        return "da add item book";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") Integer id, @RequestBody ItemBook item) {
        Optional<ItemBook> item1 = repo.getItemBookByID(id);
        item.setId(item1.get().getId());
        repo.updateItemBook(item);
        return "da update item book " + item.getPrice();
    }

    @DeleteMapping("/{id}")
    public void deleteItemBook(@PathVariable(value = "id") Integer id) {
        repo.removeItemBook(id);
    }
}
