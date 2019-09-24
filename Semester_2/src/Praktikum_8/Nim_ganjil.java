package Praktikum_8;

class Data {

    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getKey() {
        return data;
    }
}

class HashTable {

    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | "
                        + hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | " + j + "\t | -- |");
            }
        }
        System.out.println("");
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public int hashFunc2(int key){
        return 7 - (key % 7);
    }

    public void insert(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int hashVal2 = hashFunc2(key);
        //tabrakan
        while (hashArray[hashVal] != null) {
            int hashValue = hashVal+hashVal2;
            hashVal = hashValue % size;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey()
                    == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public boolean find(int key) {
        int hashVal = hashFunc(key);
        int hashVal2 = hashFunc2(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key ) {
                return true;
            }
            int hashValue = hashVal+hashVal2;
            hashVal = hashValue % size;
        }

        return false;
    }
}

public class Nim_ganjil {
    public static void main(String[] args) {
        HashTable hash = new HashTable(10);
        hash.insert(15);
        hash.insert(18);
        hash.insert(25);
        hash.insert(28);
        hash.insert(36);
        hash.insert(10);

        hash.displayTable();


        int key = 28;

        System.out.println("Cari nilai = "+key);
        if (hash.find(key)) {
            System.out.println("Nilai "+key+" ditemukan");
        } else {
            System.out.println("Nilai "+key+" tidak ditemukan");
        }
    }
}