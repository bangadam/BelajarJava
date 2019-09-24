package Praktikum_6;

class ArrayIn {

    private Mahasiswa[] arr;
    private int nItems;

    public ArrayIn(int maxSize) {
        arr = new Mahasiswa[maxSize];
        nItems = 0;
    }

    public void insert(long nim, String nama) {
        arr[nItems] = new Mahasiswa(nim, nama);
        nItems++;
    }

    public void display() {
        for (int i = 0; i < nItems; i++)
            System.out.println(arr[i].getNim() + " " + arr[i].getNama());
        System.out.println();
    }

    // untuk quick sort NIM
    public void quickSortNim() {
        recQuickSortNim(0, nItems - 1);
    }

    // untuk quick sort NAMA
    public void quickSortNama() {
        recQuickSortNama(0, nItems - 1);
    }

    // untuk rec quick sort NIM
    private void recQuickSortNim(int left, int right) {
        if (right - left <= 0)
            return;
        else {
            long pivot = arr[right].getNim();
            int partisi = partitionNim(left, right, pivot);
            recQuickSortNim(left, partisi - 1);
            recQuickSortNim(partisi + 1, right);
        }
    }

    // untuk recQUickSort NAMA
    private void recQuickSortNama(int left, int right) {
        if (right - left <= 0)
            return;
        else {
            String pivot = arr[right].getNama();
            int partisi = partitionNama(left, right, pivot);
            recQuickSortNama(left, partisi - 1);
            recQuickSortNama(partisi + 1, right);
        }
    }

    private void swap(int left, int right) {
        Mahasiswa temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // untuk partition NIM
    private int partitionNim(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && arr[++leftPtr].getNim() < pivot) ;
            while (rightPtr > left && arr[--rightPtr].getNim() > pivot) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return leftPtr;
    }

    // untuk partition NAMA
    private int partitionNama(int left, int right, String pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && arr[++leftPtr].getNama().compareTo(pivot) < 0) ;
            while (rightPtr > left && arr[--rightPtr].getNama().compareTo(pivot) > 0) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return leftPtr;
    }

    // untuk MERGE SORT NIM
    public void mergeSortNim() {
        mergeNim(arr, 0, nItems - 1);
    }

    // untuk MergeSort NIM
    private void recMergeSortNim(Mahasiswa[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Mahasiswa L[] = new Mahasiswa[n1];
        Mahasiswa R[] = new Mahasiswa[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getNim() <= R[j].getNim()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // untuk Merge NIM
    private void mergeNim(Mahasiswa[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeNim(arr, l, m);
            mergeNim(arr, m + 1, r);

            // Merge the sorted halves
            recMergeSortNim(arr, l, m, r);
        }
    }

    // untuk MERGE SORT NAMA
    public void mergeSortNama() {
        mergeNama(arr, 0, nItems - 1);
    }

    // untuk MergeSort NAMA
    private void recMergeSortNama(Mahasiswa[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Mahasiswa L[] = new Mahasiswa[n1];
        Mahasiswa R[] = new Mahasiswa[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getNama().compareTo(R[j].getNama()) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // untuk Merge NAMA
    private void mergeNama(Mahasiswa[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeNama(arr, l, m);
            mergeNama(arr, m + 1, r);

            // Merge the sorted halves
            recMergeSortNama(arr, l, m, r);
        }
    }

    // SHELL SORT

    // untuk shell sort nim
    void shellSortNim() {
        sortNim(arr);
    }

    // untuk shell sort nim
    int sortNim(Mahasiswa arr[])
    {
        int n = nItems;


        for (int gap = n/2; gap > 0; gap /= 2)
        {

            for (int i = gap; i < n; i += 1)
            {
                Mahasiswa temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap].getNim() > temp.getNim(); j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
        return 0;
    }

    // untuk shell sort NAMA
    void shellSortNama() {
        sortNama(arr);
    }

    // untuk sortNama
    int sortNama(Mahasiswa arr[])
    {
        int n = nItems;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                Mahasiswa temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap].getNama().compareTo(temp.getNama()) > 0; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
        return 0;
    }
}

public class Praktikum_6 {
    public static void main(String args[]) {

        int maxSize = 4;
        ArrayIn arr = new ArrayIn(maxSize);

        arr.insert(10, "Sandy");
        arr.insert(1, "Helmi");
        arr.insert(3, "Adam");
        arr.insert(17, "Syifa");
        System.out.println("==Data yang di inputkan==");
        arr.display();

        // MERGE SORT
//        System.out.println("==MergeSort berdasarkan nim==");
//        arr.mergeSortNim();
//        arr.display();
//
//        System.out.println("==MergeSort berdasarkan nama==");
//        arr.mergeSortNama();
//        arr.display();

        // SHELL SORT
        System.out.println("==ShellSort berdasarkan nim==");
        arr.shellSortNim();
        arr.display();
//
//        System.out.println("==ShellSort berdasarkan nama==");
//        arr.shellSortNama();
//        arr.display();

        // QUICK SORT
//        System.out.println("==QuickSort berdasarkan nim==");
//        arr.quickSortNim();
//        arr.display();
//
//        System.out.println("==QuickSort berdasarkan Nama==");
//        arr.quickSortNama();
//        arr.display();


    }
}
