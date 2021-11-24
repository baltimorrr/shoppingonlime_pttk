package com.example.demo.model.order;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int id;

    @Column(name = "method")
    private String method;


    public Payment() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}
