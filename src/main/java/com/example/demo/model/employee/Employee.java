package com.example.demo.model.employee;

import javax.persistence.*;

import com.example.demo.model.customer.Account;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "tel")
    private String tel;

    @Column(name = "dob")
    private String dob;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // public void addAccount(Account acc) {
    //     account.add(acc);
    //     acc.setEmployee(this);
    // }

    public Employee() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
