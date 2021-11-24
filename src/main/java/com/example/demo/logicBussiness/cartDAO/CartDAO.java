package com.example.demo.logicBussiness.cartDAO;

import com.example.demo.model.cart.Cart;

import java.util.List;
import java.util.Optional;

public interface CartDAO {
    public Cart addCart(Cart cart);
    public Cart updateCart(Cart cart);
    public void removeCart(int id);
    public Optional<Cart>  getCartByID(int id);
    public List<Cart> getAllCarts();
    public void deleteAll();
    public void getItemBook(int id);
}
