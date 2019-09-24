package Exercise_2;


public class SelectionSort {
    public static void swapElements(double[] array, int i, int j) {
            double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int indexLowest(double[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

    public static void munculDataArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static double[] createNumberRandom(int limit) {
        double[] angka = new double[limit];

        for (int i = 0; i <angka.length ; i++) {
            angka[i] = randomFill();
        }

        return angka;
    }

    public static double randomFill() {
        double randomNum = 1 + Math.random() * (100 - 1);
        return randomNum;
    }

    public static double[] bulatkan(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(array[i]);
        }
        return array;
    }

    public static void findDupicateInArray(double[] array) {
        for (int i = 0; i < array.length; i++)
        {
            int sama = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    sama++;
                }
            }
                System.out.println(array[i] + " => " + sama);
        }
    }


    public static void main(String[] args) {
//        double[] angka = createNumberRandom(10000);
        double[] angka = {3.0,1.0,2.0,5.0};
        System.out.println("angka random sebelum di urutkan");
        munculDataArray(angka);
        System.out.println("Jumlah angka = "+angka.length);

        long start = System.currentTimeMillis();

        selectionSort(angka);

        long end = System.currentTimeMillis();
        long result = (end - start);
//        long seconds = (result / 1000);

        System.out.println("angka random setelah di urutkan");
        munculDataArray(angka);
        System.out.println("waktu proses "+result+ " Milliseconds");

//        System.out.println("angka setelah dibulatkan :");
//        munculDataArray(bulatkan(angka));

//        findDupicateInArray(angka);


//        munculDataArray(angka);
    }
}
