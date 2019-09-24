/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 {
    public static void main(String[] args) {
        int data2[][] = {
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
        };
//         Soal A
        System.out.println("=========Soal A==========");
        //WHILE
        System.out.println("********Pakai While*******");
        int c = 0;
        // rata rata
        int ratarata = 0, bagi = 0;
        double semuaRata =0;
        
        while(c < data2.length) {
            int d = 0;
            bagi += data2[c].length;
            while(d < data2[c].length) {
                System.out.println("["+c+"]["+d+"] => "+data2[c][d]);
                semuaRata += data2[c][d];
                d++;
            }
            c++;
        }
        ratarata=0;
        System.out.println("********Pakai Do While*******");
        int e =0;
        do {
            int f = 0;
            do {
                System.out.println("["+e+"]["+f+"] => "+data2[e][f]);
                f++;
            } while (f<data2[e].length);
            e++;
        }while(e < data2.length);
        
        System.out.println("=========Soal B==========");
        System.out.println("Semua Rata Rata Array = "+(semuaRata / bagi));
      
        System.out.println("=========Soal C==========");
        System.out.println("*********Mengubah Nilai Array**********");
        int index = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Index Pertama Array"));
        int indexkedua = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Index Kedua Array"));
        int nilai = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Nilai Array"));
        
        // ubah nilai
        try {
            data2[index][indexkedua] = nilai;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, ""
                    + "Maaf Error silahkan ulangi lagi");
        }
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[index][indexkedua] == data2[i][j]) {
                    System.out.println("["+i+"]["+j+"] => "+data2[i][j]+
                            " Index yang dirubah Nilainya");
                } else {
                    System.out.println("["+i+"]["+j+"] => "+data2[i][j]);
                }
            }
        }
        
        // Mencari Nilai Ganjil dan genap
        int ganjil = 0, genap = 0;
        System.out.println("=========Soal D==========");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (j%2 == 1) {
                    System.out.println("["+i+"]["+j+"] => "+data2[i][j]+" => Ganjil");
                    ganjil += data2[i][j];
                }
                if (j % 2 == 0) {
                    System.out.println("["+i+"]["+j+"] => "+data2[i][j]+"=> Genap");
                    genap += data2[i][j];
                }
            }
        }
        System.out.println("Total Jumlah Ganjil => "+ganjil); 
        System.out.println("Total Jumlah Genap => "+genap);
    }
}
