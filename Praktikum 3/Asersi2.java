/*
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * 
 */

class Lingkaran{
    private double jarijari;
    public Lingkaran (double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungkeliling(){
        double keliling  = 2*Math.PI*jarijari;
        return keliling;
    }
}



public class Asersi2 {
    public static void main(String[] args){
        double jarijari = 0;
        assert(jarijari > 0): "jari-jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilinglingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilinglingkaran);

    }    
}
// Jawaban : dikarenakan jari jari 0 dan terjadilah error, maka fungsi assert akan berjalan dan mengeluarkan pesannya
