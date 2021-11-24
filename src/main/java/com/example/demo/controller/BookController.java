package com.example.demo.controller;

import com.example.demo.logicBussiness.bookDAO.BookDAO;
import com.example.demo.model.book.Book;
import com.example.demo.model.book.Category;
import com.example.demo.repository.CategoryRepo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookDAO repo;

    @Autowired
    private CategoryRepo caRepo;

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return repo.getAllBook();
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        for (Category category : book.getCategories()) {
            book.addCategoryItem(category);
        }
        repo.addBook(book);
        return "da add";
    }

    @PutMapping("/category/{id}")
    public Category addID(@PathVariable(name = "id") Integer id, @RequestBody Category ca) {
        return caRepo.saveAndFlush(ca);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable(value = "id") Integer id) {
        repo.removeBook(id);
    }
}
