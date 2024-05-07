public class Pegawai {
    private String nama;
    private int gajiPokok = 500000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama" + nama);
        System.out.println("Gaji Pokok" + gajiPokok);
    }
}