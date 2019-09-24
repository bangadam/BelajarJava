package Pertemuan3;

public class DataLatihan1 {
    private int[] data;
    private int nilaiPenambah;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getNilaiPenambah() {
        return nilaiPenambah;
    }

    public void setNilaiPenambah(int nilaiPenambah) {
        this.nilaiPenambah = nilaiPenambah;
    }

    public void cetak(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public void cetak(String a, int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+a+i);
        }
        System.out.println();
    }

    public void ganjilGenap(String a, int[] data) {
        String ganjil = "Ganjil", genap = "Genap";

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1){
                System.out.println(data[i]+a+ganjil);
            } else if(data[i] % 2 == 0) {
                System.out.println(data[i]+a+genap);
            }
        }
    }

    public void ubahNilai(int nilaiPenambah, int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] += nilaiPenambah;
        }
    }
}
