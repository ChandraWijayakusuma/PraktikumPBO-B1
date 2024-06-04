import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */
public class LthLambda {
    public static void main(String[] args) {        
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("s4060122140106", "Chandra");
        mahasiswaMap.put("24060122140131", "Raja");
        mahasiswaMap.put("24060122140126", "Raihan");
        mahasiswaMap.put("24060122140161", "Demas");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
