package Pertemuan4;

public class Latihan {
    private int[][] data;
    private int[][] oldData;
    private String[][] dataString;

    public int[][] getData() {
        return data;
    }

    public int[][] getOldData() {
        return oldData;
    }

    public void setOldData(int[][] oldData) {
        this.oldData = oldData;
    }

    public void setData(int[][] data) {
        this.data = data;
        data = null;
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
            cetak("\n");
        }
    }

    public void prosesPenjumlahan(int[][] array, int angka) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oldData[i][j] = array[i][j] + angka;
            }
        }
    }

    public String[][] getDataString() {
        return dataString;
    }

    public void prosesCariIndex(int[][] data) {
        dataString = new String[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                dataString[i][j] = "Angka "+data[i][j]+" pada baris "+i+" Kolom "+j;
            }
        }
    }

    public void prosesGanjilGenap(int[][] data) {
        final String ganjil = "Ganjil";
        final String genap = "Genap";

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] % 2 == 1) {
                    dataString[i][j] = "angka "+data[i][j]+" Bilangan "+ganjil;
                } else if(data[i][j] % 2 == 0) {
                    dataString[i][j] = "angka "+data[i][j]+" Bilangan "+genap;
                }
            }
        }
    }
}
