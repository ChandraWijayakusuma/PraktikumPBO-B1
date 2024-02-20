class Titik{
    // Deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    // Deklarasi Konstruktor

    Titik(){
        ordinat = 0;
        absis = 0;
        counterTitik++;
    }

    // Deklarasi metode

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double a){
        ordinat = a;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }

}

