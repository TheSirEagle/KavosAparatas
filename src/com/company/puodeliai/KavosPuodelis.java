package com.company.puodeliai;

public class KavosPuodelis extends Puodelis{
    private Produktai produktai;
    private String name;
    private boolean isReady;


    public KavosPuodelis (Produktai products, String name, float volume){
        super(volume);
        this.name=name;
        this.produktai=products;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public String getName() {
        return name;
    }

    public Produktai getProduktai() {
        return produktai;
    }
}