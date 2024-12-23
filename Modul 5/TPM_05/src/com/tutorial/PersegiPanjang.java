package com.tutorial;

public class PersegiPanjang extends BangunDatar{
    public float panjang, lebar; // Atribut panjang dan lebar persegi panjang

    // Constructor
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method luas untuk menghitung luas persegi panjang
    public float luas() {
        return panjang * lebar;
    }

    //method keliling untuk menghitung keliling persegi panjang
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
