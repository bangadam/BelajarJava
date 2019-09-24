package Modul_3;

public class MainProgram2 {
    public static void main(String[] args) {
        int data[] = {2,5,3,5,9,5};

        DataArray2 objek = new DataArray2();


        //=============NOMOR 1==================//
        // mengisi data array
        objek.setData(data);

        // nilai yang akan di ubah
        int nilaiYangDiubah = 5;
        objek.setNilaiYangDiubah(nilaiYangDiubah);

        // nilai pengubahnya
        int nilaiPengubah = 1;
        objek.setNilaiPengubah(nilaiPengubah);

        // proses pengubahan
        objek.cetak("Before = ", objek.getData());
        objek.prosesUbah(objek.getData(), objek.getNilaiYangDiubah(), objek.getNilaiPengubah());
        objek.cetak("After = ", objek.getData());


        //=============NOMOR 2=================//
        // Proses perkalian
        double nilaiPengkali = 0.5;
        objek.setNilaiPengkali(nilaiPengkali);
        objek.setProsesPerkalian(objek.getData(), objek.getNilaiPengkali());
        objek.cetak("Hasil = ", objek.getProsesPerkalian());
    }
}
