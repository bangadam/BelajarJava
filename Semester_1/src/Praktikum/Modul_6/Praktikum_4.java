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
public class Praktikum_4 {
    public static void main(String[] args) {
        int data[][] = {
            {2,9,5,17},
            {1,5,10,4}
        };
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 9) {
                    System.out.println("["+i+"]["+j+"] => "+data[i][j]+" Index yang akan diganti nilainya");
                } else {
                    System.out.println("["+i+"]["+j+"] => "+data[i][j]);
                }
            }
            System.out.println();
        }
        
        int nilai = Integer.parseInt(JOptionPane
                .showInputDialog("Masukkan Nilai untuk Index ke [0][1]"));

        // ubah nilai
        data[0][1] = nilai;
        
        int total = 0;
                
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == nilai) {
                    System.out.println("["+i+"]["+j+"] => "+data[i][j]+" Nilai Sudah Berubah");
                } else {
                    System.out.println("["+i+"]["+j+"] => "+data[i][j]);
                }
                total += data[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Total Jumlah Semua Array => "+total);
    }
}
