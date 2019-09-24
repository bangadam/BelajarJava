package Praktikum_8;

class PendahuluanData {
    private int data;

    public PendahuluanData(int data) {
        this.data = data;
    }

    public int getKey() {
        return data;
    }
}

class PendahuluanHashTable {
    private PendahuluanData[] hashArray;
    private int size;

    public PendahuluanHashTable(int size) {
        this.size = size;
        hashArray = new PendahuluanData[size];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < size; i++) {
            if (hashArray[i] != null) {
                System.out.println(" | "+i+"\t | "+hashArray[i].getKey()+" | ");
            } else {
                System.out.println(" | "+i+"\t | -- |");
            }
        }
        System.out.println("");
    }

    public int hashFunction(int key) {
        return key % size;
    }

    public void insert(int data) {
        PendahuluanData item = new PendahuluanData(data);
        int key = item.getKey();
        int hashVal = hashFunction(key);
        while (hashArray[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
        }

        hashArray[hashVal] = item;
    }

    public PendahuluanData delete(int key) {
        int hashVal = hashFunction(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                PendahuluanData temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }

        return null;
    }

    public PendahuluanData find(int key) {
        int hashVal = hashFunction(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

}

public class Pendahuluan_1 {
    public static void main(String[] args) {
        PendahuluanHashTable table1 = new PendahuluanHashTable(15);

        // storing elements in this.table
        table1.insert(12);
        table1.insert(26);
        table1.insert(31);
        table1.insert(17);
        table1.insert(11);
        table1.insert(34);
        table1.insert(2);
        table1.insert(52);
        table1.insert(13);
        table1.insert(16);


        // displaying the Table
        table1.displayTable();
        table1.insert(26);
        table1.insert(18);
        table1.insert(21);
        table1.insert(76);
        table1.insert(43);
        table1.displayTable();
//        System.out.println("deleted.....");
//        table1.delete(11);
//        table1.displayTable();
//        System.out.println("Find it....");
//        if (table1.find(11) instanceof PendahuluanData) {
//            System.out.println("ketemu");
//        }
    }
}
