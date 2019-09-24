/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_6;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_5 {
    public static void main(String[] args) {
        int data2[][] = {
            {4,6,4,7,8,3,2,10},
            {1,2,3,4,5,6,7,8}
        };
        
        // Menggunakan Perulangan FOR
        System.out.println("===========Menggunakan FOR=============");
        for (int i = 0; i < data2.length; i++) {
            System.out.println("Ini Array Baris Ke "+i);
            for (int j = 0; j < data2[i].length; j++) {
                System.out.println("array  = ["+i+"] => "+data2[i][j]);
            }
        }
        
        // Menggunakan Perulangan WHILE
        System.out.println();
        System.out.println("===========Menggunakan WHILE=============");
        int a = 0;
        while(a < data2.length) {
            int b = 0;
            System.out.println("Ini Array Baris Ke "+a);
            while(b < data2[a].length) {
                System.out.println("array  = ["+a+"] => "+data2[a][b]);
                b++;
            }
            a++;
        }
        
        // Menggunakan DO WHILE
        System.out.println();
        System.out.println("===========Menggunakan DO WHILE=============");
        int c = 0;
        do {
            System.out.println("Ini Array Baris Ke "+c);
            int d = 0;
            do {
                System.out.println("array  = ["+c+"] => "+data2[c][d]);
                d++;
            } while (d < data2[c].length); 
            c++;
        } while (c < data2.length);
        
    }
}
