package Modul_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalVCD extends VCD {
    private VCD[] vcd;
    private int nElemen;

    public VCD[] getVcd() {
        return vcd;
    }

    public void setVcd(int max) {
        this.vcd = new VCD[max];
        this.nElemen = 0;
    }

    public void insert(VCD dataVcd) {
        vcd[nElemen] = dataVcd;
        nElemen++;
    }

    public void cetak(String a) {
        System.out.print(a);
    }
    
    public void cetakDataVcd() {
        for (int i = 0; i < nElemen; i++) {
            vcd[i].displayVcd();
        }
    }

    public void prosesVcd() {
        while (true) {
            try {
                cetak("Ingin menambah data film ? ya / tidak ");
                String result = input();
                VCD vcd = new VCD();
                if (result.equals("ya")) {
                    cetak("Judul Film : ");
                    vcd.setJudul_film(input());

                    cetak("Aktor\t: ");
                    vcd.setAktor(input());

                    cetak("Sutradara\t: ");
                    vcd.setSutradara(input());

                    cetak("Publisher\t: ");
                    vcd.setPublisher(input());

                    cetak("Kategori\t: ");
                    vcd.setKategori(input());

                    cetak("Stok\t: ");
                    vcd.setStok(input());

                    insert(vcd);

                } else if (result.equals("tidak")) {
                    cetakDataVcd();
                    break;
                } else {
                    cetak("Input salah");
                }
            } catch (IOException e) {
                cetak(e.toString());
            }
        }
    }

    public String input() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.readLine();
    }
}