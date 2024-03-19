import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + "satuan adalah " + bs.hitungLuas(sisi));
    }
}

//Jawaban : Jika BangunDatar.java tidak diimplementasikan pada BujurSangka maka kode pada bujur sangkar tidak akan berjalan dikarenakan file BujurSangkar.java membutuhkan sebuah double untuk luasnya