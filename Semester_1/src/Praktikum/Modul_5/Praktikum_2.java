package Praktikum.Modul_5;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 {
    public static void main(String[] args) {
        // Praktikum 2 A
        System.out.println("==========Soal A========");
        int coba[] = new int[5];
        int max = 0, min = 1000, imax=0, imin=0;
        
        for (int a = 0; a < coba.length; a++) {
            coba[a] = Integer.parseInt(
                    JOptionPane.showInputDialog("Masukkan Element Index ke "+a));
        }
        for (int i = 0; i < coba.length; i++) {
            if (coba[i] > max) {
                max = coba[i];
                imax = i;
            }
            if(coba[i] < min) {
                min = coba[i];
                imin = i;
            }
        }
        System.out.println("Posisi Index dan nilai Max = ["+imax+"] => "+max);
        System.out.println("Posisi Index dan nilai Min = ["+imin+"] => "+min);
        
        
        // Praktikum 2 B
        int ratarata = 0;
        System.out.println("==========Soal B========");
        for (int i = 0; i < coba.length; i++) {
            ratarata += coba[i];
        }
        System.out.println("Nilai Rata Rata Array adalah "+(ratarata/coba.length));
        
        // Praktikum 2 C
        System.out.println("==========Soal C========");
        int index;
        int nilai = 0;
        
        System.out.println("Data Array Sebelum di ubah");
        
        System.out.print("{");
        for (int i = 0; i <coba.length; i++) {
            System.out.print(coba[i]+" ");
        }
        System.out.print("}");
        index = Integer.parseInt(JOptionPane.showInputDialog(
                "Masukkan posisi Index = "));
        nilai = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Nilai untuk index = "));
        System.out.println();
        // ubah
        coba[index] = nilai;
                
        System.out.println("Data Array Setelah di ubah");
        System.out.print("{");
        for (int i = 0; i <coba.length; i++) {
            System.out.print(coba[i]+" ");
        }
        System.out.print("}");
    }   
}
