/*l
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_9;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    Label label3 = new Label("Hasil");
    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    Button bt1 = new Button("+");
    Button bt2 = new Button("-");
    Button bt3 = new Button("/");
    Button bt4 = new Button("*");
    Button bt5 = new Button("pangkat");

    public static void main(String[] args) {
        /*
         * Pemanggilan class
         */
        Pendahuluan_3 gui = new Pendahuluan_3();
        gui.terserah();
    }

    /*
     * set config for Jframe
     */
    Pendahuluan_3() {
        setTitle("Pendahuluan 3");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void terserah() {
        getContentPane().setLayout(null);
        /*
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
        getContentPane().add(bt5);

        /*
         * Block code untuk mengatur posisi label, text input dan button
         */
        label1.setBounds(100, 10, 200, 20);
        text1.setBounds(100, 30, 200, 20);
        label2.setBounds(100, 70, 200, 20);
        text2.setBounds(100, 90, 200, 20);
        label3.setBounds(100, 130, 200, 20);
        text3.setBounds(100, 150, 200, 20);
        bt1.setBounds(100, 190, 50, 50);
        bt2.setBounds(180, 190, 50, 50);
        bt3.setBounds(260, 190, 50, 50);
        bt4.setBounds(180, 250, 50, 50);
        bt5.setBounds(180, 300, 50, 50);

        setVisible(true);
        

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(text1.getText());
                int input2 = Integer.parseInt(text2.getText());
                
                int hasil = input1 + input2;
                text3.setText(String.valueOf(hasil));
            }
        });
        
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(text1.getText());
                int input2 = Integer.parseInt(text2.getText());
                
                Pendahuluan_3 adam = new Pendahuluan_3();
                text3.setText(String.valueOf(adam.setTambah(input1, input2)));
            }
        });
        
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(text1.getText());
                int input2 = Integer.parseInt(text2.getText());
                
                Pendahuluan_3 call = new Pendahuluan_3();
                text3.setText(String.valueOf(call.setKurang(input1, input2)));
            }
        });
        
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(text1.getText());
                int input2 = Integer.parseInt(text2.getText());
                
                Pendahuluan_3 call = new Pendahuluan_3();
                text3.setText(String.valueOf(call.setBagi(input1, input2)));
            }
        });
        
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(text1.getText());
                int input2 = Integer.parseInt(text2.getText());
                
                Pendahuluan_3 call = new Pendahuluan_3();
                text3.setText(String.valueOf(call.setKali(input1, input2)));
            }
        });
    }
    
    public int setTambah(int input1, int input2) {
         int hasil = input1 + input2;
         return hasil;
    }
    
    public int setKurang(int input1, int input2) {
        int hasil = input1 - input2;
        return hasil;
    }
    
    public int setBagi(int input1, int input2) {
        int hasil = input1 / input2;
        return hasil;
    }
    
    public int setKali(int input1, int input2) {
        int hasil = input1 * input2;
        return hasil;
    }
    
}
    