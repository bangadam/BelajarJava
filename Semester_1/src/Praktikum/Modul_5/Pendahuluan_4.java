/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_5;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_4 {
    public static void main(String[] args) {
        int data[] = {4,6,4,2,8,4,2,11}, index, nilai;
        
        System.out.println("======Data Array sebelum di tambah=========");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Posisi index ke ["+i+"] bernilai = "+ data[i]);
        }
        
        index = Integer.parseInt(JOptionPane.showInputDialog(
                "Masukkan Nomor index yang ingin di ubah nilainya = "));
        nilai = Integer.parseInt(JOptionPane.showInputDialog(
                "Masukkan Nilai yang akan ditambahkan ke dalam array = "));
        // mengubah nilai pada array
        data[index] = nilai;
        
        System.out.println("======Data Array setelah di tambah=========");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Posisi index ke ["+i+"] bernilai = "+ data[i]);
        }
        
        
    }
}
