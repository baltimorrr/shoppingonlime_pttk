package com.example.demo.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    public Account() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
