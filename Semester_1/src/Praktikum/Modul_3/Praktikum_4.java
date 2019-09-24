package Praktikum.Modul_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bangadam
 */
public class Praktikum_4 {
    public static void main(String[] args) throws IOException{
        String nilai_semua[] = new String[4], grade1, grade2, 
                mahasiswa1 = null, mahasiswa2 = null;
        int nilai = 0;
        int nilai_akhir[] = new int[4];
        int max = 0, min = 100;
        String siswa[] = {"Adi", "Budi", "Caca", "Deny"};
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa " + siswa[i] + " = ");
            nilai = Integer.parseInt(read.readLine());
            
            nilai_akhir[i] = nilai;
        }
        for (int i = 0; i < nilai_akhir.length; i++) {
            if (nilai_akhir[i] > max) {
                max = nilai_akhir[i];
                mahasiswa1 = siswa[i];
            }else if(nilai_akhir[i] < min) {
                min = nilai_akhir[i];
                mahasiswa2 = siswa[i];
            }
            
        }
        
            if (max <= 36 || max <= 45) {
                grade1 = "D";
            }else if(max >=46 && max <= 55) {
                grade1 = "C";
            }else if(max >= 56 && max <= 65) {
                grade1 = "C+";
            }else if(max >= 66 && max <= 75) {
                grade1 = "B";
            }else if(max >= 76 && max <= 85) {
                grade1 = "B+";
            }else {
                grade1 = "A";
            }
            
            if (min <= 36 || min <= 45) {
                grade2 = "D";
            }else if(min >=46 && min <= 55) {
                grade2 = "C";
            }else if(min >= 56 && min <= 65) {
                grade2 = "C+";
            }else if(min >= 66 && min <= 75) {
                grade2 = "B";
            }else if(min >= 76 && min <= 85) {
                grade2 = "B+";
            }else {
                grade2 = "A";
            }

        JOptionPane.showMessageDialog(null, "Nilai terbesar adalah "
                +mahasiswa1 +" "+ max + " Grade = " +grade1);
        JOptionPane.showMessageDialog(null, "Nilai terkecil adalah "
                +mahasiswa2 +" "+ min + " Grade = "+grade2);
    }
}