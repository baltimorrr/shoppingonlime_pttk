package com.example.demo.logicBussiness.customerDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.customer.Customer;

public interface CustomerDAO {
    public Customer addCustomer(Customer cus);
    public Customer updateCustomer(Customer cus);
    public void removeCustomer(int id);
    public Optional<Customer>  getCusByID(int id);
    public List<Customer> getAllCustomers();
    public void deleteAll();
}
