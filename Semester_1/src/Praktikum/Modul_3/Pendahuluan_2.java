package Praktikum.Modul_3;


import java.io.IOException;
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
public class Pendahuluan_2 {
    public static void main(String[] args) throws IOException {
        int hasil2, c,d;
        
        System.out.println("======Use JOptions Pane=======");
        c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A = "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B = "));
        hasil2 = c+d;
        JOptionPane.showMessageDialog(null, "Hasil nilai a+b =" +hasil2);
    }
}
