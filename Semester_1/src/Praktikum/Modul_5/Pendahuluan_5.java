/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_5;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_5 {
    public static void main(String[] args) {
        int data[] = {4,6,4,2,8,4,2,11}, k = 0, j = 0;
        
        System.out.println("======List Data Array=========");
        
        System.out.println("======Menggunakan FOR=========");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Posisi index ke ["+i+"] bernilai = "+ data[i]);
        }
        
        System.out.println("======Menggunakan WHILE=========");
        while(k < data.length) {
            System.out.println("Posisi index ke ["+k+"] bernilai = "+ data[k]);
            k++;
        }
        
        System.out.println("======Menggunakan DO-WHILE=========");
        do{
            System.out.println("Posisi index ke ["+j+"] bernilai = "+ data[j]);
            j++;
        }while(j < data.length);
    }
}
