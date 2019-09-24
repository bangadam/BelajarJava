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
public class Praktikum_2 {
    public static void main(String[] args) throws IOException {
        // Deklarasi
       int a,b,c,   d = 1, total= 0;
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       
        //Soal A
       System.out.println("======SOAL A========");       
       for (int i = 0; i < 2; i++) {
         System.out.print("Masukkan Angka = ");
         a = Integer.parseInt(read.readLine());   
         System.out.print("Masukkan Pangkat = ");
         b = Integer.parseInt(read.readLine());
         
           for (int j = 0; j < b; j++) {
               d*=a;
           }
           
           total += d;
           System.out.println("Hasil perpangkatan = "+d);
           
           d=1;
       }
       System.out.println("Total jumlah perpangkatan adalah "+total);
       
       total = 0;
      
      // Soal B
       System.out.println("=====Soal B=======");
       for (int i = 0; i < 2; i++) {
         System.out.print("Masukkan Angka = ");
         a = Integer.parseInt(read.readLine());         
           for (int j = 1; j <= a; j++) {
               d*=j;
           }
           total += d;
           System.out.println("Hasil Faktorial = "+d);
           d= 1;
       }
       System.out.println("Total jumlah faktorial adalah "+total);
       total = 0;
       
//        Soal C
       System.out.println("=====Soal C=======");
       for (int i = 0; i < 4; i++) {
         if (i != 2) {
            System.out.print("Masukkan Angka = ");
            a = Integer.parseInt(read.readLine());   
            System.out.print("Masukkan Pangkat = ");
            b = Integer.parseInt(read.readLine());

            for (int j = 0; j < b; j++) {
                d*=a;
            }
            
            total += d;
            System.out.println("Hasil perpangkatan = "+d);
            d = 1;
         } else if(i == 2) {
            double bagi;
             System.out.print("Masukkan Angka Bagi = ");
            bagi = Integer.parseInt(read.readLine());
            total /= bagi;
            System.out.println("Dibagi "+bagi+" hasil sementara = "+total);
         }    
       }
       System.out.println("Total jumlah Pemangkatan adalah "+(double)total);
    }
}
