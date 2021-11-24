package com.example.demo.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "fullname")
public class Fullname {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fullname_id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
	private String lastname;


    public Fullname() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
