package com.example.demo.logicBussiness.itemBookDAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.book.Book;
import com.example.demo.model.itemBook.ItemBook;

public interface ItemBookDAO {
    public ItemBook addItemBook(ItemBook item);
    public ItemBook updateItemBook(ItemBook item);
    public void removeItemBook(int id);
    public Optional<ItemBook>  getItemBookByID(int id);
    public List<ItemBook> getAllItemBook();
    public void deleteAll();
    // public Book getBook(int id);
}
