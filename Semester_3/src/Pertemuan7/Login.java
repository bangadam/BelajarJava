package Pertemuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    protected Login() {
        tampil();
    }

    protected void tampil() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String username, password;

        try {
            System.out.print("Username anda : ");
            username = br.readLine();
            System.out.print("Password anda : ");
            password = br.readLine();

            Session.setStatusLogin(username, password);

            if (Session.getStatusLogin() == "aktif") {
                new Menu();
            } else {
                Session.pembatas();
                System.out.println("Masukkan username dan password anda dengan benar");
                tampil();
            }

            username = null;
            password = null;
            br = null;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
