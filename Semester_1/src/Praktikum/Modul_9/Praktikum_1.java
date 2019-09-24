/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_9;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author bangadam
 */
public class Praktikum_1 extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10, 10);

    Praktikum_1() {
        super("Coba Event Handling");
        setLocation(200, 300);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    void tampilan() {
        getContentPane().add(nama);
        nama.append("Nama Kamu Siapa");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.lightGray);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    
    void aksi_reaksi() {
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txnama.append(nama.getText());
            }
        });
    }
    
    public static void main(String[] args) {
        Praktikum_1 test = new Praktikum_1();
        test.tampilan();
        test.aksi_reaksi();
    }
            
}
