package com.example.demo.controller;



import com.example.demo.logicBussiness.customerDAO.CustomerDAO;
import com.example.demo.model.customer.Customer;
import com.example.demo.repository.AccountRepo;
import com.example.demo.repository.AddressRepo;
import com.example.demo.repository.FullnameRepo;

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
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerDAO repo;
    @Autowired
    private AccountRepo accRepo;
    @Autowired
    private AddressRepo addRepo;
    @Autowired
    private FullnameRepo fulNRepo;

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        return repo.getAllCustomers();
    }

    @GetMapping("/getCustomer/{id}")
    public Optional<Customer> getCus(@PathVariable(value = "id") Integer id) {
        return repo.getCusByID(id);
    }

    @PostMapping("/addCustomer")
    public String addCus(@RequestBody Customer cus) {
        accRepo.save(cus.getAccount());
        addRepo.save(cus.getAddress());
        fulNRepo.save(cus.getFullname());
        repo.addCustomer(cus);
        return "da add customer";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") Integer id, @RequestBody Customer cus) {
        Optional<Customer> cus1 = repo.getCusByID(id);
        cus.setId(cus1.get().getId());
        accRepo.save(cus.getAccount());
        addRepo.save(cus.getAddress());
        fulNRepo.save(cus.getFullname());
        repo.updateCustomer(cus);
        return "da update customer";
    }

    @DeleteMapping("/{id}")
    public void deleteCus(@PathVariable(value = "id") Integer id) {
        repo.removeCustomer(id);
    }
}
