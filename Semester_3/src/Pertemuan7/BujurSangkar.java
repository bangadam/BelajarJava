package Pertemuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BujurSangkar {
    private int sisi, luasBujurSangkar;

    public BujurSangkar() {
        Session.cekStatusLogin();
        tampil();
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getLuasBujurSangkar() {
        return luasBujurSangkar;
    }

    public void setLuasBujurSangkar() {
        this.luasBujurSangkar = sisi * sisi;
    }

    protected void tampil() {
        Session.pembatas();
        System.out.println("Hello ("+Session.getUsername()+") "+Session.getNama());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sisi;
        System.out.println("Menghitung luas bujur sangkar ");
        System.out.print("Sisi = ");
        try {
            sisi = Integer.parseInt(br.readLine());
            setSisi(sisi);
            setLuasBujurSangkar();
            System.out.println("Luas bujur sangkar = "+ getLuasBujurSangkar());

            new Menu();
            br = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
