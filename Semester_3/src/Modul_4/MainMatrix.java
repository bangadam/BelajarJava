package Modul_4;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] dataMatrik1 = {
                {1,2},
                {3,5},
                {6,7}
        };
        int[][] dataMatrik2 = {
                {8,9},
                {10,11},
                {12,13}
        };

        // inisialisasi data matrik
        Matrix matrix = new Matrix();
        matrix.setDataMatrik1(dataMatrik1);
        matrix.cetak("Matrik 1 \n");
        matrix.cetak(matrix.getDataMatrik1());

        matrix.setDataMatrik2(dataMatrik2);
        matrix.cetak("Matrik 2 \n");
        matrix.cetak(matrix.getDataMatrik2());

        // proses penjumlahan
        matrix.cetak("Setelah di jumlahkan \n");
        matrix.setPenjumlahan(matrix.getDataMatrik1(), matrix.getDataMatrik2());
        matrix.cetak(matrix.getPenjumlahan());

        // proses perkalian
        matrix.cetak("Setelah dikalikan \n");
        double nilaiKali = 0.5;
        matrix.setPerkalian(matrix.getPenjumlahan(), nilaiKali);
        matrix.cetak(matrix.getPerkalian());
        

        dataMatrik1 = null;
        dataMatrik2 = null;
    }
}
