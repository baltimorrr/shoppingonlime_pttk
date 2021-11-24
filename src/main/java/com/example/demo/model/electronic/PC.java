package com.example.demo.model.electronic;

import javax.persistence.*;

@Entity
@Table(name = "pc")
public class PC extends Electronic {
    @Column(name = "cpu")
    private String cpu;

    @Column(name = "gpu")
    private String gpu;

    @Column(name = "storageSize")
    private int storageSize;

    @Column(name = "storageType")
    private String storageType;

    @Column(name = "ramSize")
    private int ramSize;

    @Column(name = "ramType")
    private String ramType;

    @Column(name = "connections")
    private String connections;

    @Column(name = "interfaces")
    private String interfaces;

    @Column(name = "os")
    private String os;


    public PC() {
    }


    public PC(String name, String type, String productionDate, String producer, String color,
        String cpu, String gpu, int storageSize, String storageType, int ramSize, String ramType, String connections, String interfaces, String os) {
        super(name, type, productionDate, producer, color);
        this.cpu = cpu;
        this.gpu = gpu;
        this.storageSize = storageSize;
        this.storageType = storageType;
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.connections = connections;
        this.interfaces = interfaces;
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

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamType() {
        return this.ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
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

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
}
