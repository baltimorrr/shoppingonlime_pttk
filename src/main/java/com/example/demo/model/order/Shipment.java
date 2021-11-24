package com.example.demo.model.order;

import javax.persistence.*;

@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipment_id")
    private int id;

    @Column(name = "shipment_method")
    private String shipmentMethod;

    @Column(name = "cost")
    private double cost;


    public Shipment() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipmentMethod() {
        return this.shipmentMethod;
    }

    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
