package UTSTeori;

public class datainna {
    private String[] peserta, kunciJawaban;
    private String[][] LJU;
    private int[] point;
    private double[] nilaiAkhir;

    public String[] getPeserta() {
        return peserta;
    }

    public void setPeserta(String[] peserta) {
        this.peserta = peserta;
    }

    public String[] getKunciJawaban() {
        return kunciJawaban;
    }

    public void setKunciJawaban(String[] kunciJawaban) {
        this.kunciJawaban = kunciJawaban;
    }

    public String[][] getLJU() {
        return LJU;
    }

    public void setLJU(String[][] LJU) {
        this.LJU = LJU;
    }

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }

    public double[] getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double[] nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
}
