// package com.example.demo.model.electronic;

// import javax.persistence.Entity;
// import javax.persistence.Table;
// import javax.persistence.Column;

// @Entity
// @Table(name = "mobilephone")
// public class MobilePhone extends Electronic {
//     @Column(name = "cpu")
//     private String cpu;

//     @Column(name = "ram")
//     private String ram;

//     @Column(name = "rom")
//     private String rom;

//     @Column(name = "camera")
//     private double camera;

//     @Column(name = "battery")
//     private String battery;


//     public MobilePhone() {
//     }


//     public MobilePhone(String name, String type, String productionDate, String producer, String color,
//         String cpu, String ram, String rom, double camera, String battery) {

//         super(name, type, productionDate, producer, color);
//         this.cpu = cpu;
//         this.ram = ram;
//         this.rom = rom;
//         this.camera = camera;
//         this.battery = battery;
//     }



//     public String getCpu() {
//         return this.cpu;
//     }

//     public void setCpu(String cpu) {
//         this.cpu = cpu;
//     }

//     public String getRam() {
//         return this.ram;
//     }

//     public void setRam(String ram) {
//         this.ram = ram;
//     }

//     public String getRom() {
//         return this.rom;
//     }

//     public void setRom(String rom) {
//         this.rom = rom;
//     }

//     public double getCamera() {
//         return this.camera;
//     }

//     public void setCamera(double camera) {
//         this.camera = camera;
//     }

//     public String getBattery() {
//         return this.battery;
//     }

//     public void setBattery(String battery) {
//         this.battery = battery;
//     }

// }
