package Modul_6;

import javax.swing.*;

public class data extends prak6 {
    private String nim, nama, alamat, jurusan;

    protected data() {

    }

    protected data(String univ, String nim, String nama, String alamat, String jurusan){
        super(univ);
        this.nim = nim;
        this.alamat = alamat;
        this.jurusan = jurusan;
        this.nama = nama;
    }

    protected String getNim() {
        return nim;
    }

    protected void setNim(String nim) {

        this.nim = nim;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {

        this.nama = nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getJurusan() {
        return jurusan;
    }

    protected void setJurusan(String jurusan) {
        if (jurusan.equals("61")){
            this.jurusan = "matematika";
        }else if(jurusan.equals("62")){
            this.jurusan = "bio";
        }else if(jurusan.equals("63")){
            this.jurusan = "kimia";
        }else if(jurusan.equals("64")){
            this.jurusan = "fisika";
        }else if(jurusan.equals("65")){
            this.jurusan = "teknik informatika";
        }else if(jurusan.equals("66")){
            this.jurusan = "arsitektur";
        }
    }
    protected void proses(){
        nim = JOptionPane.showInputDialog("masukkan nim = ");
        setNim(nim);
        nama = JOptionPane.showInputDialog("masukkan nama = ");
        setNama(nama);
        alamat = JOptionPane.showInputDialog("masukkan alamat = ");
        setJurusan(alamat);
        jurusan = JOptionPane.showInputDialog("masukkan jurusan = ");
        setJurusan(jurusan);
        String tanya = JOptionPane.showInputDialog("apakah ingin menambah data? y/n");
        if (tanya.equals("y")){
            proses();
        }else{
            display();
        }
    }
    protected void display(){
        System.out.println("nama Univ = "+ getUniv());
        System.out.println("nim = " +getNim());
        System.out.println("nama = " +getNama());
        System.out.println("alamat = " +getAlamat());
        System.out.println("jurusan = " +getJurusan());
    }
}
