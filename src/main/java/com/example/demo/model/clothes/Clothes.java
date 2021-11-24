package com.example.demo.model.clothes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.GenerationType;


@Entity
@Table(name = "clothes")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

    @Column(name = "department")
    private String department;

    @Column(name = "size")
    private String size;

    @Column(name = "weight")
    private float weight;

    @Column(name = "countryOrigin")
    private String countryOrigin;


    public Clothes() {
    }


    public Clothes(String brand, String color, String material, String department, String size, float weight, String countryOrigin) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.department = department;
        this.size = size;
        this.weight = weight;
        this.countryOrigin = countryOrigin;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCountryOrigin() {
        return this.countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }


}
