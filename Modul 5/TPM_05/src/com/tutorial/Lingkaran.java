package com.tutorial;

public class Lingkaran extends BangunDatar{
    public float r; // Atribut r untuk menyimpan jari-jari lingkaran

    // Constructor
    public Lingkaran(float r) {
        this.r = r;
    }

    //method luas untuk menghitung luas lingkaran
    public float luas() {
        return (float) (Math.PI * r * r);
    }
    
    //method keliling untuk menghitung keliling lingkaran
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
