package Praktikum.Modul_4;

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Praktikum_5 {
    public static void main(String[] args) {
        String angka;
        int n;
        
        System.out.println("======Segitiga Pertama========");
        angka = JOptionPane.showInputDialog("Masukkan Angka yang anda inginkan :");
        n = Integer.parseInt(angka);
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("======Segitiga Kedua========");
        angka = JOptionPane.showInputDialog("Masukkan Angka yang anda inginkan :");
        n = Integer.parseInt(angka);
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
                System.out.print("\t");
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
