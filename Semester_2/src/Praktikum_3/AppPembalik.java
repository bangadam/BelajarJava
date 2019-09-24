package Praktikum_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppPembalik {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // soal a
        System.out.println(">> katanya ...");
        String kata = "kasur";

        int size = kata.length();

        Pembalik pembalik = new Pembalik();

        // memanggil method dari class pembalik
        System.out.println(">> dibalik jadi ...");
        System.out.println(pembalik.PembalikKata(size, kata));


        // Soal B
        while (true) {
            System.out.print("Masukkan Kata : ");
            kata = input.readLine();

            size = kata.length();

            pembalik = new Pembalik();

            // memanggil method dari class pembalik
            System.out.print("Kebalikan : ");
            System.out.println(pembalik.PembalikKata(size, kata));
        }
    }
}
