package Praktikum_2;


public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 6;
        highArray arr;
        arr = new highArray(maxSize);

        // isi angka
        arr.insert(53);
        arr.insert(15);
        arr.insert(81);
        arr.insert(30);
        arr.insert(79);
        arr.insert(77);
//        arr.insert(45);

        System.out.print("\nSebelum di urutkan: ");

        arr.display();

        // Sorting with bubble sort
//        arr.BubbleSort();
        // Sorting with SelectionSort
//        arr.SelectionSort();
        // Sorting with InsertionSort
        arr.InsertionSort();

        System.out.print("\nSetelah di urutkan: ");

        arr.display();
        // ============ End Of Insert in Sorted Array ========= //
    }
}
