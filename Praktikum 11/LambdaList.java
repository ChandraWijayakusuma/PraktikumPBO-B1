import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add ("Chandra");
        mahasiswaList.add ("Raja");
        mahasiswaList.add ("Demas");
        mahasiswaList.add ("Qaynan");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
