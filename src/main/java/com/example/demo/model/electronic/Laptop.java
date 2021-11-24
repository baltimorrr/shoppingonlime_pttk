package com.example.demo.model.electronic;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop extends Electronic {
    @Column(name = "cpu")
    private String cpu;

    @Column(name = "gpu")
    private String gpu;

    @Column(name = "storageSize")
    private int storageSize;

    @Column(name = "storageType")
    private String storageType;

    @Column(name = "screenSize")
    private float screenSize;

    @Column(name = "ramSize")
    private int ramSize;

    @Column(name = "connections")
    private String connections;

    @Column(name = "interfaces")
    private String interfaces;

    @Column(name = "battery")
    private String battery;

    @Column(name = "os")
    private String os;


    public Laptop() {
    }

    public Laptop(String name, String type, String productionDate, String producer, String color,
        String cpu, String gpu, int storageSize, String storageType, float screenSize, int ramSize, String connections, String interfaces, String battery, String os) {
        super(name, type, productionDate, producer, color);
        this.cpu = cpu;
        this.gpu = gpu;
        this.storageSize = storageSize;
        this.storageType = storageType;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.connections = connections;
        this.interfaces = interfaces;
        this.battery = battery;
        this.os = os;
    }

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getStorageSize() {
        return this.storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getConnections() {
        return this.connections;
    }

    public void setConnections(String connections) {
        this.connections = connections;
    }

    public String getInterfaces() {
        return this.interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getBattery() {
        return this.battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
