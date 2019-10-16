package Pertemuan4;

import javax.swing.*;

public class arrayinheritsayah extends arrayinherits {
    private arrayinherits[] vcd;
    private int nElemen;

    protected void proses(){
        while (true) {
            String tanya = JOptionPane.showInputDialog("apakah anda ingin menambah data? y/n");

            arrayinherits ob = new arrayinherits();
            if (tanya.equals("y")){
                String judul = JOptionPane.showInputDialog("judul = ");
                ob.setJudul(judul);
                String aktor = JOptionPane.showInputDialog("aktor = ");
                ob.setAktor(aktor);
                String sutradara = JOptionPane.showInputDialog("sutradara = ");
                ob.setSutradara(sutradara);
                String publisher = JOptionPane.showInputDialog("publisher = ");
                ob.setPublisher(publisher);
                String kategori = JOptionPane.showInputDialog("kategori = ");
                ob.setKategori(kategori);
                int stok = Integer.parseInt(JOptionPane.showInputDialog("stok = "));
                ob.setStok(stok);

                insert(ob);
            }
        }


    }
    protected void insert(arrayinherits data){
        vcd[nElemen] = data;
        nElemen++;
    }
    protected void setVcd(){
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah data = "));
        for (int i=0; i <jumlah; i++){

        }
    }

}
