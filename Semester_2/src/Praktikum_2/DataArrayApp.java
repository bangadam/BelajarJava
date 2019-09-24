package Praktikum_2;


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

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;

    }

    public void SelectionSort() {
        int awal, i, min;
        for (awal=0; awal < nElemen-1;awal++) {
            min = awal;
            for(i = awal; i < nElemen; i++) {
                if(mhs[i].getNim() < mhs[min].getNim())
                    min = i;
            }
            swap(awal, min);
        }
    }

    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen ; curIn++) {
            Mahasiswa temp = mhs[curIn];

            i = curIn;

            while (i > 0 && mhs[i-1].getNim() >= temp.getNim()) {
                mhs[i] = mhs[i-1];
                i--;
            }
            mhs[i] = temp;
        }
    }

    public void SelectionSortByName() {
        int awal, i, min;

        for (awal=0; awal < nElemen-1;awal++) {
            min = awal;
            for(i = awal; i < nElemen; i++) {
                int compare = mhs[i].getNama().compareTo(mhs[min].getNama());
                if(compare < 0)
                    min = i;
            }

            swap(awal, min);
        }
    }

    public void InsertionSortByName() {
        int i, curIn;

        for (i = 0; i < nElemen ; i++) {
            for (curIn = 1; curIn < nElemen ; curIn++) {
                String one = mhs[curIn - 1].getNama();
                String two = mhs[curIn].getNama();
                if (one.compareTo(two) > 0) {
                    Mahasiswa temps = mhs[curIn - 1];
                    mhs[curIn - 1] = mhs[curIn];
                    mhs[curIn] = temps;
                }
            }
        }
    }
}


public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;

        arr = new DataArray(maxSize);

        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650240, "Dinda", "Bandung");

//        System.out.println("sebelum di urutkan");
//        arr.displayArray();
//        arr.BubbleSort();
//        arr.InsertionSort();
//        arr.SelectionSort();
//        System.out.println("setelah di urutkan by NIM");
//        arr.displayArray();

//        arr.SelectionSortByName();
//        arr.InsertionSortByName();
//        System.out.println("setelah di urutkan by Nama");
//        arr.displayArray();
    }
}
