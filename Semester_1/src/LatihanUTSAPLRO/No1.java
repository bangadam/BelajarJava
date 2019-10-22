package LatihanUTSAPLRO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1 {
    public static void main(String[] args) throws IOException {
        String tipe_pelanggan = "";
        String jawaban = "";

        do {
            // input niai
            BufferedReader input =
                    new BufferedReader(new
                            InputStreamReader(System.in));

            System.out.println("Apakah pelanggan baru atau lama ? (baru/lama)");
            tipe_pelanggan = input.readLine(); // menyimpan nilai tipe pel

            // pelanggan lama
            if (tipe_pelanggan.equals("lama")) {
                System.out.print("Jumlah fotokopi");
                int jumlah = Integer.parseInt(input.readLine());
                int harga = 75;
                int hasil = harga*jumlah;

                System.out.println("Jumlah fotokopi = "+jumlah);
                System.out.println("Total harga = "+hasil);
            } else if(tipe_pelanggan.equals("baru")){
                System.out.print("Jumlah fotokopi");
                int jumlah = Integer.parseInt(input.readLine());
                int harga = 0;

                // percabangan untuk mendapatkan harga
                if (jumlah < 100) {
                    harga = 150;
                } else if (jumlah <= 200) {
                    harga = 100;
                } else if(jumlah > 200) {
                    harga = 80;
                }

                int hasil = jumlah*harga;

                System.out.println("Jumlah fotokopi = "+jumlah);
                System.out.println("Dapat harga = "+harga);
                System.out.println("total harga = "+hasil);
            }

            System.out.print("Coba lagi ? (y/t) ");

        } while (jawaban.equals("y"));
    }
}
