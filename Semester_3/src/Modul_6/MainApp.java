package Modul_6;

public class MainApp extends Universitas {

    public MainApp() {
        super();
    }

    public static void main(String[] args) {
        MainApp ob = new MainApp();

        ob.cetak("Nama Universitas = ");
        String namaUniv = ob.input();
        ob.setNama_universitas(namaUniv);

        ob.insert();
    }
}
