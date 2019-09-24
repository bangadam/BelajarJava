package Praktikum_1;

class highArray {
    private int[] arr;
    private int nElemen;

    public highArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void  insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int nilaiDicari) {
        int batasBawah = 0, batasAtas = arr.length-1;

        while(batasBawah <= batasAtas) {
            int tengah = batasBawah + ((batasAtas - batasBawah) / 2);

            if(arr[tengah] <= nilaiDicari)
                return true;
            else if(nilaiDicari < arr[tengah])
                batasAtas = tengah - 1;
            else
                batasBawah = tengah + 1;
        }
        return false;
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++)
                arr[j] = arr[j + 1];
        }
        nElemen--;
        return true;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void size() {

        System.out.println("Jumlah elemen array = "+this.arr.length);

    }

    public void BubbleSort(int batas) {
        int i,n = 1;

        for (i = 0; i < batas ; i++) {
            if (arr[i] > arr[i +1]) {
                swap(i, i + i);
                System.out.println(n++);
            }
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    //buat method untuk mengurutkan
    public int sorted(int value) {
        if (nElemen >= arr.length)
            return nElemen;

        int i;
        for(i = nElemen-1; (i >= 0 && arr[i] > value); i--)
            arr[i+1] = arr[i];

        arr[i+1] = value;

        return nElemen++;
    }
}

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 10;
        highArray arr;
        arr = new highArray(maxSize);

        // ============ Start Of Insert in Sorted Array ========= //
        // isi angka
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
        arr.insert(53);
        arr.insert(77);
        arr.insert(79);
        arr.insert(81);
        arr.insert(90);
        
        // ============ Start Of Insert in Sorted Array ========= //
        int value = 80;

//        arr.display();
        arr.sorted(value);
        arr.display();

//        if (arr.find(value))
//            System.out.println("Nilai Ditemukan " + value);
//        else {
//            System.out.println("Nilai tidak ditemukan");
//        }
    }
}
