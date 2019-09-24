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
public class Pendahuluan_6 {
    public static void main(String[] args) {
        int data2[][] = {
            {4,6,4,7,8,3,2,10},
            {1,2,3,4,5,6,7,8}
        };
        int ratarata = 0;
        
        // Menggunakan Perulangan FOR
        System.out.println("===========Menggunakan FOR=============");
        for (int i = 0; i < data2.length; i++) {
            System.out.println("Ini Array Baris Ke "+i);
            for (int j = 0; j < data2[i].length; j++) {
                System.out.println("array Colom  = ["+i+"]["+j+"] => "+data2[i][j]);
                ratarata += data2[i][j];
            }
            ratarata /= data2[i].length;
            System.out.println("Rata Rata Array Baris Ke ["+ i +"] => "+ + ratarata);
            ratarata = 0;
        }
        
    }
}
