package Modul_2;

public class Barang {
    private String nama;
    private int stok;
    private double harga_satuan, total, harga_per_barang;

    public Barang() {

    }

    public Barang(String a) {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double harga_per_barang) {
        this.total += harga_per_barang;
    }

    public double getHarga_per_barang() {
        return harga_per_barang = this.harga_per_barang = this.stok * this.harga_satuan;
    }

    public void cetak() {
        System.out.println("asa");
    }

    public void cetak(String a) {
        System.out.println(a);
    }

}
