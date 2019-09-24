/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_4 {
    public static void main(String[] args) {
        int data2[][] = {
            {4,6,4,7,8,3,2,10},
            {1,2,3,4,5,6,7,8}
        };
        System.out.println("=======Sebelum Dirubah======");
        for (int i = 0; i < data2.length; i++) {
            System.out.println("Ini Array Baris Ke "+ i);
            for (int j = 0; j < data2[i].length; j++) {
                System.out.println("["+i+"]["+j+"] => ["+data2[i][j]+"]");
            }
        }
        
        System.out.println("=======Setelah Dirubah======");
        for (int i = 0; i < data2.length; i++) {
            System.out.println("Ini Array Baris Ke "+ i);
            for (int j = 0; j < data2[i].length; j++) {
                data2[i][j] = Integer.parseInt(JOptionPane
                        .showInputDialog("Masukkan Nilai Baru"));
                System.out.println("["+i+"]["+j+"] => ["+data2[i][j]+"]");
            }
        }
        
        
    }
}
