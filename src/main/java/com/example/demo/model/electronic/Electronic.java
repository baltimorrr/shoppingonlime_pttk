package com.example.demo.model.electronic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "electronic")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Electronic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "productionDate")
    private String productionDate;

    @Column(name = "producer")
    private String producer;

    @Column(name = "color")
    private String color;


    public Electronic() {
    }


    public Electronic(String name, String type, String productionDate, String producer, String color) {
        this.name = name;
        this.type = type;
        this.productionDate = productionDate;
        this.producer = producer;
        this.color = color;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductionDate() {
        return this.productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
