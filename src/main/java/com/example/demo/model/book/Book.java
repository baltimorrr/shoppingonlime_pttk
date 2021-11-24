package com.example.demo.model.book;


import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.model.itemBook.ItemBook;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.ManyToMany;
import javax.persistence.FetchType;



@Entity
@Table(name = "book")
public class Book {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "publicationDate")
    private String publicationDate;

    @Column(name = "numberOfPages")
    private String numberOfPages;

    @Column(name = "language")
    private String language;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "book", targetEntity = Category.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Category> categories;

    public void addCategoryItem(Category ca) {
        categories.add(ca);
        ca.setBook(this);
    }

    // @JsonManagedReference
    // @OneToMany(mappedBy = "itemBook", targetEntity = ItemBook.class, cascade = CascadeType.ALL, orphanRemoval = true)
    // private Set<ItemBook> itemBooks;

    // public void addItemBook(ItemBook item) {
    //     itemBooks.add(item);
    //     item.setBook(this);
    // }

    // @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    // @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "bookID"), inverseJoinColumns = @JoinColumn(name = "publisherID") )
    // private Collection<Publisher> publishers;

    // @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    // @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "bookID"), inverseJoinColumns = @JoinColumn(name = "authorID") )
    // private Collection<Author> authors;



    

    // public Set<ItemBook> getItemBooks() {
    //     return itemBooks;
    // }


    // public void setItemBooks(Set<ItemBook> itemBooks) {
    //     this.itemBooks = itemBooks;
    // }


    public Book() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    // public Collection<Publisher> getPublishers() {
    //     return this.publishers;
    // }

    // public void setPublishers(Collection<Publisher> publishers) {
    //     this.publishers = publishers;
    // }

    // public Collection<Author> getAuthors() {
    //     return this.authors;
    // }

    // public void setAuthors(Collection<Author> authors) {
    //     this.authors = authors;
    // }
}
