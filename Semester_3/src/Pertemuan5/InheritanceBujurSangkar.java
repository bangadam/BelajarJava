package Pertemuan5;

public class InheritanceBujurSangkar extends InheritanceBidangDatar {
    private int sisi, luas;

    protected int getSisi() {
        return sisi;
    }

    protected void setSisi(int sisi) {
        this.sisi = sisi;
    }

    protected int getLuas() {
        return luas;
    }

    protected void setLuas(int luas) {
        this.luas = luas;
    }

    protected void keterangan() {
        System.out.println("Ini adalah child class");
    }

    protected void keterangan_parent() {
        super.keterangan();
    }
}
