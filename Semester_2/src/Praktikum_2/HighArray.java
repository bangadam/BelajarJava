package Praktikum_2;

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

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen-1; batas > 0 ; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
//                    if (i >= 10) {
//                        System.out.println(i);
//                    }
                }
                this.display();
            }
        }
    }

    public void swap(int one, int two) {
//        System.out.print(arr[one] + " <=> " +arr[two]+ " | ");
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

    }

    public void SelectionSort() {
        int awal, i, min;

        for (awal=0; awal < nElemen-1;awal++) {
            min = awal;
            for(i = awal; i < nElemen; i++) {
                if(arr[i] < arr[min])
                    min = i;
            }

            swap(awal, min);
            this.display();
        }

    }

    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen ; curIn++) {
            int temp = arr[curIn];

            i = curIn;

            while (i > 0 && arr[i-1] >= temp) {
                arr[i] = arr[i-1];
                i--;
                this.display();
//                System.out.println("================While");
            }
            arr[i] = temp;
            this.display();
//            System.out.println("================FOR");
        }
    }
}
