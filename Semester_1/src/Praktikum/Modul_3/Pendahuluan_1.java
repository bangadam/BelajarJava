package Praktikum.Modul_3;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bangadam
 */
public class Pendahuluan_1 {
    public static void main(String[] args) throws IOException {
        String nama;
        String nim;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in)
        );
         
        try {
            System.out.print("Masukkan nama anda : ");
            nama = input.readLine();
            System.out.println("================");
            System.out.print("Masukkan nim anda : ");
            nim = input.readLine();
        } catch (IOException e) {
            System.out.println("Error !");
        }
        
    }
}
