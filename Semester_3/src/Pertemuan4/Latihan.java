package Pertemuan4;

public class Latihan {
    private int[][] data;
    private int[][] penjumlahan;
    private String[][] index;
    private String[][] ganjilGenap;

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }
    
    public void setPenjumlahan(int[][] data, int nilaiJumlah) {
        penjumlahan = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                penjumlahan[i][j] = data[i][j] + nilaiJumlah;
            }
        }
    }

    public String[][] getIndex() {
        return index;
    }

    public void setIndex(int[][] data) {
        index = new String[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                index[i][j] = "Angka "+data[i][j]+" pada baris "+i+" Kolom "+j ;
            }
        }
    }

    public String[][] getGanjilGenap() {
        return ganjilGenap;
    }

    public void setGanjilGenap(int[][] data) {
        String ganjil = "Ganjil", genap = "Genap";
        ganjilGenap = new String[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] % 2 == 1) {
                    ganjilGenap[i][j] = "Angka "+ data[i][j]+" Bilangan "+ganjil;
                } else if(data[i][j] % 2 == 0) {
                    ganjilGenap[i][j] = "Angka "+ data[i][j]+" Bilangan "+genap;
                }
            }
        }
    }

    public void cetak(String a) {
        System.out.print(a);
    }
    
    public void cetak(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                cetak(data[i][j]+" ");
            }
            cetak("\n");
        }
    }

    public void cetak(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                cetak(data[i][j]+" \n");
            }
        }
    }
}
