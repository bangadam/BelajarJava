package Praktikum.Modul_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bangadam
 */
public class Praktikum_1 {
    public static void main(String[] args) throws IOException {
        int pertama, kedua, ketiga;
        
        BufferedReader read = new BufferedReader(new InputStreamReader(
                System.in));
        
        /* 
            fungsi try catch berguna untuk menangkap error pada program yang 
            kita buat
        */
        try {
            System.out.print("Masukkan Nilai Pertama = ");
            pertama = Integer.parseInt(read.readLine());
            System.out.print("Masukkan Nilai Kedua = ");
            kedua = Integer.parseInt(read.readLine());
            System.out.print("Masukkan Nilai Ketiga = ");
            ketiga = Integer.parseInt(read.readLine());
            
            System.out.println(
                    "Nilai-Nilai yang telah di inputkan adalah "
                            +pertama + ", " + kedua + ", "+ ketiga
            );
        } catch (Exception e) {
            System.out.println("Program Error");
        }
    }
}
