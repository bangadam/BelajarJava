/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) throws IOException {
        // masukkan jumlah element array
        BufferedReader input = 
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Jumlah Element Array = ");
        
        int jumlah_element;
        
        jumlah_element = Integer.parseInt(input.readLine());
        
        int data[] = new int[jumlah_element];
        // memasukkan ju
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("["+i+"] = ");
            data[i] = Integer.parseInt(input.readLine());
        }
        
        // tampilkan nilai terbesar dan terkecil
        int max = 0, min = 1000; // buat perbandingan
        int index_max=0, index_min=0; // buat meyimpan index
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                index_max = i;
            }
            
            if (data[i] < min) {
                min = data[i];
                index_min = i;
            }
        }
        
        System.out.println(
                "Nilai Terbesar pada Array = ["+index_max+"] => "+max);
        
        System.out.println(
                "Nilai Terkecil pada Array = ["+index_min+"] => "+min);
        
        
        // Menjumlahkan Semua Data Array
        int total = 0;
        
        for (int i = 0; i < data.length; i++) {
            total+=data[i];
        }
        
        System.out.println("Total Jumlah Semua Data Array = "+total);
        System.out.println(
                "Rata-Rata Jumlah Semua Data Array = "+(total/=data.length));
        
        // variable total di nol kan lagi
        total = 0;
        
        // Menjumlahkan Semua Element index Genap
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index ["+i+"] => "+data[i]);
                total += data[i];
            }
        }
        System.out.println("----------------------+");
        System.out.println("Total jumlah Ber-Index Genap = "+total);
        
        // Cek Total Ber-index ganjil apakah ganjil atau genap 
        if (total%2==0) {
            System.out.println(total+" Adalah Bilangan Genap");
        } else if(total%2 ==1) {
            System.out.println(total+" Adalah Bilangan Ganjil");
        } else {
            System.out.println("Error Bosque");
        }
        
        // Mengurutkan Data Array
        Arrays.sort(data);
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+",");
        }
    }
}
