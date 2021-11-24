package com.example.demo.logicBussiness.customerDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    CustomerRepo repo;

    @Override   
    public Customer addCustomer(Customer cus) {
        return repo.save(cus);
    }
    @Override
    public Customer updateCustomer(Customer cus) {
        return repo.save(cus);
    }
    @Override
    public void removeCustomer(int id) {
        repo.deleteById(id);
    }
    @Override
    public Optional<Customer>  getCusByID(int id) {
        return repo.findById(id);
    }
    @Override
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }
    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}
