/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_7;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) {
        System.out.println("-------Persegi Panjang---------");
        int panjang = InputNilai("panjang");
        int lebar = InputNilai("lebar");
        luasPersegiPanjang(panjang, lebar);
        System.out.println("-------Segitiga---------");
        int alas = InputNilai("Alas");
        int tinggi = InputNilai("Tinggi");
        luasSegitiga(alas, tinggi);
        System.out.println("-------Lingkaran---------");
        int jari = InputNilai("Jari Jari");
        luasLingkaran(jari);
    }
    
    public static int InputNilai(String satuan) {
        int nilai = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Nilai "+ satuan));
        
        return nilai;
    }
    
    public static void luasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang => "+hasil);
    }
    
    public static void luasSegitiga(int alas, int tinggi) {
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga => "+ hasil);
    }
    
    public static void luasLingkaran(int jari) {
        double hasil = Math.PI * Math.pow(jari, 2);
        System.out.println("Luas Lingkaran => "+ hasil);
    }
}