package com.company.puodeliai;

public class Puodelis {
    private float maxVolume;

    public Puodelis(float volume){
        this.maxVolume= volume;
    }

    public void showInfo(){
        System.out.println("Maksimali puodelio talpa:"+this.maxVolume);
    }
}