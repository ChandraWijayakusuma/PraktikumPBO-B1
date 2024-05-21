public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        Ulat K;
        Data<Kupu> anu;

        // Inisialisasi variabel
        K = new Ulat();
        anu = new Data<>();

        // Set isi dari Data dengan objek Ulat
        anu.setIsi(K);

        // Panggil method gerak() pada objek yang disimpan di Data
        anu.getIsi().gerak();
    }
}