// package com.example.demo.model.book;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToMany;
// import javax.persistence.Table;

// import java.util.Collection;

// @Entity
// @Table(name = "publisher")
// public class Publisher {
//     @Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @Column(name = "address")
//     private String address;

//     @Column(name = "publisherName")
//     private String publisherName;
    
//     @ManyToMany(mappedBy = "publishers")
//     private Collection<Book> books;


//     public Publisher() {
//     }


//     public int getId() {
//         return this.id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getAddress() {
//         return this.address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

//     public String getPublisherName() {
//         return this.publisherName;
//     }

//     public void setPublisherName(String publisherName) {
//         this.publisherName = publisherName;
//     }

//     public Collection<Book> getBooks() {
//         return this.books;
//     }

//     public void setBooks(Collection<Book> books) {
//         this.books = books;
//     }

// }
