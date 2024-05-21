// Definisi kelas Kupu
class Kupu2 {
    // Method gerak() pada kelas Kupu
    void gerak() {
        // Implementasi default, bisa kosong atau berisi kode lainnya
    }
}

// Kelas Ulat yang mewarisi Kupu
class Ulat extends Kupu {
    // Override method gerak() pada kelas Ulat
    @Override
    void gerak() {
        System.out.println("ulat merayap");
    }
}

// Kelas Kepompong yang mewarisi Kupu
class Kepompong extends Kupu {
    // Override method gerak() pada kelas Kepompong
    @Override
    void gerak() {
        System.out.println("kepompong diam");
    }
}

// Kelas KupuDewasa yang mewarisi Kupu
class KupuDewasa extends Kupu {
    // Override method gerak() pada kelas KupuDewasa
    @Override
    void gerak() {
        System.out.println("kupu terbang");
    }
}

// Kelas generik Data dengan tipe parameter T
class Data<T> {
    // Variabel isi dengan tipe T
    private T isi;

    // Method untuk mendapatkan isi
    T getIsi() {
        return isi;
    }

    // Method untuk mengatur isi
    void setIsi(T x) {
        isi = x;
    }
}

// Kelas Main untuk menjalankan program
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
        anu.getIsi().gerak(); // Output: "ulat merayap"

        // Set isi dari Data dengan objek Kepompong
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak(); // Output: "kepompong diam"

        // Set isi dari Data dengan objek KupuDewasa
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak(); // Output: "kupu terbang"
    }
}
