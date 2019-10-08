package Modul_5;

import java.io.IOException;

public class MainRentalVcd extends RentalVCD {

    public static void main(String[] args) throws IOException {

        MainRentalVcd mainRentalVcd = new MainRentalVcd();
        mainRentalVcd.cetak("Berapa banyak data vcd yg akan di masukkan ? ");
        int jumlahVcd = Integer.parseInt(mainRentalVcd.input());
        mainRentalVcd.setVcd(jumlahVcd);

        mainRentalVcd.prosesVcd();
    }
}
