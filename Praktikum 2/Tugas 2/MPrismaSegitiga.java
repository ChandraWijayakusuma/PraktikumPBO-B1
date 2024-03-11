public class MPrismaSegitiga {
    public static void main (String[] args) {
        Segitiga Sgt = new Segitiga (3, 4);
        PrismaSegitiga PS = new PrismaSegitiga(Sgt, 5);

        System.out.println("Volume prisma segitiga : " + PS.hitungVolume());
        System.out.println("Luas permukaan prisma segitiga : " + PS.hitungLuasPermukaan());
    }
}
