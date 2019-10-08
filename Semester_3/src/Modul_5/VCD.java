package Modul_5;

public class VCD {
    private String judul_film;
    private String aktor;
    private String sutradara;
    private String publisher;
    private String kategori;
    private String stok;

    protected String getJudul_film() {
        return judul_film;
    }

    protected void setJudul_film(String judul_film) {
        this.judul_film = judul_film;
    }

    protected String getAktor() {
        return aktor;
    }

    protected void setAktor(String aktor) {
        this.aktor = aktor;
    }

    protected String getSutradara() {
        return sutradara;
    }

    protected void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    protected String getPublisher() {
        return publisher;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected String getKategori() {
        return kategori;
    }

    protected void setKategori(String kategori) {
        this.kategori = kategori;
    }

    protected String getStok() {
        return stok;
    }

    protected void setStok(String stok) {
        this.stok = stok;
    }

    protected void displayVcd() {
        System.out.println("Judul Film = "+ judul_film);
        System.out.println("Aktor = "+ aktor);
        System.out.println("Sutradara = "+ sutradara);
        System.out.println("Publisher = "+ publisher);
        System.out.println("Kategori = "+ kategori);
        System.out.println("Stok = "+ stok);
        System.out.println("=============================");
    }
}
