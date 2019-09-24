package Praktikum.Modul_6;

/**
 *
 * @author bangadam
 */
public class Praktikum_1 {
    public static void main(String[] args) {
        // Gambar 1
        int[][] tabel = {
            {1,2,3,4},
            {5,6,7,8,}
        };
        System.out.println("Jumlah Baris => "+tabel.length);
        System.out.println("Jumlah Kolom => "+tabel[0].length);
        
        System.out.println();
        
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++)
                System.out.print(tabel[i][j]+" ");
            
            System.out.println();
        }
        
        System.out.println("");
        // Gambar 2
        int data[][] = {
            {4,6,4,2,8,4,2,10},
            {4,6,4,2,8,4,2,10},
        };
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
