package Praktikum_2;

class Mahasiswa {

    private long nim;
    private String nama;
    private String asal;

    public Mahasiswa(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void displayMhs() {
        System.out.print("\tNim = "+ nim+" ");
        System.out.print(", Nama = "+ nama+" ");
        System.out.print(", Asal = "+ asal);
        System.out.println();
    }

    public long getNim() {

        return nim;

    }

    public String getNama() {
        return nama;
    }
}
