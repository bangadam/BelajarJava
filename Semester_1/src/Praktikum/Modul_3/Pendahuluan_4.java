package Praktikum.Modul_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bangadam
 */
public class Pendahuluan_4 {
    public static void main(String[] args) throws IOException {
        int a,b, hasil, hasil2, c,d;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("======Use BufferedReader=======");
        System.out.print("Masukkan Nilai A = ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Mauskkan Nilai B = ");
        b = Integer.parseInt(input.readLine());
        hasil = a+b;
        System.out.println("Hasil Nilai a+b = "+hasil);
        
        System.out.println("======Use JOptions Pane=======");
        c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A = "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B = "));
        hasil2 = c+d;
        JOptionPane.showMessageDialog(null, "Hasil nilai a+b =" +hasil2);
    }
}
