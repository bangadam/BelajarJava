package Pertemuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    protected Menu() {
        Session.cekStatusLogin();
        tampil();
    }

    protected void tampil() {
        Session.pembatas();
        System.out.println("Hello ("+Session.getUsername()+") "+Session.getNama());
        System.out.println("Pilih salah satu : " +
                "\n1. Menghitung Luas bujur sangkar " +
                "\n2. Logout dan exit");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.print("Pilihan Anda : ");
        try {
            pilih = Integer.parseInt(br.readLine());
            switch (pilih) {
                case 1:
                    new BujurSangkar();
                case 2:
                    Session.logout();
                default:
                    Session.pembatas();
                    System.out.println("Masukkan pilihan menu dengan benar");
                    tampil();
            }
            br = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
