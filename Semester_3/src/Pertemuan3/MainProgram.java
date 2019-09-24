package Pertemuan3;

public class MainProgram {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};

        DataLatihan1 test = new DataLatihan1();

        test.setData(data);
        test.setNilaiPenambah(5);

        test.ubahNilai(test.getNilaiPenambah(), test.getData());

        test.cetak(test.getData());

        test.cetak(" terdapat pada index ke ", test.getData());

        test.ganjilGenap(" adalah bilangan ", test.getData());
    }
}
