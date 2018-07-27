package com.company.puodeliai;

public class Produktai {
    private float water;
    private float sugar;
    private float beans;

    public Produktai(){}
    public Produktai(float water, float sugar, float beans){
        this.water = water;
        this.beans = beans;
        this.sugar = sugar;
    }

    public float getBeans() {
        return beans;
    }

    public void setBeans(float beans) {
        this.beans = beans;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getWater() {
        return water;
    }

    public void setWater(float water) {
        this.water = water;
    }
}