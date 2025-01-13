package com.tutorial;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Alice", 500000);
        pegawaiTetap.setDurasiLembur(10);
        pegawaiTetap.display();

        System.out.println();

        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("Bob", 300000);
        pegawaiTidakTetap.setDurasiLembur(15);
        pegawaiTidakTetap.display();
    }
    
}
