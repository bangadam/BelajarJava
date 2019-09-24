package Praktikum_4;

public class LinkQueueApp {
    public static void main(String[] args) {
        Queue theQueue= new Queue();

        // tambahkan data
        theQueue.insert(1665100, "Dee");
        theQueue.insert(1665200, "Deaja");
        theQueue.displayQueue();

        // tambahkan data
        theQueue.insert(1665300, "Ami");
        theQueue.insert(1665400, "Haya");
        theQueue.insert(1665500, "Yati");
        theQueue.displayQueue();

        // hapus 2 data
        theQueue.remove();
        theQueue.remove();

        // tampilkan lagi
        theQueue.displayQueue();
    }
}
