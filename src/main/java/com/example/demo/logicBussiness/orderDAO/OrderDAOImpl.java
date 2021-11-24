package com.example.demo.logicBussiness.orderDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.order.Order;
import com.example.demo.repository.OrderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    OrderRepo repo;

    @Override
    public Order addOrder(Order order) {
        return repo.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return repo.save(order);
    }

    @Override
    public void removeOrder(int id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Order>  getOrderByID(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}
