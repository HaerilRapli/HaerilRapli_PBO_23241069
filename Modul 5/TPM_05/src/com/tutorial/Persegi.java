package com.tutorial;

public class Persegi extends BangunDatar{
    public float sisi; // Atribut sisi untuk menyimpan panjang sisi persegi

    // Constructor
    public Persegi(float sisi) {
        this.sisi = sisi;  
    }
    
    // method luas untuk menghitung luas persegi
    public float luas() {
        return sisi * sisi;
    }

    // method keliling untuk menghitung keliling persegi
    public float keliling() {
        return 4 * sisi;
    }
}
