/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_8;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.JFrame;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 extends JFrame {
    /*
    inisialisasi textfield dan button
    */
    TextField text1 = new TextField();
    Button bt1 = new Button("1");
    Button bt2 = new Button("2");
    Button bt3 = new Button("3");
    Button bt4 = new Button("+");
    Button bt5 = new Button("4");
    Button bt6 = new Button("5");
    Button bt7 = new Button("6");
    Button bt8 = new Button("-");
    Button bt9 = new Button("7");
    Button bt10 = new Button("8");
    Button bt11 = new Button("9");
    Button bt12 = new Button("*");
    Button bt13 = new Button("0");
    Button bt14 = new Button("C");
    Button bt15 = new Button("=");
    Button bt16 = new Button("/");
    
    /*
     * memanggil frame to main program
     */
    public static void main(String[] args) {
        Praktikum_2 gui = new Praktikum_2();
        gui.objek();
    }
    
    /*
    set configuration of class
    */
    Praktikum_2() {
        setTitle("Desain Calculator");
        setLocation(200, 100);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    set layout, Label, and button to frame
    */
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().add(text1);
        
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);
        getContentPane().add(bt10);
        getContentPane().add(bt11);
        getContentPane().add(bt12);
        getContentPane().add(bt13);
        getContentPane().add(bt14);
        getContentPane().add(bt15);
        getContentPane().add(bt16);
        
        text1.setBounds(50, 8, 190, 30);
        
        bt1.setBounds(50, 40, 40, 40);
        bt2.setBounds(100, 40, 40, 40);
        bt3.setBounds(150, 40, 40, 40);
        bt4.setBounds(200, 40, 40, 40);
        
        bt5.setBounds(50, 90, 40, 40);
        bt6.setBounds(100, 90, 40, 40);
        bt7.setBounds(150, 90, 40, 40);
        bt8.setBounds(200, 90, 40, 40);
        
        bt9.setBounds(50, 140, 40, 40);
        bt10.setBounds(100, 140, 40, 40);
        bt11.setBounds(150, 140, 40, 40);
        bt12.setBounds(200, 140, 40, 40);
     
        bt13.setBounds(50, 190, 40, 40);
        bt14.setBounds(100, 190, 40, 40);
        bt15.setBounds(150, 190, 40, 40);
        bt16.setBounds(200, 190, 40, 40);
        
        setVisible(true);
    }
    
    
}
