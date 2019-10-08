package Pertemuan5;

public class InheritanceBidangDatar {
    protected void cetak(String data) {
        System.out.println(data);
        data = null;
    }

    protected void keterangan() {
        System.out.println("Ini adalah Parent class");
    }
}
