import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan panjang jejari lingkaran: ");
        double jejari = scan.nextDouble();
        
        Lingkaran lingkaran = new Lingkaran(jejari);
        
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + lingkaran.hitungLuas());
    }
}