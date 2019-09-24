/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_8;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_3 extends JFrame {
    /**
     * Inisialisasi Komponen
     */
    Label label1 = new Label("Masukkan Angka Pertama");
    Label label2 = new Label("Masukkan Angka Kedua");
    Label label3 = new Label("Masukkan Angka Ketiga");
    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    Button bt1 = new Button("+");
    Button bt2 = new Button("-");
    Button bt3 = new Button("/");
    Button bt4 = new Button("*");
    
    public static void main(String[] args) {
        /**
         * Pemanggilan class
         */
        Pendahuluan_3 gui = new Pendahuluan_3();
        gui.objek();
    }
    
    Pendahuluan_3() {
        /**
         * set config for Jframe
         */
        setTitle("Pendahuluan 3");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void objek() {
        getContentPane().setLayout(null);
        /**
         * Menambahkkan komponen kedalam jframe
         */
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(text1);
        getContentPane().add(text2);
        getContentPane().add(text3);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        
        /**
         * Block code untuk mengatur posisi label, text input dan button
         */
        label1.setBounds(100, 10, 200, 10);
        text1.setBounds(100, 30, 200, 20);
        label2.setBounds(100, 70, 200, 10);
        text2.setBounds(100, 90, 200, 20);
        label3.setBounds(100, 130, 200, 10);
        text3.setBounds(100, 150, 200, 20);
        bt1.setBounds(100, 180, 50, 50);
        bt2.setBounds(180, 180, 50, 50);
        bt3.setBounds(260, 180, 50, 50);
        bt4.setBounds(180, 230, 50, 50);
                
        setVisible(true);
    }
}
