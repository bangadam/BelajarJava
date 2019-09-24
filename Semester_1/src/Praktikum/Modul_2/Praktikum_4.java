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
public class Praktikum_4 {
    public static void main(String[] args) {
        int angka1, angka2, angka3, pangkat1, pangkat2, 
                pangkat3, hasil1, hasil2, hasil3, total;
         // Soal A
        angka1 = 2;
        angka2 = 2;
        angka3 = 4;
        pangkat1 = 8;
        pangkat2 = 4;
        pangkat3 = 1;
        
        hasil1 = (int) Math.pow(angka1, pangkat1);
        hasil2 = (int) Math.pow(angka2, pangkat2);
        
        total = (hasil1 + hasil2);
        
        System.out.println("=======Soal A=======");
        System.out.println("Hasil Nilai adalah " +  total);
        
        // Soal B
        angka1 = 2;
        angka2 = 4;
        angka3 = 2;
        pangkat1 = 2;
        pangkat2 = 1;
        pangkat3 = 2;
        
        hasil1 = (int) Math.pow(angka1, pangkat1);
        hasil2 = (int) Math.pow(angka2, pangkat2);
        hasil3 = (int) Math.pow(angka3, pangkat3);
        
        total = hasil1 + (hasil2 / hasil3);
        
        System.out.println("=======Soal  B=======");
        System.out.println("Hasil Nilai adalah " +  total);
        
    }
}
