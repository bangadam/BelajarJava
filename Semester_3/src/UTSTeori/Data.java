package UTSTeori;

public class Data {
    private String[] peserta;
    private String[][] LJU;
    private String[] kunciJawaban;

    public void setPeserta(String[] peserta) {
        this.peserta = peserta;
    }

    public void setLJU(String[][] LJU) {
        this.LJU = LJU;
    }

    public void setKunciJawaban(String[] kunciJawaban) {
        this.kunciJawaban = kunciJawaban;
    }

    public String[] getPeserta() {
        return peserta;
    }

    public String[][] getLJU() {
        return LJU;
    }

    public String[] getKunciJawaban() {
        return kunciJawaban;
    }
}
