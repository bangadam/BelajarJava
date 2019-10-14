package LatihanUTS;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kampus extends Mahasiswa {

    public void cetak(int a) {
        System.out.print(a);
    }

    public void prosesInsert() {
        while (true) {
                cetak("Ingin menambah data mahasiswa ? y/t = ");
                String result = null;
                result = inputJoption("");

                Kampus kampus = new Kampus();

                if (result.equals("y")) {
                    cetak("Nim : ");
                    kampus.setNim(inputJoption("Masukkan Nim"));

                    cetak("Nama : ");
                    kampus.setNama(inputJoption("Masukkan Nama"));

                    cetak("Alamat : ");
                    kampus.setAlamat(inputJoption("Masukkan Alamat"));

                    cetak("Jurusan : ");
                    kampus.setJurusan(inputJoption("Masukkan jurusan"));

                    tampilDataMahasiswa(kampus); // tampil data mahasiswa

                } else if(result.equals("t")) {
                    System.exit(1);
                }
        }
    }

    public void tampilDataMahasiswa(Kampus kampus) {
        cetak("Nim = "+ kampus.getNim()+ "\n");
        cetak("Nama = "+ kampus.getNama() + "\n");
        cetak("Alamat = "+ kampus.getAlamat()+ "\n");
        cetak("Jurusan = "+ kampus.getJurusan()+ "\n");
    }

    public String inputString() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.readLine();
    }

    public int inputInteger() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.read();
    }

    public String inputJoption(String a) {
        String hasil = JOptionPane.showInputDialog(a);
        return hasil;
    }


}
