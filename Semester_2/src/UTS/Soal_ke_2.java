package UTS;

class Warga {
    private String nama_kepala;
    private int jumlah_keluarga;
    private String alamat;
    private int nomer_rumah;

    public Warga(
            String nama_kepala,
            int jumlah_keluarga,
            String alamat,
            int nomer_rumah
    ) {
        this.nama_kepala = nama_kepala;
        this.jumlah_keluarga = jumlah_keluarga;
        this.alamat = alamat;
        this.nomer_rumah = nomer_rumah;
    }

    public String getNamaKepala() {
        return nama_kepala;
    }
    public int getNomer_rumah() {
        return nomer_rumah;
    }

    public int getJumlah_keluarga() {
        return jumlah_keluarga;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNomerRumah() {
        return nomer_rumah;
    }
}

class WargaApp {
    private Warga[] warga;
    public int nElemen;

    public WargaApp(int max) {
        warga = new Warga[max];
        nElemen = 0;
    }

    public void insert(
            String nama_kepala,
            int jumlah_keluarga,
            String alamat,
            int nomer_rumah
    ) {
        if (this.checkNamaKepala(nama_kepala)) {
            System.out.println(nama_kepala+" sudah terdaftar");
            System.out.println(
                    "Kepala Keluarga: "+nama_kepala+
                    ", Anggota: "+ jumlah_keluarga +" Orang" +
                    ", Alamat: "+ alamat +
                    ", No: "+ nomer_rumah
            );
        } else {
            warga[nElemen] = new Warga(nama_kepala, jumlah_keluarga, alamat, nomer_rumah
            );
            nElemen++;
        }
    }

    boolean checkNamaKepala(String nama_kepala) {
        for (int i = 0; i < nElemen; i++) {
            if (nama_kepala == warga[i].getNamaKepala()) {
                return true;
            }
        }

        return false;
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (warga[i].getNomer_rumah() > warga[i + 1].getNomer_rumah()) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void swap(int one, int two) {
        Warga temp = warga[one];
        warga[one] = warga[two];
        warga[two] = temp;

    }

    public void tampilData() {
        int no = 1;
        for (int i = 0; i < nElemen; i++) {
            System.out.println(
                    no++ +"." +
                    " Kepala Keluarga : " + warga[i].getNamaKepala() +
                    ", Anggota : " + warga[i].getJumlah_keluarga() +" Orang" +
                    ", Alamat : " + warga[i].getAlamat() +
                    ", No : " + warga[i].getNomer_rumah()
            );
        }

        System.out.println();
    }

    public int jumlahKepalaDanAnggota(int n) {
        if (n - 1 < 0) {
            return 0;
        } else {
            return (warga[n-1].getJumlah_keluarga() + 1) + jumlahKepalaDanAnggota(n-1);
        }
    }
}

public class Soal_ke_2 {
    public static void main(String[] args) {
        int max = 10;
        WargaApp warga = new WargaApp(max);

        // tambah data warga baru
        warga.insert("adam", 5, "mojokerto", 10);
        warga.insert("qoheng", 6, "jember", 56);
        warga.insert("andy", 2, "malang", 90);
        warga.insert("syifa", 10, "blitar", 45);


        System.out.println("Data Warga :");
        warga.tampilData();

        System.out.println("==tambah nama yang sudah ada==");
        warga.insert("qoheng", 5, "jombang", 67);

        System.out.println("==tambah data warga baru==");
        warga.insert("lindo", 4, "ngawi", 67);
        warga.insert("sandy", 2, "jakarta", 43);
        warga.insert("hafiz", 5, "sidoarjo", 46);
        warga.insert("helmi", 5, "surabaya", 32);
        warga.insert("lingga", 5, "jombang", 67);
        warga.insert("inna", 5, "tulungagung", 55);
        warga.tampilData();

        System.out.println("==Pengurutan berdasarkan No. rumah menggunakan BubbleSort==");
        warga.BubbleSort();
        warga.tampilData();

        System.out.println("==Jumlah semua warga RT 04 adalah "+ warga.jumlahKepalaDanAnggota(max));
    }
}
