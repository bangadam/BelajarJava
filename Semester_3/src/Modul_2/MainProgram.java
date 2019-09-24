package Modul_2;

public class MainProgram {
    public static void main(String[] args) {
        Barang barang = new Barang();

        // Data ke-1
        barang.setNama("Bolpoint");
        barang.setStok(10);
        barang.setHarga_satuan(2000);
        cetak(barang);

        // Data ke-1
        barang.setNama("Bolpoint");
        barang.setStok(10);
        barang.setHarga_satuan(2000);
        barang.setTotal(barang.getHarga_per_barang());
        cetak(barang);

        // Data ke-1
        barang.setNama("Pensil");
        barang.setStok(10);
        barang.setHarga_satuan(1000);
        barang.setTotal(barang.getHarga_per_barang());
        cetak(barang);

        // Data ke-1
        barang.setNama("Penghapus");
        barang.setStok(10);
        barang.setHarga_satuan(500);
        barang.setTotal(barang.getHarga_per_barang());
        cetak(barang);

        cetakTotal(barang);
    }

    public static void cetak(Barang barang) {
        System.out.println("Nama alat tulis : "+ barang.getNama());
        System.out.println("Stok : "+ barang.getStok());
        System.out.println("Harga satuan : "+ barang.getHarga_satuan());
        System.out.println("Harga "+ barang.getNama() +" : "+ barang.getHarga_per_barang());
        System.out.println();
    }

    public static void cetakTotal(Barang barang) {
        System.out.println("Total Harga : "+ barang.getTotal());
    }
}
