package Praktikum_6;

public class Pendahuluan_3 {
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void ShellSort(int[] arr) {
        int in, out;
        int temp;
        int h = arr.length / 2;

        while (h > 0) {
            for (out = h;  out < arr.length ; out++) {
                temp = arr[out];
                in = out;
                System.out.print(temp+" ");
                while (in > h-1 && arr[in - h] >= temp) {
                    arr[in] = arr[in-h];
                    in -= h;
                }
                arr[in] = temp;
            }
            System.out.println();
            h /= 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 3,67,30,20};
        System.out.println("Array before sorting");
        printArray(arr);
        System.out.println();

        Pendahuluan_3 ob = new Pendahuluan_3();
        ob.ShellSort(arr);

        System.out.println();
        System.out.println("Array after sorting");
        printArray(arr);
    }

}
