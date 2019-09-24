package Praktikum.Modul_2;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 {
    public static void main(String[] args) {
        // deklarasi variable       
        int gaji_kotor, gaji_bersih;
        double pajak;
        
        // masukkan nilai
        gaji_kotor = 1000000;
        pajak = 0.3; // 10%
        
        // proses 
        gaji_bersih = (int) (gaji_kotor*pajak);
        
        System.out.println("Gaji bersih = " + gaji_bersih);
        
    }
}
