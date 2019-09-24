package Praktikum_1;

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
        System.out.println();
    }

    public long getNim() {

        return nim;

    }
}
