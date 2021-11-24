package com.example.demo.logicBussiness.orderDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.order.Order;

public interface OrderDAO {
    public Order addOrder(Order order);
    public Order updateOrder(Order order);
    public void removeOrder(int id);
    public Optional<Order>  getOrderByID(int id);
    public List<Order> getAllOrders();
    public void deleteAll();
}
