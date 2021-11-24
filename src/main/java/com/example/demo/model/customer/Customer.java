package com.example.demo.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "tel")
	private String tel;

    @Column(name = "dob")
	private String dob;

    @Column(name = "gender")
	private String gender;

    @Column(name = "card_code")
	private String cardCode;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne
    @JoinColumn(name = "fullname_id")
    private Fullname fullname;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;


    public Customer() {
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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Fullname getFullname() {
        return this.fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
