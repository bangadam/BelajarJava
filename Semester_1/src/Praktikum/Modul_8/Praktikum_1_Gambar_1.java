/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_8;

import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author bangadam
 */
public class Praktikum_1_Gambar_1 extends JFrame {
    /**
     * inisialisasi komponen
     */
    Checkbox cb1 = new Checkbox("Pilih A");
    Checkbox cb2 = new Checkbox("Pilih B");
    Checkbox cb3 = new Checkbox("Pilih C");
    
    /**
     * set config untuk class
     */
    Praktikum_1_Gambar_1() {
        setTitle("Proogram Gui Pertamaku");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * set layout, background color, and button to frame
     */
    
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30, 90, 150, 20);
        cb2.setBounds(30, 120, 150, 20);
        cb3.setBounds(30, 150, 150, 20);
        setVisible(true);
    }
    
    /**
     * memanggil frame to main program
     * @param args 
     */
    public static void main(String args[]) {
        Praktikum_1_Gambar_1 gui = new Praktikum_1_Gambar_1();
        gui.objek();
    }
}
