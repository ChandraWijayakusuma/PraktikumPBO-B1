package org.bangundatar;

import org.poligon.poligon;

public class segitiga extends poligon {
    private double tinggi, alas;

    public segitiga (double tinggi, double alas, int jumlahSisi){
        this.tinggi = tinggi;
        this.alas = alas;
        this.jumlahSisi = jumlahSisi;   
    }
    public double hitungLuas(){
        return tinggi * alas / 2;
    }

    public void printinfo(){
        System.out.println("Bangun segitiga bersisi : " + this.getJumlahSisi());
    }
}
