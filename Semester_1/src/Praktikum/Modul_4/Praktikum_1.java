/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_4;

import java.io.Console;

/**
 *
 * @author bangadam
 */
public class Praktikum_1 {
    public static void main(String[] args) {
        // No. 1 gambar 1
        System.out.println("========No.1 gambar 1 ========");
        int jml=0;
        for (int i = 1; i <= 10; i++) {
            jml+=i;
        }
        System.out.println("Jumlah Semua bilangan : "+jml);
        // No. 1 gambar 2
        System.out.println("========No.1 gambar 2 ========");
        for (double jari = 1.0; jari<=2.0; jari+=0.2) {
            System.out.println("Radius = "+jari+" Luas = "+jari*Math.PI*jari);
        }
        // No. 1 gambar 3
        System.out.println("========No.1 gambar 3 ========");
        double r=0;
        while (r<0.99d) {            
            r =Math.random();
            System.out.println(r);
        }
        // No. 1 gambar 4
        System.out.println("========No.1 gambar 4 ========");
        double s = 0;
        do {
            s=Math.random();
            System.out.println(r);
        } while (r<0.99d);
        // No. 1 gambar 5
        System.out.println("========No.1 gambar 5 ========");
        long batas =4;
        long faktorial = 1;
        for (int i = 0; i <= batas; i++) {
            faktorial=1;
            for (int j = 2; j <=i; j++) 
                faktorial*=j;
                System.out.println(i+"!"+" adalah = "+faktorial);
            
        }

    }
}
