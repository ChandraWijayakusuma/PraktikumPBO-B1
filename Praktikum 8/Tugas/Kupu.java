class Kupu {
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

