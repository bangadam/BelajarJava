package Modul_6;

public class mainmotor {
    public static void main(String[] args) {
        String pemilik = "Ahmad Afif";
        String merk = "Honda";
        String warna = "Merah";

        modul6.setPemilik(pemilik);
        System.out.println("Pemillik Kendaraan = " + modul6.getPemilik());
        System.out.println("===========================================");

        modul6 ob = new modul6(merk);
        ob.tampil("Merk Kendaraan = " +ob.getMerk());
        ob.tampil("Pemilik Kendraan = " +ob.getPemilik());
        System.out.println("=========================================");

        modul6 ob2 = new modul6(merk);
        ob2.tampil("Merk Kendaraan (instant variabel) = " +ob2.getMerk());
        ob2.tampil("Pemilik Kendraan (static variabel) = " +ob2.getPemilik());
        System.out.println("=========================================");

        motor ob3 = new motor(merk, warna);
        ob.tampil("Merk Kendaraan = " +ob3.getMerk());
        ob.tampil("Warna Motor = " +ob3.getWarna());
        ob.tampil("Pemilik Kendraan = " +ob3.getPemilik());
        System.out.println("=========================================");
    }
}
