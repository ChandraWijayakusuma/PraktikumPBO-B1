/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medium;

/**
 *
 * @author chan
 */

 /*
 * Nama : Chandra Wijayakusuma
 * NIM  : 24060122140106
 * Nama File : Animal.java
 * Deskripsi : File class dari Animal
 */

public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
