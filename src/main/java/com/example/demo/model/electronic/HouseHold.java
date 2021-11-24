package com.example.demo.model.electronic;

import javax.persistence.*;

@Entity
@Table(name = "household")
public class HouseHold extends Electronic {
    @Column(name = "houseHoldType")
    private String houseHoldType;

    @Column(name = "wattage")
    private float wattage;

    @Column(name = "material")
    private String material;

    @Column(name = "voltage")
    private int voltage;


    public HouseHold() {
    }


    public HouseHold(String name, String type, String productionDate, String producer, String color, String houseHoldType, float wattage, String material, int voltage) {
        super(name, type, productionDate, producer, color);
        this.houseHoldType = houseHoldType;
        this.wattage = wattage;
        this.material = material;
        this.voltage = voltage;
    }


    public String getType() {
        return this.houseHoldType;
    }

    public void setType(String type) {
        this.houseHoldType = type;
    }

    public float getWattage() {
        return this.wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVoltage() {
        return this.voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

}
