package Pertemuan4;

public class inna {
    private int[][] angka;
    private int[][] penjumlahan;
    private String[][] index;
    private String[][] ganjilgenap;

    public int[][] getAngka() {
        return angka;
    }

    public void setAngka(int[][] angka) {
        this.angka = angka;

    }
    public void cetak (int[][] a){

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                cetak(a[i][j]+" ");
            }
            cetak("\n");
        }
    }

    public void cetak (String[][] a){

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                cetak(a[i][j]+" \n");
            }
            cetak("\n");
        }
    }

    public String[][] getIndex() {
        return index;
    }

    public void setIndex(String[][] index) {
        this.index = index;
    }

    public String[][] getGanjilgenap() {
        return ganjilgenap;
    }

    public void setGanjilgenap(int[][] data1) {
        this.ganjilgenap = new String[data1.length][data1[0].length];
        for (int i=0; i < data1.length; i++){
            for (int j=0; j<data1[i].length; j++){
                if (data1[i][j]%2 == 1){
                    ganjilgenap[i][j] = "angka" + data1[i][j] + "termasuk bilangan ganjil";
                }else{
                    ganjilgenap[i][j] = "angka" + data1[i][j] + "termasuk bilangan genap";
                }
            }
        }
    }
    public void cetak(String a){
        System.out.print(a);
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int[][] data, int jumlah) {
        penjumlahan = new int[data.length][data[0].length];
        for (int i=0; i <data.length;i++){
            for (int j=0; j<data[i].length; j++){
                penjumlahan[i][j] = data[i][j]+jumlah;
            }
        }

    }
}
