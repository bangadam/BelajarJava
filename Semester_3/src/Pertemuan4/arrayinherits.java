package Pertemuan4;

public class arrayinherits {
    private String judul, aktor, sutradara, publisher , kategori;
    private int stok;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
        if (kategori.equals("SU")){
            this.kategori =  "Semua Umur";
        }else if(kategori.equals("D")){
            this.kategori = "Dewasa";
        }else if(kategori.equals("R")) {
            this.kategori = "Remaja";
        }else if(kategori.equals("A")) {
            this.kategori = "anak anak";
        }
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
