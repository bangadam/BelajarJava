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
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public void cetak(String a, int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+a+i);
        }
        System.out.println();
    }

    public void cetak(String)

    public void ubahNilai(int nilaiPenambah, int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] += nilaiPenambah;
        }
    }
}
