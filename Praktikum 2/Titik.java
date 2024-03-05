public class Titik{
    // Deklarasi atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;


    // Deklarasi Konstruktor

    public Titik(){
        ordinat = 0;
        absis = 0;
        counterTitik++;
    }
    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    // Deklarasi metode

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double a){
        ordinat = a;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }

}

