package Pertemuan5;

public class InheritancePersegiPanjang extends InheritanceBidangDatar {
    private int panjang, lebar, luas;

    protected int getPanjang() {
        return panjang;
    }

    protected void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    protected int getLebar() {
        return lebar;
    }

    protected void setLebar(int lebar) {
        this.lebar = lebar;
    }

    protected int getLuas() {
        return luas;
    }

    protected void setLuas(int panjang, int lebar) {
        this.luas = panjang * lebar;
    }
}
