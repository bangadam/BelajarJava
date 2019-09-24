/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_8;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author bangadam
 */
public class Praktikum_1_gambar_1 extends JFrame {
    /**
     * inisialisasi komponen button
     */
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");
    
    /*
    set configuration of class
    */
    Praktikum_1_gambar_1() {
        setTitle("Program GUI pertamaku");
        setLocation(200, 100);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    set layout, background color, and button to frame
    */
    void objek() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    
    /*
     * memanggil frame to main program
     */
    public static void main(String args[]) {
        Praktikum_1_gambar_1 gui = new Praktikum_1_gambar_1();
        gui.objek();
    }
}
