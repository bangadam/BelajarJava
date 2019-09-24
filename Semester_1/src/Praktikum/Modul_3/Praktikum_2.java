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
public class Praktikum_2 {
    public static void main(String[] args) throws IOException {
        int max= 0, min = 10000;
        int kotak[] = new int[3];
        BufferedReader read = new BufferedReader(new InputStreamReader(
                System.in));
        /* 
            fungsi try catch berguna untuk menangkap error pada program yang 
            kita buat
        */
        try {
            System.out.print("Masukkan Nilai Pertama = ");
            kotak[0] = Integer.parseInt(read.readLine());
            System.out.print("Masukkan Nilai Kedua = ");
            kotak[1] = Integer.parseInt(read.readLine());
            System.out.print("Masukkan Nilai Ketiga = ");
            kotak[2] = Integer.parseInt(read.readLine());
            
            for (int i = 0; i < kotak.length; i++) {
                if (kotak[i] > max) {
                    max = kotak[i];
                } else if(kotak[i] < min) {
                    min = kotak[i];
                }
            }
            
            System.out.println("Angka Terbesar = "+max);
            System.out.println("Angka Terkecil = "+min);
            
        } catch (Exception e) {
            System.out.println("Program Error");
        }
    }
}
