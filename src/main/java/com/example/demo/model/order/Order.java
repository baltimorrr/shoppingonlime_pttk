package com.example.demo.model.order;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "tax")
    private double tax;

    @Column(name = "content")
    private String content;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;


    public Order() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Shipment getShipment() {
        return this.shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
