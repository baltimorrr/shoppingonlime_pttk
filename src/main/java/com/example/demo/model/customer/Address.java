package com.example.demo.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int id;

    @Column(name = "noHome")
    private int noHome;

    @Column(name = "city")
	private String city;

    @Column(name = "street")
	private String street;

    @Column(name = "district")
	private String district;

    public Address() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoHome() {
        return this.noHome;
    }

    public void setNoHome(int noHome) {
        this.noHome = noHome;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
