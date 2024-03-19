package org.bangundatar;

import org.poligon.poligon;

public class persegipanjang extends poligon{
    private double panjang, lebar;

    public persegipanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;   
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
    public void printinfo(){
        System.out.println("Bangun persegi panjang bersisi : " + this.getJumlahSisi());
    }
}


