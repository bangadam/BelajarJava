/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) throws IOException {
        int penjualan, hasil;
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("====Pendapatan Salesman=====");
        System.out.print("Masukkan Hasil Penjualan = ");
        penjualan = Integer.parseInt(read.readLine());
        
        if (penjualan == 2000000) {
            hasil = (int) (100000 + (penjualan*0.1));
            System.out.println("Total Upah Salesman = "+ hasil);
        } else if(penjualan == 5000000 || penjualan > 2000000) {
            hasil = (int) (200000 + (penjualan*0.15));
            System.out.println("Total Upah Salesman = "+ hasil);
        } else if (penjualan > 5000000) {
            hasil = (int) (300000 + (penjualan*0.2));
            System.out.println("Total Upah Salesman = "+ hasil);
        } else {
            System.out.println("Anda Tidak mendapatkan upah");
        }
    }
}
