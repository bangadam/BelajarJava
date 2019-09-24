/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_2;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) {
        int biaya_haji, dp_haji, bulan, sisa_biaya_haji, cicilan;
        
        biaya_haji = 50000000;
        System.out.println("Biaya Haji Pak Sholeh = "+ biaya_haji);
        dp_haji = 10000000;
        System.out.println("Dp Haji yang telah dibayar =" +dp_haji);
        sisa_biaya_haji = 40000000;
        System.out.println("Sisa biaya haji yang harus dibayar = " + sisa_biaya_haji);
        
        bulan = 23;
        
        cicilan = (sisa_biaya_haji/bulan);
        
        System.out.println("Jumlah Cicilan yang harus dibayarkan sebesar = " + cicilan);
        
    }
}
    