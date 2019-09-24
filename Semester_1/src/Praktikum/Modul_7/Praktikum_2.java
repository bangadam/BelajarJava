/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_7;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 {
    public static void main(String[] args) {
        int batas_bawah, batas_atas, suku;
        
        batas_bawah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Batas Bawah = "));
        batas_atas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Batas Atas = "));
        suku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Suku = "));
        
        System.out.println("Hasil Sigma = "+ Sigma(batas_bawah, batas_atas, suku));
    }
    
    public static int Sigma(int batas_bawah, int batas_atas, int suku) {
        int hasil = 0, total = 0;
        
        for (int i = batas_bawah; i <= batas_atas; i++) {
            hasil = ((2 * i) + suku);
            total += ((2 * i) + suku);
            System.out.println(suku+" + (2 * "+i+") => "+hasil);
        }
        
        return total;
    }
}
