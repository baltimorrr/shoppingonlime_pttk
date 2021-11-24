package com.example.demo.model.clothes;


import javax.persistence.*;

@Entity
@Table(name = "tshirt")
public class TShirt extends Clothes{
    @Column(name = "tagFree")
    private int tagFree;

    @Column(name = "layFlat")
    private int layFlat;

    @Column(name = "tapedNeck")
    private int tapedNeck;

    @Column(name = "bottemHem")
    private float bottemHem;


    public TShirt() {
    }

    public TShirt(String brand, String color, String material, String department, String size, float weight,
            String countryOrigin, int tagFree, int layFlat, int tapedNeck, float bottemHem) {
        super(brand, color, material, department, size, weight, countryOrigin);
        this.tagFree = tagFree;
        this.layFlat = layFlat;
        this.tapedNeck = tapedNeck;
        this.bottemHem = bottemHem;
    }


    public int getTagFree() {
        return this.tagFree;
    }

    public void setTagFree(int tagFree) {
        this.tagFree = tagFree;
    }

    public int getLayFlat() {
        return this.layFlat;
    }

    public void setLayFlat(int layFlat) {
        this.layFlat = layFlat;
    }

    public int getTapedNeck() {
        return this.tapedNeck;
    }

    public void setTapedNeck(int tapedNeck) {
        this.tapedNeck = tapedNeck;
    }

    public float getBottemHem() {
        return this.bottemHem;
    }

    public void setBottemHem(float bottemHem) {
        this.bottemHem = bottemHem;
    }
    
}
