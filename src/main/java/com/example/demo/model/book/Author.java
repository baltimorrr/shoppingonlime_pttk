// package com.example.demo.model.book;

// import java.util.Collection;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToMany;
// import javax.persistence.Table;

// @Entity
// @Table(name = "author")
// public class Author {
//     @Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @Column(name = "authorName")
//     private String authorName;

//     @Column(name = "biography")
//     private String biography;

//     @ManyToMany(mappedBy = "authors")
//     private Collection<Book> books;


//     public Author() {
//     }


//     public int getId() {
//         return this.id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getAuthorName() {
//         return this.authorName;
//     }

//     public void setAuthorName(String authorName) {
//         this.authorName = authorName;
//     }

//     public String getBiography() {
//         return this.biography;
//     }

//     public void setBiography(String biography) {
//         this.biography = biography;
//     }

//     public Collection<Book> getBooks() {
//         return this.books;
//     }

//     public void setBooks(Collection<Book> books) {
//         this.books = books;
//     }

// }
