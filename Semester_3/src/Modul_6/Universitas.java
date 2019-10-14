//package Modul_6;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Universitas extends Mahasiswa {
//
//    private String nama_universitas;
//
//    protected Universitas() {
//
//    }
//
//    protected Universitas(String nim, String nama, String alamat, String jurusan) {
//        super(nim, nama, alamat, jurusan);
//    }
//
//    protected void insert() {
//        while (true) {
//            cetak("Apakah anda ingin menambah data mahasiswa ? (y/t) = ");
//            String result = input();
//            if (result.equals("y")) {
//                insertData();
//                showDataMahasiswa();
//            } else if (result.equals("t")) {
//                System.exit(1);
//            } else {
//                cetak("Input salah !!! \n");
//                System.exit(1);
//            }
//        }
//    }
//
//    protected String input() {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            return input.readLine();
//        } catch (IOException e) {
//            return e.toString();
//        }
//    }
//
//    protected void showDataMahasiswa() {
//        cetak("\nNama Universitas\t = "+ getNama_universitas()+"\n");
//        cetak("=========DATA MAHASISWA========\n");
//        cetak("NIM\t = "+getNim()+"\n");
//        cetak("Nama\t = "+getNama()+"\n");
//        cetak("Alamat\t = "+getAlamat()+"\n");
//        cetak("Jurusan\t = "+getJurusan()+"\n");
//    }
//
//    protected void insertData() {
//        cetak("======Masukkan data mahasiswa======\n");
//
//        cetak("Masukkan nim = ");
//        String nim = input();
//        super.nim = nim;
//
//        cetak("Masukkan nama = ");
//        String nama = input();
//        super.nama =
//        cetak("Masukkan alamat = ");
//        String alamat = input();
//
//        cetak("Masukkan jurusan = ");
//        String jurusan = input();
//    }
//
//    protected void cetak(String a) {
//        System.out.print(a);
//    }
//
//    protected String getNama_universitas() {
//        return nama_universitas;
//    }
//
//    protected void setNama_universitas(String nama_universitas) {
//        this.nama_universitas = nama_universitas;
//    }
//}
