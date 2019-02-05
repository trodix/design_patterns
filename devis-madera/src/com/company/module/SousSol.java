package com.company.module;

public class SousSol extends ModuleMaison {

    private float height;

    public SousSol(String name, float height, float price) {
        super(name, price);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
