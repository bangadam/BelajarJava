/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) throws IOException {
        // Soal A
        int a = 10, angka;
        String hasil = "";
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========IF ELSE========");
        System.out.print("Masukkan angka dari 1 - 10 = ");
        angka = Integer.parseInt(read.readLine());
        
        for (int i = 1; i <= a; i++) {
            if (angka <= i) {
                hasil = "Angka yang anda Masukkan benar !!!";
                break;
            } else {
                hasil = "Maaf Angka yang anda masukkan salah";
            }
        }
        
        System.out.println(hasil);
        
        System.out.println("=========SWITCH=======");
        System.out.print("Masukkan angka dari 1 - 10 = ");
        angka = Integer.parseInt(read.readLine());
        switch(angka) {
            case 1: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 2: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 3: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 4: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 5: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 6: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 7: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 8: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 9: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            case 10: 
               hasil = "Angka yang anda Masukkan benar !!!";
            break;
            default:
               hasil = "Maaf Angka yang anda masukkan salah";
            break;
        }
        System.out.println(hasil);
    }
    
}
