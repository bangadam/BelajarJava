package UTSTeori;

public class Penilaian extends Data {
    private String hasil[][];
    private static int nilai100;
    private static int nilai3;
    private int[] point;
    private double[] nilaiAkhir;

    private String tempTampil[];

    public Penilaian(int nilai100, int nilai30) {
        Penilaian.nilai100 = nilai100;
        Penilaian.nilai3 = nilai30;
    }

    public static int getNilai100() {
        return nilai100;
    }

    public static void setNilai100(int nilai100) {
        Penilaian.nilai100 = nilai100;
    }

    public static int getNilai3() {
        return nilai3;
    }

    public static void setNilai3(int nilai30) {
        Penilaian.nilai3 = nilai30;
    }

    public String[][] getHasil() {
        return hasil;
    }

    public void setHasil(String[][] hasil) {
        this.hasil = hasil;
    }

    public String[] getTempTampil() {
        return tempTampil;
    }

    protected void cetak(String a) {
        System.out.print(a);
    }

    protected void cetak(int[] point, String[] peserta, double[] nilaiAkhir) {
        for (int i = 0; i < point.length; i++) {
            cetak(peserta[i] + " "+ point[i] + " "+ nilaiAkhir[i] +"\n");
        }

    }

    protected void cetak(String[] data) {
        for (int i = 0; i < data.length; i++) {
            cetak(data[i]+ "\n");
        }
    }

    protected void prosesTampilLju(String[] peserta, String[][] lju) {
        tempTampil = new String[peserta.length];
        String result = "";
        for (int i = 0; i < peserta.length; i++) {
            result = peserta[i] +"\t";
                for (int k = 0; k < lju[i].length; k++) {
                    if (lju[i][k].isEmpty()) {
                        result += "- ";
                    } else {
                        result += lju[i][k] +" ";
                    }
                }
            tempTampil[i] = result;
        }
    }

    protected void prosesNilaiPoint(String[][] lju, String[] kunciJawaban) {
        point = new int[tempTampil.length];

        for (int i = 0; i < lju.length; i++) {
            for (int j = 0; j < lju[i].length; j++) {
                if (lju[i][j].equals(kunciJawaban[j])) {
                    point[i] += 3;
                } else if(lju[i][j].isEmpty()) {
                    point[i] += 0;
                } else if (lju[i][j] != kunciJawaban[j]) {
                    point[i] -= 1;
                }
            }
        }
    }

    protected void prosesNilaiAkhir(int[] point, String[] kunciJawaban) {
        nilaiAkhir = new double[tempTampil.length];

        for (int i = 0; i < point.length; i++) {
            nilaiAkhir[i] = (Double.parseDouble(String.valueOf(point[i])) * getNilai100()) / (kunciJawaban.length * getNilai3());
        }
    }

    public int[] getPoint() {
        return point;
    }

    public double[] getNilaiAkhir() {
        return nilaiAkhir;
    }
}
