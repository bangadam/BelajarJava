/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_6;

/**
 *
 * @author bangadam
 */
public class Praktikum_3 {
    public static void main(String[] args) {
        String data[][] = {
            {"ABDUL", "Kediri", "085646668991"},
            {"KUSNO", "Trenggalek", "085646668992"},
            {"PONIRAN", "Bojonegoro", "085646668999"}
        };
       
        System.out.println("------------------------------------------------------------------");
        System.out.println("   Nama\t\t\t    Alamat\t\t   Telepon");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("|  "+data[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }
}
