//package Modul_6;
//
//public class Mahasiswa {
//    protected String nim;
//    protected String nama;
//    protected String alamat;
//    protected String jurusan;
//
//    protected Mahasiswa() {
//
//    }
//
//    protected Mahasiswa(String nim, String nama, String alamat, String jurusan) {
//        this.nim = nim;
//        this.nama = nama;
//        this.alamat = alamat;
//
//        // jurusan input
//        this.jurusan = setJurusan(jurusan);
//    }
//
//    private String setJurusan(String jurusan) {
//        switch (jurusan) {
//            case "61":
//                return "MATEMATIKA";
//            case "62":
//                return "BIOLOGI";
//            case "63":
//                return "KIMIA";
//            case "64":
//                return "FISIKA";
//            case "65":
//                return "TEKNIK INFORMATIKA";
//            case "66":
//                return "TEKNIK ARSITEKTUR";
//            default:
//                return "KODE JURUSAN TIDAK DITEMUKAN";
//        }
//    }
//
//    protected String getNim() {
//        return nim;
//    }
//
//    protected String getNama() {
//        return nama;
//    }
//
//    protected String getAlamat() {
//        return alamat;
//    }
//
//    protected String getJurusan() {
//        return jurusan;
//    }
//}
