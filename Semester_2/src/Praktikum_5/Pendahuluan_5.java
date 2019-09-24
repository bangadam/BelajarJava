package Praktikum_5;

public class Pendahuluan_5 {
    private int arr[];
    private int nElemen;

    public Pendahuluan_5(int size) {
        arr = new int[size];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen ; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        int[] workspace = new int[nElemen];
        recMergeSort(workspace, 0, nElemen - 1);
    }

    public void recMergeSort(int[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;

            recMergeSort(workspace, lowerBound, mid);

            recMergeSort(workspace, mid + 1, upperBound);

            merge(workspace, lowerBound,  mid + 1, upperBound);
        }
    }

    public void merge(int[] workspace, int lowIndex, int hightIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = hightIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && hightIndex <= upperBound) {
            if (arr[lowIndex] < arr[hightIndex]) {
                workspace[j++] = arr[lowIndex++];
            } else {
                workspace[j++] = arr[hightIndex];
            }
        }

        while (lowIndex <= mid) {
            workspace[j++] = arr[lowIndex++];
        }

        while (hightIndex <= upperBound) {
            workspace[j++] = arr[hightIndex++];
        }

        for (int i = 0; i < nItem; i++) {
            arr[lowerBound + j] = workspace[j];
        }
    }

    public static void main(String[] args) {
        System.out.println("Merge sort :");
        Pendahuluan_5 test = new Pendahuluan_5(100);

        // masukkan data
        test.insert(10);
        test.insert(40);
        test.insert(50);
        test.insert(20);
        test.insert(90);
        test.insert(30);
        test.insert(60);
        test.insert(80);
        test.insert(70);

        // sebelum di gabung
        test.display();

        // proses menggabungkan
        test.mergeSort();

        // setelah di gabung
        test.display();

    }
}
