package Pertemuan4;

public class MainLatihan {
    public static void main(String[] args) {
        int[][] data = {
                {1,2,3},
                {4,5,6}
        };

        Latihan test = new Latihan();
        test.setData(data);
        test.setOldData(data.clone());

        int angkaUntukPenjumlahan = 3;

        // =========NOMOR 1 ==========//
        // proses penjumlahan
        test.cetak("Sebelum di jumlah = \n");
        test.cetak(test.getData());
        test.prosesPenjumlahan(test.getData(), angkaUntukPenjumlahan);
        test.cetak("Sesudah di jumlah = \n");
        test.cetak(test.getData());
        test.cetak("===============================\n");

        // =========NOMOR 2 ========//
        test.prosesCariIndex(test.getOldData());
        test.cetak(test.getDataString());
        test.cetak("===============================\n");

        // =========NOMOR 3 ========//
        test.prosesGanjilGenap(test.getOldData());
        test.cetak(test.getDataString());
        test.cetak("===============================\n");
    }
}
