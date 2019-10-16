package Pertemuan7;

public class Session {
    private static String username, nama, statusLogin;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getStatusLogin() {
        return statusLogin;
    }

    public static void setStatusLogin(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            Session.statusLogin = "aktif";
            setUsername(username);
            setNama("Bang adam");
        }

        username = null;
        password = null;
    }

    public static void cekStatusLogin() {
        if (Session.getStatusLogin() != "aktif".toString()) {
            System.out.println("oke");
            System.exit(0);
        }
    }

    public static void pembatas() {
        System.out.println("===========================");
    }

    public static void logout() {
        username = null;
        nama = null;
        statusLogin = null;
        System.out.println("Anda berhasil logout");
        System.exit(0);
    }

}
