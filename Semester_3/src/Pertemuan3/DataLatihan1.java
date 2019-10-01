package Pertemuan3;

public class DataLatihan1 {
    private int[] data, oldData;
    private String[] dataIndex;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
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

    public void cetak(String[] dataIndex) {
        for (int i = 0; i < dataIndex.length; i++) {
            System.out.println(dataIndex[i]);
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
        oldData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            oldData[i] = data[i];
            data[i] += nilaiPenambah;
        }
    }

    public String[] getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(int[] bilangan) {
        String angka, indeks, kata;
        dataIndex = new String[bilangan.length];
        for (int i = 0; i < bilangan.length; i++) {
            angka = Integer.toString(bilangan[i]);
            indeks = Integer.toString(i);
            kata = angka + " terdapat pada index " + indeks;
            this.dataIndex[i] = kata;
        }
    }

    public int[] getOldData() {
        return oldData;
    }

    public void setOldData(int[] oldData) {
        this.oldData = oldData;
    }
}
