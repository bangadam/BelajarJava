/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_9;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author bangadam
 */
public class Praktikum_2 extends JFrame implements MouseListener {
    /*
    inisialisasi textInput1 dan button
    */
    double number, answer;
    int calculation;
    
    Label text1 = new Label();
    TextField textInput1 = new TextField();
    Button bt1 = new Button("1");
    Button bt2 = new Button("2");
    Button bt3 = new Button("3");
    Button btTambah = new Button("+");
    Button bt4 = new Button("4");
    Button bt5 = new Button("5");
    Button bt6 = new Button("6");
    Button btKurang = new Button("-");
    Button bt7 = new Button("7");
    Button bt8 = new Button("8");
    Button bt9 = new Button("9");
    Button btKali = new Button("*");
    Button bt0 = new Button("0");
    Button btDelete = new Button("C");
    Button btSamaDengan = new Button("=");
    Button btBagi = new Button("/");
    
    /*
     * memanggil frame to main program
     */
    public static void main(String[] args) {
        Praktikum_2 gui = new Praktikum_2();
        gui.addComponent();
        gui.addActionEvent();
    }
    
    /*
    set configuration of class
    */
    Praktikum_2() {
        setTitle("Calculator Sederhana");
        setLocation(200, 100);
        setSize(300, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    set layout, text1, and button to frame
    */
    void addComponent() {
        getContentPane().setLayout(null);
        getContentPane().add(text1);
        getContentPane().add(textInput1);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(btTambah);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(btKurang);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);
        getContentPane().add(btKali);
        getContentPane().add(bt0);
        getContentPane().add(btDelete);
        getContentPane().add(btSamaDengan);
        getContentPane().add(btBagi);
        
        text1.setBounds(200, 10, 70, 10);
        textInput1.setBounds(50, 50, 190, 30);
        textInput1.setEditable(false);
        
        bt1.setBounds(50, 90, 40, 40);
        bt2.setBounds(100, 90, 40, 40);
        bt3.setBounds(150, 90, 40, 40);
        btTambah.setBounds(200, 90, 40, 40);
        
        bt4.setBounds(50, 140, 40, 40);
        bt5.setBounds(100, 140, 40, 40);
        bt6.setBounds(150,140, 40, 40);
        btKurang.setBounds(200, 140, 40, 40);
        
        bt7.setBounds(50, 190, 40, 40);
        bt8.setBounds(100, 190, 40, 40);
        bt9.setBounds(150, 190, 40, 40);
        btKali.setBounds(200, 190, 40, 40);
     
        bt0.setBounds(50, 240, 40, 40);
        btDelete.setBounds(100, 240, 40, 40);
        btSamaDengan.setBounds(150, 240, 40, 40);
        btBagi.setBounds(200, 240, 40, 40);
        
        setVisible(true);
    }
    
    public void addActionEvent() {
            bt1.addMouseListener(this);
            bt2.addMouseListener(this);
            bt3.addMouseListener(this);
            btTambah.addMouseListener(this);
            bt4.addMouseListener(this);
            bt5.addMouseListener(this);
            bt6.addMouseListener(this);
            btKurang.addMouseListener(this);
            bt7.addMouseListener(this);
            bt8.addMouseListener(this);
            bt9.addMouseListener(this);
            btKali.addMouseListener(this);
            bt0.addMouseListener(this);
            btDelete.addMouseListener(this);
            btSamaDengan.addMouseListener(this);
            btBagi.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
       if (source == btDelete) {
            //Clearing texts of text1 and text field
            text1.setText("");
            textInput1.setText("");
        } else if (source == bt0) {
            if (textInput1.getText().equals("0")) {
                return;
            } else {
                textInput1.setText(textInput1.getText() + "0");
            }
        } else if (source == bt1) {
            textInput1.setText(textInput1.getText() + "1");
        } else if (source == bt2) {
            textInput1.setText(textInput1.getText() + "2");
        } else if (source == bt3) {
            textInput1.setText(textInput1.getText() + "3");
        } else if (source == bt4) {
            textInput1.setText(textInput1.getText() + "4");
        } else if (source == bt5) {
            textInput1.setText(textInput1.getText() + "5");
        } else if (source == bt6) {
            textInput1.setText(textInput1.getText() + "6");
        } else if (source == bt7) {
            textInput1.setText(textInput1.getText() + "7");
        } else if (source == bt8) {
            textInput1.setText(textInput1.getText() + "8");
        } else if (source == bt9) {
            textInput1.setText(textInput1.getText() + "9");
        } else if (source == btTambah) {
            String str = textInput1.getText();
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            text1.setText(str + "+");
            calculation = 1;
        } else if (source == btKurang) {
            String str = textInput1.getText();
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            text1.setText(str + "-");
            calculation = 2;
        } else if (source == btKali) {
            String str = textInput1.getText();
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            text1.setText(str + "X");
            calculation = 3;
        } else if (source == btBagi) {
            String str = textInput1.getText();
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            text1.setText(str + "/");
            calculation = 4;
        } else if (source == btSamaDengan) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
                    text1.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
                    text1.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
                    text1.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
                    text1.setText("");
                    break;
 
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }
}
