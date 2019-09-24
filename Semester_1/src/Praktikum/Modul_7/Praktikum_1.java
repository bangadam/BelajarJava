/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bangadam
 */
public class Praktikum_1 {
    public static void main(String[] args) {
        segiempat(5, 2);
        
        System.out.println("---------Volume Tabung---------");
        System.out.print("Masukkan Diameter Tabung = ");
        int diameter = readInt();
        System.out.print("Masukkan Tinggi Tabung = ");
        int tinggi = readInt();
        VolumeTabung(diameter, tinggi);
        
        System.out.println("---------Luas Lingkaran---------");
        Praktikum_1 parent = new Praktikum_1();
        parent.hitungLuasLingkaran(10);
        System.out.println(parent.Luas_Lingkaran(20));
        
        System.exit(0);
    }
    
    /** 
     * Luas Persegi
     * Gambar 1
     * @param panjang
     * @param lebar 
     */
    
    public static void segiempat(int panjang, int lebar) {
        double luas, keliling;
       
        luas = panjang * lebar;
        
        System.out.println("---------Luas Segiempat---------");
        System.out.println("Panjang Segi Empat = "+ panjang);
        System.out.println("Lebar Segi Empat = "+ lebar);
        System.out.println("Luas Segi Empat = "+ luas);
    }
    
    /**
     * Input Konsol
     * Gambar 2
     * @return 
     */

    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        try {
            string = bfr.readLine();
        } catch (IOException e) {
            System.out.println(e);
        } 
        
        return string;
    }
    
    public static int readInt() {
        return Integer.parseInt(readString());
    }
    
    public static double readDouble() {
        return Double.parseDouble(readString());
    }
    
    /**
     * baca Konsol
     * gambar 3
     */
    
    public static void bacaKonsol() {
        System.out.print("data 1 = ");
        int data1 = readInt();
        System.out.println("data 2 = ");
        int data2 = readInt();
        
        int data3 = data1+data2;
        System.out.println("data1 + data2 = "+data3);
    }
    
    
    
    /**
     * Volume Tabung
     * @param radius
     * @param tinggi 
     */
    
    public static void VolumeTabung(int radius, int tinggi) {
         double phi = Math.PI, hasil;
         
         hasil = phi * Math.pow(radius, 2) * tinggi;
         
         System.out.println("Phi = "+ phi);
         System.out.println("Radius = "+ radius);
         System.out.println("Tinggi = "+ tinggi);
         System.out.println("Volume Tabung = "+ ((int) hasil));
    }
    
    public double Luas_Lingkaran(int diameter) {
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public void hitungLuasLingkaran(int jari2) {
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }
    
}
