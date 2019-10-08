package Praktikum_1;


class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return null;
        } else {
            return mhs[i];
        }
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }

        if (i == nElemen) {
            return false;
        } else {
            for (int j = 0; j < nElemen; j++) {
                mhs[j] = mhs[j+ 1];
            }

            nElemen--;
            return true;
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}


public class    DataArrayApp {
    public static void main(String[ ] args) {
        int maxSize = 100;
        DataArray arr;

        arr = new DataArray(maxSize);

        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650280, "Arina", "Malang");

        arr.displayArray();

        long searchKey = 16650240;
        Mahasiswa mhs = arr.find(searchKey);
        if (mhs != null) {
            System.out.println("\nKetemu");
            mhs.displayMhs();
        } else {
            System.out.println("Ga ketemu " + searchKey);
        }

        searchKey = 16650240;
        System.out.println("\nHapus nim: "+ searchKey);
        arr.delete(searchKey);

        arr.displayArray();
    }
}
