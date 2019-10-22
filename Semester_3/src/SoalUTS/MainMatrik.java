package SoalUTS;

public class MainMatrik extends Matrik {
    public static void main(String[] args) {
        MainMatrik ob = new MainMatrik();
        int[][] matrik_a = {{1,2,3,4,5}, {3,4,5,6,7}};
        int[] cari = {8,3,9,5,10};

        ob.setMatrik_a(matrik_a);
        ob.setCari(cari);
        ob.setHasil(matrik_a, cari);

        ob.cetak("Matrik A \n");
        ob.cetak(matrik_a);

        ob.cetak("Nilai yang dicari \n");
        ob.cetak(cari);

        ob.cetak("\n");

        ob.cetak(ob.getHasil());
    }
}
