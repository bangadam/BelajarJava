package Pertemuan4;

public class innamain {
    public static void main(String[] args) {
        inna ob = new inna();
        ob.cetak("Sebelum dijumlah \n");
        int angka[][] = {
                {1,2,3},
                {4,5,6}
        };
        int jumlah = 3;
        ob.setAngka(angka);
        ob.cetak(ob.getAngka());
        ob.cetak("setelah dijumlah \n");
        ob.setPenjumlahan(angka, 3);
        ob.cetak(ob.getPenjumlahan());
        ob.setGanjilgenap(ob.getAngka());
        ob.cetak(ob.getGanjilgenap());
    }
}
