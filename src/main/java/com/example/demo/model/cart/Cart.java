package com.example.demo.model.cart;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int id;

    @Column(name = "discount")
    private double discount;

    @Column(name = "totalWeight")
    private double totalWeight;


    public Cart() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

}
