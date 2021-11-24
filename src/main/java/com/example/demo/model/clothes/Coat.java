// package com.example.demo.model.clothes;


// import javax.persistence.*;

// @Entity
// @Table(name = "coat")
// public class Coat extends Clothes {
//     @Column(name = "waterResistant")
//     private int waterResistant;

//     @Column(name = "pocketNumber")
//     private int pocketNumber;

//     @Column(name = "moistureWicking")
//     private int moistureWicking;


//     public Coat() {
//     }


//     public Coat(String brand, String color, String material, String department, String size, float weight,
//     String countryOrigin, int waterResistant, int pocketNumber, int moistureWicking) {
//         super(brand, color, material, department, size, weight, countryOrigin);
//         this.waterResistant = waterResistant;
//         this.pocketNumber = pocketNumber;
//         this.moistureWicking = moistureWicking;
//     }

//     public int getWaterResistant() {
//         return this.waterResistant;
//     }

//     public void setWaterResistant(int waterResistant) {
//         this.waterResistant = waterResistant;
//     }

//     public int getPocketNumber() {
//         return this.pocketNumber;
//     }

//     public void setPocketNumber(int pocketNumber) {
//         this.pocketNumber = pocketNumber;
//     }

//     public int getMoistureWicking() {
//         return this.moistureWicking;
//     }

//     public void setMoistureWicking(int moistureWicking) {
//         this.moistureWicking = moistureWicking;
//     }

// }
