package Pertemuan_6;

public class ConsPersegeiParent {
    private int panjang;

    protected ConsPersegeiParent() {

    }

    protected ConsPersegeiParent(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    protected void cetak(String data) {
        System.out.println(data);
        data= null;
    }
}
