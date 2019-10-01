package Modul_4;

public class Matrix {
    private int[][] dataMatrik1;
    private int[][] dataMatrik2;
    private int[][] penjumlahan;
    private double[][] perkalian;

    public int[][] getDataMatrik1() {
        return dataMatrik1;
    }

    public void setDataMatrik1(int[][] dataMatrik1) {
        this.dataMatrik1 = dataMatrik1;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int[][] dataMatrik1, int[][] dataMatrik2) {
        penjumlahan = new int[dataMatrik1.length][dataMatrik1[0].length];
        for (int i = 0; i < penjumlahan.length; i++) {
            for (int j = 0; j < penjumlahan[i].length; j++) {
                penjumlahan[i][j] = dataMatrik1[i][j] + dataMatrik2[i][j];
            }
        }
    }

    public double[][] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int[][] data, double nilaiKali) {
        perkalian = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                perkalian[i][j] = data[i][j]*nilaiKali;
            }
        }
    }

    public void cetak(String a) {
        System.out.print(a);
    }

    public void cetak(int[][] dataMatrik) {
        for (int i = 0; i < dataMatrik.length; i++) {
            for (int j = 0; j < dataMatrik[i].length; j++) {
                cetak(dataMatrik[i][j]+" ");
            }
            cetak("\n");
        }
    }

    public void cetak(double[][] dataMatrik) {
        for (int i = 0; i < dataMatrik.length; i++) {
            for (int j = 0; j < dataMatrik[i].length; j++) {
                cetak(dataMatrik[i][j]+" ");
            }
            cetak("\n");
        }
    }

    public int[][] getDataMatrik2() {
        return dataMatrik2;
    }

    public void setDataMatrik2(int[][] dataMatrik2) {
        this.dataMatrik2 = dataMatrik2;
    }
    
    public void hapus(){
        dataMatrik1 = 0;
        dataMatrik2 = 0;
        penjumlahan = 0;
        perkalian = 0;
    }
}
