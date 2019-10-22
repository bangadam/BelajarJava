package SoalUTS;

public class Matrik {
    private int[][] matrik_a;
    private int[] cari;
    private String[] hasil;

    public int[][] getMatrik_a() {
        return matrik_a;
    }

    public void setMatrik_a(int[][] matrik_a) {
        this.matrik_a = matrik_a;
    }

    public int[] getCari() {
        return cari;
    }

    public void setCari(int[] cari) {
        this.cari = cari;
    }

    public String[] getHasil() {
        return hasil;
    }

    public void setHasil(int[][] matrik, int[] cari) {
        hasil = new String[cari.length];
        String result = "";
        int temp = 0;
        for (int i = 0; i < cari.length; i++) {
            for (int j = 0; j < matrik.length; j++) {
                for (int k = 0; k < matrik[j].length; k++) {
                    if (cari[i] == matrik[j][k]) {
                        if (cari[i] == temp) {
                            result = "Angka "+cari[i]+" terdapat pada baris "+j+" kolom "+k;
                        }
                        if(hasil[i] != null) {
                            result += ", baris "+j+" kolom "+k;
                        }
                    } else if(hasil[i] == null) {
                        result = "Angka "+cari[i]+" tidak ditemukan";
                    }
                }
                temp = cari[i];
                hasil[i] = result;
            }
        }
    }

    public void cetak(String a) {
        System.out.print(a);
    }

    public void cetak(int[][] matrik) {
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                cetak(matrik[i][j]+" ");
            }
            cetak("\n");
        }
    }

    public void cetak(String[] hasil) {
        for (int i = 0; i < hasil.length; i++) {
            cetak(hasil[i]+" \n");
        }
    }

    public void cetak(int[] cari) {
        for (int i = 0; i < cari.length; i++) {
            cetak(cari[i]+" ");
        }
    }
}
