package Modul_6;

public class modul6 {
    private String merk;
    private static String pemilik;

    protected modul6(){
        merk = null;
    }
    protected modul6(String merk){
        this.merk = merk;
        merk = null;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected static String getPemilik() {
        return pemilik;
    }

    protected static void setPemilik(String pemilik) {
        modul6.pemilik = pemilik;
    }
    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }
    protected void hapus(){
        merk = null;
        pemilik = null;
    }
}
