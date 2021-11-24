package com.example.demo.logicBussiness.itemBookDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.itemBook.ItemBook;
import com.example.demo.repository.ItemBookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemBookDAOImpl implements ItemBookDAO {
    @Autowired ItemBookRepo repo;
    
    @Override
    public ItemBook addItemBook(ItemBook item) {
        return repo.save(item);
    }

    @Override
    public ItemBook updateItemBook(ItemBook item) {
        return repo.save(item);
    }

    @Override
    public void removeItemBook(int id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<ItemBook> getItemBookByID(int id) {
        return repo.findById(id);
    }

    @Override
    public List<ItemBook> getAllItemBook() {
        return repo.findAll();
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

    // @Override
    // public Book getBookID(int id) {

    // }
}
