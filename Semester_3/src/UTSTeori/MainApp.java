package UTSTeori;

public class MainApp extends Penilaian {

    public MainApp(int nilai100, int nilai30) {
        super(nilai100, nilai30);
    }

    public static void main(String[] args) {
        String peserta[] = {"p123", "p456", "p789", "p234"};
        String lju[][] = {
                {"C", "", "A", "D", ""},
                {"D", "B", "B", "", "C"},
                {"D", "E", "A", "B", "C"},
                {"D", "E", "D", "B", ""},
        };
        String kunciJawaban[] = {"D", "E", "A", "B", "C"};

        // nilai tetap untuk menghitung nilai akhir
        MainApp ob = new MainApp(100, 3);

        // inisialisasi data
        ob.setPeserta(peserta);
        ob.setLJU(lju);
        ob.setKunciJawaban(kunciJawaban);

        // program
        ob.cetak("Data Lembar Jawaban Ujian \n");
        ob.prosesTampilLju(ob.getPeserta(), ob.getLJU());
        ob.cetak(ob.getTempTampil());

        ob.cetak("Kunci Jawaban \n");
        ob.cetak(ob.getKunciJawaban());
        ob.cetak("\n");


        // proses hitung nilai akhir dan point
        ob.prosesNilaiPoint(ob.getLJU(), ob.getKunciJawaban());
        ob.prosesNilaiAkhir(ob.getPoint(), ob.getKunciJawaban());
        ob.cetak("jumlah point dan Nilai akhir \n");
        ob.cetak(ob.getPoint(), ob.getPeserta(), ob.getNilaiAkhir());

    }
}
