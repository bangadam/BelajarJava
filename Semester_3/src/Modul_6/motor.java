package Modul_6;

public class motor extends modul6 {
    private String warna;

    protected motor(String merk, String warna){
        super(merk);
        this.warna = warna;
        merk = null;
        warna = null;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    protected void hapus(){
        warna = null;
        super.hapus();
    }
}
