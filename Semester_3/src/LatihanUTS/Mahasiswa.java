package LatihanUTS;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    protected String getNim() {
        return nim;
    }

    protected void setNim(String nim) {
        this.nim = nim;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        switch (jurusan) {
            case "61":
                this.jurusan = "Matematika";
                break;
            case "62":
                this.jurusan = "Biology";
                break;
            case "63":
                this.jurusan = "Kimia";
                break;
            case "64":
                this.jurusan = "Fisika";
                break;
            case "65":
                this.jurusan = "Teknik Informatika";
                break;
            case "66":
                this.jurusan = "Teknik Arsitektur";
                break;
        }
    }

    public void cetak(String a) {
        System.out.println(a);
    }

}
