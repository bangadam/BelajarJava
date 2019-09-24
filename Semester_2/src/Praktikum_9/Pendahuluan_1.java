package Praktikum_9;

class Node {

    private int data;

    public Node(int key) {
        data = key;
    }

    public int getKey() {
        return data;
    }

    public void setKey(int id) {
        data = id;
    }
}


class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;
    private int jml;

    public Heap(int size) {
        maxSize = size;
        currentSize = 0;
        jml = 0;
        heapArray = new Node[size];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean insert(int key) {
        if (currentSize == maxSize) {
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    public void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heapArray[index];

        while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    public Node remove() {
        Node root = heapArray[0];

        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print(heapArray[i].getKey() + " ");
            } else {
                System.out.println("--");
            }
        }
        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "...................................";
        System.out.println(dots + dots);
        while (currentSize > 0) {
            if (column == 0) {
                for (int k = 0; k < nBlanks; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getKey());
            if (++j == currentSize) {
                break;
            }
            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else {
                for (int k = 0; k < nBlanks * 2 - 2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n" + dots + dots);
    }

    public void displayArray() {
        for (int j = 0; j < jml; j++) {
            System.out.print(heapArray[j].getKey() + " ");
        }
        System.out.println("");
    }

    public void change(int index, int value) {
        Node newNode = new Node(value);
        int oldValue = heapArray[index].getKey();
        if (oldValue > value) {
            heapArray[index] = newNode;
            trickleDown(index);
        } else {
            heapArray[index] = newNode;
            trickleUp(index);
        }
    }

    public void insertAt(int index, int value) {
        Node newNode = new Node(value);
        heapArray[index] = newNode;
        currentSize++;
        jml++;
    }

    public void HeapSort() {
        for (int j = jml - 1; j >= 0; j--) {
            for (int i = jml / 2 - 1; i >= 0; i--) {
                trickleDown(i);
            }
            Node remove = this.remove();
            heapArray[j] = remove;
        }
    }
}

public class Pendahuluan_1 {
    public static void main(String[] args) {
        int maxSize = 10;
        Heap heap = new Heap(maxSize);

        heap.insertAt(0, 5);
        heap.insertAt(1, 7);
        heap.insertAt(2, 1);
        heap.insertAt(3, 10);
        heap.insertAt(4, 8);
        heap.insertAt(5, 2);

        System.out.println("Array sebelum di urutkan");
        heap.displayArray();


        heap.HeapSort();
        System.out.println("\nArray sesudah di urutkan");
        heap.displayArray();
    }
}
