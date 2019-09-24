package Modul_3;

public class DataArray2 {
    private int[] data;
    private int nilaiYangDiubah;
    private int nilaiPengubah;
    private double nilaiPengkali;
    private double[] data2 = new double[6];

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getNilaiPengubah() {
        return nilaiPengubah;
    }

    public void setNilaiPengubah(int nilaiPengubah) {
        this.nilaiPengubah = nilaiPengubah;
    }

    public void cetak(String a, int[] data) {
        System.out.print(a);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
    }

    public int getNilaiYangDiubah() {
        return nilaiYangDiubah;
    }

    public void setNilaiYangDiubah(int nilaiYangDiubah) {
        this.nilaiYangDiubah = nilaiYangDiubah;
    }

    public void prosesUbah(int[] data, int nilaiYangDiubah, int nilaiPengubah) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiYangDiubah) {
                data[i] = nilaiPengubah;
            }
        }
    }

    public double getNilaiPengkali() {
        return nilaiPengkali;
    }

    public void setNilaiPengkali(double nilaiPengkali) {
        this.nilaiPengkali = nilaiPengkali;
    }

    public void setProsesPerkalian(int[] data, double nilaiPengkali) {
        for (int i = 0; i < data.length; i++) {
            data2[i] = data[i] * nilaiPengkali;
        }
    }

    public double[] getProsesPerkalian() {
        return data2;
    }


    public void cetak(String a, double[] data) {
        System.out.print(a);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
    }
}
