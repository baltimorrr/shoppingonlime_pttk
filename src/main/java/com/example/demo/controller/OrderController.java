package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.logicBussiness.orderDAO.OrderDAO;
import com.example.demo.model.order.Order;
import com.example.demo.repository.PaymentRepo;
import com.example.demo.repository.ShipmentRepo;

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
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderDAO repo;
    @Autowired
    private PaymentRepo payRepo;
    @Autowired
    private ShipmentRepo shipRepo;

    @GetMapping("/getAll")
    public List<Order> getAll() {
        return repo.getAllOrders();
    }

    @GetMapping("/getOrder/{id}")
    public Optional<Order> getCus(@PathVariable(value = "id") Integer id) {
        return repo.getOrderByID(id);
    }

    @PostMapping("/addCustomer")
    public String addCus(@RequestBody Order order) {
        shipRepo.save(order.getShipment());
        payRepo.save(order.getPayment());
        repo.addOrder(order);
        return "da add order";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") Integer id, @RequestBody Order order) {
        Optional<Order> order1 = repo.getOrderByID(id);
        order.setId(order1.get().getId());
        shipRepo.save(order.getShipment());
        payRepo.save(order.getPayment());
        repo.updateOrder(order);
        return "da update order";
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable(value = "id") Integer id) {
        repo.removeOrder(id);
    }
}
