package com.example.demo.model.itemBook;

import javax.persistence.*;



@Entity
@Table(name = "itemBook")
public class ItemBook {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemBook_id")
    private int id;

    @Column(name = "price")
    private double price;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "discount")
    private String discount;

    @Column(name = "book_id")
    private int bookID;

    

    // @JsonBackReference
    // @ManyToOne
    // @JoinColumn(name = "book_id")
    // private Book book;

    public ItemBook() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getBookID() {
        return this.bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    // public Book getBook() {
    //     return book;
    // }

    // public void setBook(Book book) {
    //     this.book = book;
    // }

    
}
