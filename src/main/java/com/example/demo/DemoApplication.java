package com.example.demo;


import java.util.Collections;

import com.example.demo.logicBussiness.bookDAO.BookDAO;
import com.example.demo.model.book.Book;
import com.example.demo.model.book.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Autowired
	// private BookDAO repo;
	// // private ElectronicDAO eRepo;

	// @Override
	// public void run(String... args) throws Exception {
	// // 	// repo.removeBook(7);
	// // 	// Book book = new Book();
	// // 	// book.setLanguage("VN");
	// // 	// repo.addBook(book);


	// 	// Book book1 = new Book();
	// 	// book1.setLanguage("EN");

	// 	// Category category = new Category();
	// 	// category.setBook(book1);
	// 	// category.setType("romantic");
	// 	// book1.setCategories(Collections.singleton(category));
	// 	// repo.addBook(book1);

	// 	// Category category1 = new Category();
	// 	// category1.setBook(book1);
	// 	// category1.setType("fiction");

	// // // 	// book.setCategories(Collections.singleton(category));
	// // // 	// repo.save(book);
	// // // 	// book.setCategories(Collections.singleton(category1));
	// // // 	// repo.save(book);

	// 	// book1.setCategories(Collections.singleton(category1));
	// 	// repo.addBook(book1);
	// 	repo.removeBook(12);

	// // 	// Book b1 = new Book();
	// // 	// b1.setTitle("test1");
	// // 	// Book b2 = new Book();
	// // 	// b2.setTitle("test2");

	// // 	// Publisher p1 = new Publisher();
	// // 	// p1.setPublisherName("KD");
	// // 	// Publisher p2 = new Publisher();
	// // 	// p2.setPublisherName("NXB");

	// // 	// ArrayList<Publisher> cons = new ArrayList<Publisher>();
	// // 	// cons.add(p1);
	// // 	// cons.add(p2);

	// // 	// b1.setPublishers(cons);
	// // 	// repo.save(b1);
	// // 	// b2.setPublishers(cons);
		
		
	// // 	// repo.saveAndFlush(b2);
	// }

}
