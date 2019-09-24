package Praktikum.Modul_5;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_1 {
    public static void main(String[] args) {
        // Array Statis
        System.out.println("=======Array Satis======");
        int[] data = {20,10,50,30,10};
        System.out.print("Isi data anda Adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        // Array Dinamis dengan bilangan random
        System.out.println("========Array Dinamis=====");
        double[] contoh = new double[30];
        for (int i = 0; i < 30; i++)
            contoh[i] = 100.0 * Math.random();
        double ratarata = 0.0;
        for (int i = 0; i < 30; i++)
            ratarata += contoh[i];
        ratarata /= 30;
        System.out.println("Mean 30 bilangan random : "+ratarata);
        
        // Array Dinamis elemen dimasukkan
        int coba[] = new int[10];
        for (int a = 0; a < coba.length; a++) {
            coba[a] = Integer.parseInt(
                    JOptionPane.showInputDialog("Masukkan Element Index ke "+a));
                    System.out.println("Index Ke "+a+" adalah "+coba[a]);      
        }
    }
    
}
