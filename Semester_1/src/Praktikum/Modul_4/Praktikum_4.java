/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_4;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-PEMROGRAMAN.9
 */
public class Praktikum_4 {
    public static void main(String[] args) {
        int bilangan = 0, batas = 5, hasil = 0;
        
        for (int j = 0; j < batas; j++) {
            bilangan = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Masukkan Angka Ganjil atau Genap 5 kali, " + j+" kali"));
            
            hasil += bilangan;
            
            if (bilangan % 2 == 1) {
                System.out.println("Angka "+ bilangan+" Termasuk bilangan ganjil");
            } else {
                System.out.println("Angka "+ bilangan+" Termasuk bilangan genap");
            }
        }
        
        System.out.println("Jumlah total bilangan = "+hasil);
    }
}
