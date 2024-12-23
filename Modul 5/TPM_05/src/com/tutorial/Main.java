package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        // Membuat objek PersegiPanjang
        PersegiPanjang pp = new PersegiPanjang(4, 5);
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}
