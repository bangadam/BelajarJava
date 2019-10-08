package Pertemuan4;

public class MainLatihan {
    public static void main(String[] args) {
        int[][] data = {
                {1,2,3},
                {4,5,6}
        };

        Latihan test = new Latihan();
        test.setData(data);

        test.cetak("=================\n");
        test.cetak("Sebelum di jumlah\n");
        test.cetak(test.getData());
        int nilai = 3;
        test.cetak("Setelah di jumlah\n");
        test.setPenjumlahan(test.getData(), 3);
        test.cetak(test.getPenjumlahan());

        test.cetak("=================\n");
        test.setIndex(test.getData());
        test.cetak(test.getIndex());

        test.cetak("=================\n");
        test.setGanjilGenap(test.getData());
        test.cetak(test.getGanjilGenap());
    }
}
