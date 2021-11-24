package com.example.demo.controller;


import com.example.demo.model.employee.Employee;
import com.example.demo.repository.AccountRepo;
import com.example.demo.repository.EmployeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeRepo repo;
    @Autowired
    AccountRepo accRepo;

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @PostMapping("/addEmployee")
    public String addItemBook(@RequestBody Employee emp) {
        // Book b = bookRepo.getBookByID(item.getBookID());
        // item.setBook(book);
        accRepo.save(emp.getAccount());
        repo.save(emp);
        return "da add item book";
    }
}
