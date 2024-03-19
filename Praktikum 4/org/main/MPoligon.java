package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        persegipanjang persegi = new persegipanjang(10, 10, 4);
        persegi.printinfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        segitiga sgt = new segitiga(10, 10, 3);
        sgt.printinfo();
        System.out.println("Luas Segitiga Panjang : " + sgt.hitungLuas());
    }
}
